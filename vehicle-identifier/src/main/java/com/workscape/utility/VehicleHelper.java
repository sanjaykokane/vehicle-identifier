package com.workscape.utility;

import java.util.ArrayList;

import com.workscape.dto.Frame;
import com.workscape.dto.PowerTrain;
import com.workscape.dto.Vehicle;
import com.workscape.dto.Vehicles;
import com.workscape.dto.Wheel;
import com.workscape.dto.Wheels;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class VehicleHelper {

	/**
	 * This is a static method which will return vehicles object. Using this object we can create input XML files
	 * 
	 * @return
	 */
	public static Vehicles getVehicals() {
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicles(new ArrayList<Vehicle>());
		
		Vehicle v1 = new Vehicle();
		v1.setId("Vehicle 1");
		v1.setFrame(new Frame(FrameEnum.PLASTIC.getName()));
		v1.setPowerTrain(new PowerTrain(PowerTrainEnum.HUMAN.getName()));
		Wheels wheels = new Wheels();
		wheels.setWheels(new ArrayList<Wheel>());
		wheels.getWheels().add(new Wheel(FrameEnum.PLASTIC.getName(), PositionEnum.REAR_LEFT.getName()));
		wheels.getWheels().add(new Wheel(FrameEnum.PLASTIC.getName(), PositionEnum.REAR_RIGHT.getName()));
		wheels.getWheels().add(new Wheel(FrameEnum.PLASTIC.getName(), PositionEnum.FRONT.getName()));
		v1.setWheels(wheels);
		vehicles.getVehicles().add(v1);

		Vehicle v2 = new Vehicle();
		v2.setId("Vehicle 2");
		v2.setFrame(new Frame(FrameEnum.METAL.getName()));
		v2.setPowerTrain(new PowerTrain(PowerTrainEnum.HUMAN.getName()));
		Wheels wheels2 = new Wheels();
		wheels2.setWheels(new ArrayList<Wheel>());
		wheels2.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.REAR.getName()));
		wheels2.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.FRONT.getName()));
		v2.setWheels(wheels2);
		vehicles.getVehicles().add(v2);
		
		Vehicle v3 = new Vehicle();
		v3.setId("Vehicle 3");
		v3.setFrame(new Frame(FrameEnum.METAL.getName()));
		v3.setPowerTrain(new PowerTrain(PowerTrainEnum.INTERNAL_COMBATION.getName()));
		Wheels wheels3 = new Wheels();
		wheels3.setWheels(new ArrayList<Wheel>());
		wheels3.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.REAR.getName()));
		wheels3.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.FRONT.getName()));
		v3.setWheels(wheels3);
		vehicles.getVehicles().add(v3);
		
		Vehicle v4 = new Vehicle();
		v4.setId("Vehicle 4");
		v4.setFrame(new Frame(FrameEnum.PLASTIC.getName()));
		v4.setPowerTrain(new PowerTrain(PowerTrainEnum.BURNOILLI.getName()));
		vehicles.getVehicles().add(v4);
		
		Vehicle v5 = new Vehicle();
		v5.setId("Vehicle 5");
		v5.setFrame(new Frame(FrameEnum.METAL.getName()));
		v5.setPowerTrain(new PowerTrain(PowerTrainEnum.INTERNAL_COMBATION.getName()));
		Wheels wheels5 = new Wheels();
		wheels5.setWheels(new ArrayList<Wheel>());
		wheels5.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.REAR_LEFT.getName()));
		wheels5.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.REAR_RIGHT.getName()));
		wheels5.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.FRONT_RIGHT.getName()));
		wheels5.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.FRONT_LEFT.getName()));
		v5.setWheels(wheels5);
		vehicles.getVehicles().add(v5);
		
		Vehicle v6 = new Vehicle();
		v6.setId("Vehicle 6");
		v6.setFrame(new Frame(FrameEnum.METAL.getName()));
		v6.setPowerTrain(new PowerTrain(PowerTrainEnum.HUMAN.getName()));
		Wheels wheels6 = new Wheels();
		wheels6.setWheels(new ArrayList<Wheel>());
		wheels6.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.REAR.getName()));
		wheels6.getWheels().add(new Wheel(FrameEnum.METAL.getName(), PositionEnum.FRONT.getName()));
		v6.setWheels(wheels6);
		vehicles.getVehicles().add(v6);
		
		Vehicle v7 = new Vehicle();
		v7.setId("Vehicle 7");
		v7.setFrame(new Frame(FrameEnum.PLASTIC.getName()));
		v7.setPowerTrain(new PowerTrain(PowerTrainEnum.BURNOILLI.getName()));
		vehicles.getVehicles().add(v7);


		return vehicles;
	}
}
