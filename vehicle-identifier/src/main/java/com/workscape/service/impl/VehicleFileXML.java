package com.workscape.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.workscape.dto.Vehicle;
import com.workscape.dto.Vehicles;
import com.workscape.service.IVehicleFile;
import com.workscape.service.VehicleType;
import com.workscape.service.VehicleTypeFactory;
import com.workscape.utility.VehicleHelper;
import com.workscape.utility.XMLUtils;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class VehicleFileXML implements IVehicleFile {

	public VehicleType readFile(File inputFile) {
		VehicleType vehicleType =null;
		
		try {

			Vehicles vehicles = XMLUtils.unmarshal(inputFile);
			if (vehicles != null) {
				List<String> vehicalList = new ArrayList<String>();
				Map<String, String> hm = new HashMap<String, String>();
				for (Vehicle vehicle : vehicles.getVehicles()) {
					vehicleType = VehicleTypeFactory.getVehicleType(vehicle);
					if (vehicleType != null) {
						vehicalList.add(vehicleType.getVehiclType());
						hm.put(vehicle.getId(), vehicleType.getVehiclType());
					}
				}

				if (vehicalList.size() > 0) {
					System.out.println("======== Report Summary ==========");
					System.out.println("----------------------------------");
					System.out.println("Vehicle Id            Vehicle Type");
					System.out.println("----------------------------------");

					for (String key : hm.keySet()) {

						System.out.println(key + "          " + hm.get(key));
					}

					// System.out.println("====================================");

					Set<String> uniqueSet = new HashSet<String>(vehicalList);
					System.out.println("-------------------------------------");
					System.out.println("VehicleType          Count Of Vehicle");
					System.out.println("-------------------------------------");
					for (String temp : uniqueSet) {
						System.out.println(temp + " :              "
								+ Collections.frequency(vehicalList, temp));
					}
					System.out.println("-------------------------------------");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vehicleType;
	}

	/**
	 * This method is used for create new input XML
	 */
	public boolean writeFile(File inputFile) {
		if(inputFile!=null){
		try {
			XMLUtils.marshal(VehicleHelper.getVehicals(), inputFile);
			System.out.println("XML generated at location "+inputFile);
			return true;
		} catch (Exception e) {
			return false;
		}
		}
		return false;
	}

}
