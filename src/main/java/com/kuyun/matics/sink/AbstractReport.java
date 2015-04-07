package com.kuyun.matics.sink;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kuyun.matics.Metrics;
import com.kuyun.matics.core.MetricContext;
import com.kuyun.matics.core.TimePolice;
import com.kuyun.matics.filter.FilterChain;

@Component
public abstract class AbstractReport implements IReporter{
	@Autowired
	protected FilterChain filterChain ;
	@Autowired
	protected TimePolice timer;
	@Autowired
	private MetricContext metricContext ;
	public void start(){
		_report();
	}
	private void _report() {
		List<Metrics> metricsList = metricContext.getMetricsList();
		if(metricsList != null && metricsList.size() > 0){
			ScheduledExecutorService  exec = Executors.newScheduledThreadPool(metricsList.size());
			for(final Metrics metrics : metricsList){
				if(filterChain != null){
					filterChain.doFilter(metrics, filterChain); 
				}
				Thread thread = new Thread(new Runnable(){
					public void run() {
						report(metrics.key(),metrics.value());
					}
				});
				thread.setName("metrics: " + metrics.key());
				exec.scheduleAtFixedRate(thread,timer.startMillis,timer.intervalMillis,timer.timeUnit);
			}
		}
	}
	public FilterChain getChain() {
		return filterChain;
	}
	public void setChain(FilterChain chain) {
		this.filterChain = chain;
	}
	public TimePolice getTimer() {
		return timer;
	}
	public void setTimer(TimePolice timer) {
		this.timer = timer;
	}
	public MetricContext getMetricContext() {
		return metricContext;
	}
	public void setMetricContext(MetricContext metricContext) {
		this.metricContext = metricContext;
	}
	
}
