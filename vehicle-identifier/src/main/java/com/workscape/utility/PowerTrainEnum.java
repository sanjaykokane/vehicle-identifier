package com.workscape.utility;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public enum PowerTrainEnum {
	HUMAN("Human"),
	INTERNAL_COMBATION("Internal Combation"),
	BURNOILLI("Burnolli");
	
	 private String name;

    private PowerTrainEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
