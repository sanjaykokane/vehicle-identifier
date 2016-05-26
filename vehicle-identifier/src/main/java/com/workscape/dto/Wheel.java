package com.workscape.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wheel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wheel {

	private String position;
	private String material;

	public Wheel() {
		// TODO Auto-generated constructor stub
	}

	public Wheel(String material, String position) {
		this.material = material;
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
