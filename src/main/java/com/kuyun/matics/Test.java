package com.kuyun.matics;

import com.kuyun.matics.core.MetricContext;
import com.kuyun.matics.sink.ConsoleReport;
import com.kuyun.matics.sink.IReporter;
import com.kuyun.matics.util.BeanUtil;

public class Test {

	public static void main(String[] args) {
		
	    MetricContext context = BeanUtil.getBean("metricContext",MetricContext.class); 
	    BasicMatrics mts = new BasicMatrics();
	    mts.setName("aa");
	    mts.setValue("34");
	    context.regist(mts);
	    BasicMatrics mts1 = new BasicMatrics();
	    mts1.setName("bb");
	    mts1.setValue("31114");
	    context.regist(mts1);
		IReporter reporter = BeanUtil.getBean("consoleReport",ConsoleReport.class); 
		reporter.start();
	}

}
