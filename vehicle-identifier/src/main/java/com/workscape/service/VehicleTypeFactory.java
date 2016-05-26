package com.workscape.service;

import java.util.List;

import com.workscape.dto.Vehicle;
import com.workscape.dto.Wheel;
import com.workscape.utility.FrameEnum;
import com.workscape.utility.PositionEnum;
import com.workscape.utility.PowerTrainEnum;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class VehicleTypeFactory {

	/**
	 * This method will accept vehicle object which is having all vehicle characteristics and 
	 * using this value method will return vehicle type.
	 * 
	 * @param vehicle
	 * @return
	 * @throws Exception
	 */
	public static VehicleType getVehicleType(Vehicle vehicle) throws Exception {

		boolean front,rearLeft,rearRight,rear,frontRight,frontLeft;
		
		// This logic is for Big Wheel
		if((vehicle.getFrame().getMaterial().equals(FrameEnum.PLASTIC.getName()))
			&& (vehicle.getPowerTrain().getType().equals(PowerTrainEnum.HUMAN.getName())) 
			&& (vehicle.getWheels().getWheels().size()==3 ) ){
			List<Wheel> wheels = vehicle.getWheels().getWheels();
			front=false;rearLeft=false;rearRight=false;
			for (Wheel wheel : wheels) {
				if(wheel.getPosition().equals(PositionEnum.FRONT.getName()))
					front=true;
				else if(wheel.getPosition().equals(PositionEnum.REAR_LEFT.getName()))
					rearLeft=true;
				else if(wheel.getPosition().equals(PositionEnum.REAR_RIGHT.getName()))
					rearRight=true;
			}
			if(front && rearLeft && rearRight)
				return new BigWheel();
			
		}
		
		//This logic is for Bicycle
		else if((vehicle.getFrame().getMaterial().equals(FrameEnum.METAL.getName()))
				&& (vehicle.getPowerTrain().getType().equals(PowerTrainEnum.HUMAN.getName())) 
				&& (vehicle.getWheels().getWheels().size()==2) ){
				
				List<Wheel> wheels = vehicle.getWheels().getWheels();
				front=false;rear=false;
				for (Wheel wheel : wheels) {
					if(wheel.getPosition().equals(PositionEnum.FRONT.getName()))
						front=true;
					else if(wheel.getPosition().equals(PositionEnum.REAR.getName()))
						rear=true;
				}
				if(front && rear)
					return new BiCycle();
		}
			
	   // This logic is for motorCycle	
		else if((vehicle.getFrame().getMaterial().equals(FrameEnum.METAL.getName()))
				&& (vehicle.getPowerTrain().getType().equals(PowerTrainEnum.INTERNAL_COMBATION.getName())) 
				&& (vehicle.getWheels().getWheels().size()==2) ){
				
			List<Wheel> wheels = vehicle.getWheels().getWheels();
			front=false;rear=false;
			for (Wheel wheel : wheels) {
				if(wheel.getPosition().equals(PositionEnum.FRONT.getName()))
					front=true;
				else if(wheel.getPosition().equals(PositionEnum.REAR.getName()))
					rear=true;
			}
			if(front && rear)
				return new MotorCycle();
		}
		
		// This logic is for car
		else if((vehicle.getFrame().getMaterial().equals(FrameEnum.METAL.getName()))
				&& (vehicle.getPowerTrain().getType().equals(PowerTrainEnum.INTERNAL_COMBATION.getName())) 
				&& (vehicle.getWheels().getWheels().size()==4) ){
			
			List<Wheel> wheels = vehicle.getWheels().getWheels();
			rearLeft=false;rearRight=false;frontRight=false;frontLeft=false;
			for (Wheel wheel : wheels) {
				if(wheel.getPosition().equals(PositionEnum.REAR_LEFT.getName()))
					rearLeft=true;
				else if(wheel.getPosition().equals(PositionEnum.REAR_RIGHT.getName()))
					rearRight=true;
				else if(wheel.getPosition().equals(PositionEnum.FRONT_RIGHT.getName()))
					frontRight=true;
				else if(wheel.getPosition().equals(PositionEnum.FRONT_RIGHT.getName()))
					frontLeft=true;
			}
			if(rearLeft && rearRight && frontRight && frontLeft)
				return new Car();
			
		}
				
		
		// This logic is for Hang Gliders
		else if((vehicle.getFrame().getMaterial().equals(FrameEnum.PLASTIC.getName()))
				&& (vehicle.getPowerTrain().getType().equals(PowerTrainEnum.BURNOILLI.getName())) 
				&& (vehicle.getWheels()==null) )
				return new HangGlider();
		else {
			System.out.println("No such vehical type!!");
			return null;
		}
		return null;
	}

}
