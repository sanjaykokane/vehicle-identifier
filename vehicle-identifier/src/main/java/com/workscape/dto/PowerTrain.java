package com.workscape.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "powerTrain")
@XmlAccessorType (XmlAccessType.FIELD)
public class PowerTrain {
	
	private String type;

	public PowerTrain() {
		// TODO Auto-generated constructor stub
	}
	public PowerTrain(String type) {
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
