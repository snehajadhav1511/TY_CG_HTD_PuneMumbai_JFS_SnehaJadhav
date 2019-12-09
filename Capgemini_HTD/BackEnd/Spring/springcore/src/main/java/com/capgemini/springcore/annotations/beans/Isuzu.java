package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class Isuzu implements Engine{

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "Isuzu-4-Stroke Petrol";
	}
	

}
