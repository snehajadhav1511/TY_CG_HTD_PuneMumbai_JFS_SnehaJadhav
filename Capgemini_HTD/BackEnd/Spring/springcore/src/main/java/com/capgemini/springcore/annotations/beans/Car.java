package com.capgemini.springcore.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.springcore.interfaces.Engine;

public class Car {
	
	private int modelNo;
	private String modelName;
	@Autowired
	private Engine engine;               //java based
	
	//all getter and setter
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


}//End of class
