package com.workscape.utility;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public enum FrameEnum {
	PLASTIC("Plastic"),
	METAL("Metals");
	
	 private String name;

    private FrameEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
