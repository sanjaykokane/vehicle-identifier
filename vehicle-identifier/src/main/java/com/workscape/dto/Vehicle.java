package com.workscape.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType (XmlAccessType.FIELD)
public class Vehicle 
{
	private String id;
	private Frame frame;
	private PowerTrain powerTrain;
		
	private Wheels wheels;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
		
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public Wheels getWheels() {
		return wheels;
	}
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	public PowerTrain getPowerTrain() {
		return powerTrain;
	}
	public void setPowerTrain(PowerTrain powerTrain) {
		this.powerTrain = powerTrain;
	}
	
	
	
	
}
