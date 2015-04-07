package com.kuyun.matics.filter;

import java.util.ArrayList;
import java.util.List;

import com.kuyun.matics.Metrics;
 
public class FilterChain implements MetricsFilter {  
    List<MetricsFilter> filters = new ArrayList<MetricsFilter>();  
    private int index = 0;  
 
    public FilterChain addFilter(MetricsFilter f) {  
        this.filters.add(f);  
        return this;  
    }  
 
    @Override 
    public void doFilter(Metrics m, FilterChain chain) {  
        if (filters == null || index == filters.size()) { 
        	index = 0;
            return;  
        }
        MetricsFilter f = filters.get(index);  
        index++;  
        f.doFilter(m, chain);  
    }

	public List<MetricsFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<MetricsFilter> filters) {
		this.filters = filters;
	}  
    
}  