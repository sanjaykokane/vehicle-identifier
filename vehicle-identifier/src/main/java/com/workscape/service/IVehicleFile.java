package com.workscape.service;

import java.io.File;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public interface IVehicleFile {

	public VehicleType readFile(File inputFile);

	public boolean writeFile(File inputFile);

}
