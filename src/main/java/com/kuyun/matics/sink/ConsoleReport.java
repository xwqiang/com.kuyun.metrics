package com.kuyun.matics.sink;




public class ConsoleReport extends AbstractReport{
	private static int count = 0;
	@Override
	public void report(String name, String value) {
		System.out.println((++count) + "   " + name + ":" + value);
	}
}
