package com.kuyun.matics.filter;

import com.kuyun.matics.Metrics;


public interface MetricsFilter {
	public void doFilter(Metrics m, FilterChain chain);
}
