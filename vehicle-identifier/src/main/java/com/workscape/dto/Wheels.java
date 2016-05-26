package com.workscape.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wheels")
@XmlAccessorType (XmlAccessType.FIELD)
public class Wheels {
	
	@XmlElement(name = "wheel")
	private List<Wheel> wheels =null;

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	
}
