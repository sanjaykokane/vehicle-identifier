package com.workscape.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.workscape.dto.Vehicles;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class XMLUtils {

	/**
	 * This method is creating input XML file using vehicles object and stored the XML in file location
	 * 
	 * @param vehicle
	 * @param fileName
	 * @throws IOException
	 * @throws JAXBException
	 */
    public static void marshal(Vehicles vehicle, File fileName)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(fileName));
        context = JAXBContext.newInstance(Vehicles.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(vehicle, writer);
        writer.close();
    }
 
   /**
    * This method is used for parse the input XML and return the vehicles object
    * 
    * @param importFile
    * @return
    */
	public static Vehicles unmarshal(File importFile) {
		Vehicles vehicle = null;
		JAXBContext context;
		if (importFile != null) {
			try {
				System.out.println("XML file location ::"+importFile);
				context = JAXBContext.newInstance(Vehicles.class);
				Unmarshaller um = context.createUnmarshaller();
				vehicle = (Vehicles) um.unmarshal(importFile);
			} catch (JAXBException e) {
				System.out
						.println("Parsing Exception :: Please Enter valid file path and valid XML");
				System.out
						.println("---------------------------------------------------------------------\n\n");
			}
		}
		return vehicle;
	}
}
