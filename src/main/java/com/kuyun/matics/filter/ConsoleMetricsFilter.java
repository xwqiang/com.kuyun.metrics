package com.kuyun.matics.filter;

import com.kuyun.matics.Metrics;

/**
 * @author admin
 *
 */
public class ConsoleMetricsFilter implements MetricsFilter{
	public void doFilter(Metrics m, FilterChain chain){
		System.err.println("console............" + m.key());
		chain.doFilter(m, chain);
	}
}
