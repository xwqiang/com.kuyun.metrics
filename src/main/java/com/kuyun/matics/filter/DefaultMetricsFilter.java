package com.kuyun.matics.filter;

import com.kuyun.matics.Metrics;

/**
 * @author admin
 *
 */
public class DefaultMetricsFilter implements MetricsFilter{
	public void doFilter(Metrics m, FilterChain chain){
		System.err.println(" add , name : " + m.key());
		chain.doFilter(m, chain);
	}
}
