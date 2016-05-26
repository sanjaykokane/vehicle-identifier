package com.workscape.utility;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public enum PositionEnum {
	
	FRONT("front"), 
	REAR("rear"), 
	REAR_LEFT("rear left"), 
	REAR_RIGHT("rear right"), 
	FRONT_RIGHT("front right"), 
	FRONT_LEFT("front left");

	private String name;

	private PositionEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
