package com.kuyun.matics;

import java.util.concurrent.atomic.AtomicLong;

public class CountMatric extends BasicMatrics{
	private static AtomicLong count;
	public static long inc(long num){
		return count.addAndGet(num);
	}
	public static long desc(long num){
		return inc(-num);
	}
	public String key(String key) {
		return key;
	}
}
