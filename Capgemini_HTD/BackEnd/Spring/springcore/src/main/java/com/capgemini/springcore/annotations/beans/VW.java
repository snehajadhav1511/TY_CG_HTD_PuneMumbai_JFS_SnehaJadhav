package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VW implements Engine{

	@Override
	public int getCC() {
		return 1300;
	}

	@Override
	public String getType() {
		return "VW-4-stroke Diesel";
	}

}
