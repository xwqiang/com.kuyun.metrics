package com.kuyun.matics.core;

import java.util.concurrent.TimeUnit;

public class TimePolice implements Timer{
	public TimeUnit timeUnit = TimeUnit.MILLISECONDS;
	public long intervalMillis ;
	public long startMillis;
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}
	public long getIntervalMillis() {
		return intervalMillis;
	}
	public void setIntervalMillis(long intervalMillis) {
		this.intervalMillis = intervalMillis;
	}
	public long getStartMillis() {
		return startMillis;
	}
	public void setStartMillis(long startMillis) {
		this.startMillis = startMillis;
	}
	
}
