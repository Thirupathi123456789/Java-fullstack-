package com.simplilearn.abstraction;

public abstract class CarAbstract implements CarDesign{

	private String model;
	public CarAbstract(String model)
	{
		this.model=model;
	}
	public void start() {
		System.out.println("Car Started");
		
	}
	public void stop() {
		System.out.println("car stopped");
		
	}
	abstract public void powerEngine();

}
