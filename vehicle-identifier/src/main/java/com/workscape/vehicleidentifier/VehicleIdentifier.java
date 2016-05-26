package com.workscape.vehicleidentifier;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBException;

import com.workscape.service.IVehicleFile;
import com.workscape.service.impl.VehicleFileXML;

/**
 * 
 * @author Sanjay.kokane
 *
 */
public class VehicleIdentifier {
	
	static int  selection;
	static Scanner input;
	
	public static int menu() {
        input = new Scanner(System.in);
     // Display menu graphics
        System.out.println("===========================================");
        System.out.println("|   MENU SELECTION                          |");
        System.out.println("===========================================");
        System.out.println("| Options:                                  |");
        System.out.println("|        1. Create sample input XML         |");
        System.out.println("|        2. Read/parse input XML            |");
        System.out.println("|        3. Exit                            |");
        System.out.println("=============================================");
        
        selection = input.nextInt();
        return selection;    
    }
	
	public static void main(String[] args) throws JAXBException {
		//File inputFile = new File("c:/vehicle.xml");
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		File inputFile = new File(classloader.getResource("vehicle.xml").getFile());
		
		IVehicleFile vehicleInOut = new VehicleFileXML();
		
		
		int userChoice;
        userChoice = menu();
		while (userChoice != 3) {
			switch (userChoice) {
			case 1:
				vehicleInOut.writeFile(inputFile);
				System.out.println("--------------------------------------");
				System.out.println("\nEnter choice for next operation : \n");
				 userChoice = input.nextInt();
				break;
			case 2:
				vehicleInOut.readFile(inputFile);
				System.out.println("--------------------------------------");
				System.out.println("\nEnter choice for next operation : \n");
				userChoice = input.nextInt();
				break;
			case 3:
				System.out.println("Exit selected");
				break;
			default:
				System.out.println("Choice must be a value between 1 and 3.\n");
				System.out.println("Enter valid choice : \n");
				userChoice = input.nextInt();
				break; 
			}
		}

	}

}
