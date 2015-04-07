package com.kuyun.matics;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public interface Metrics extends Serializable{
	public String key();
	public String value();
}
