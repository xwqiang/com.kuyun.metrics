package com.kuyun.matics.core;

import java.util.ArrayList;
import java.util.List;

import com.kuyun.matics.Metrics;
public class MetricContext {
	private List<Metrics> metrics_list ;
	public MetricContext regist(Metrics mts){
		if(metrics_list == null){
			metrics_list = new ArrayList<Metrics>();
			metrics_list.add(mts);
		}else{
			metrics_list.add(mts);
		}
		return this;
	}
	public List<Metrics> getMetricsList(){
		return metrics_list;
	}
	public int metrics_size(){
		return metrics_list == null ? 0 : metrics_list.size();
	}
	public List<Metrics> getMetrics_list() {
		return metrics_list;
	}
	public void setMetrics_list(List<Metrics> metrics_list) {
		this.metrics_list = metrics_list;
	}
	
}
