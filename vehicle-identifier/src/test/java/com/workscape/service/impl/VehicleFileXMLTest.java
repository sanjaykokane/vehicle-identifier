package com.workscape.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class VehicleFileXMLTest {
	
	static File inputFile;
	static VehicleFileXML vehicleXML;
	
	@BeforeClass
    public static void oneTimeSetUp() {
		vehicleXML = new VehicleFileXML();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		inputFile = new File(classloader.getResource("vehicle.xml").getFile());     
    }

    @AfterClass
     public static void oneTimeTearDown() {
    	inputFile = null;
    }
    
    @Test
	public void testwriteFileForNullInput(){
		assertFalse(vehicleXML.writeFile(null));
	}
    
    @Test
	public void testwriteFile(){
		assertTrue(vehicleXML.writeFile(inputFile));
	}
    
	@Test
	public void testReadFileForNullInput(){
		assertNull(vehicleXML.readFile(null));
	}
	
	@Test
	public void testReadFile(){
		assertNotNull(vehicleXML.readFile(inputFile));
	}
	
	
}
