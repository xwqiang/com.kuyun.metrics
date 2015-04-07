package com.kuyun.matics;

import java.util.concurrent.atomic.AtomicLong;

public class CountMatric extends BasicMatrics{
	private AtomicLong count;
	public  long inc(long num){
		return count.addAndGet(num);
	}
	public  long desc(long num){
		return inc(-num);
	}
	public String key(String key) {
		return key;
	}
}
