package com.workscape.utility;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.workscape.dto.Vehicles;

public class XMLUtilsTest {

	private static Vehicles vehicles =null;
	
	@BeforeClass
    public static void setUp() {
		vehicles = VehicleHelper.getVehicals();
    }
	
	@Test
	public void unmarshalTest(){
		File importFile = new File("c:/temp/vehicle2.xml");
		Vehicles unmarshal = XMLUtils.unmarshal(importFile );
		assertNotNull(unmarshal);
		
	}
	
	@Test
	public void marshalTest(){
		
		File exportFile = new File("c:/temp/vehicle2.xml");
		try {
			XMLUtils.marshal(vehicles, exportFile);
			assertTrue(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
