/*	Author: ZHAOKAI XU (Jackie)
 *  class: Driver
 * 	email: zhx121@ucsd.edu
 *  time: OCT 28th,2017
 */
import java.util.LinkedList;
import java.util.Scanner; 
import java.util.regex.*;
import java.io.BufferedReader;

public class Driver {
	
	  public static void main(String[] args) {
		 
		  //create a linked list to store vehicle data 
		  LinkedList<Vehicle> vehicleList = new LinkedList<Vehicle>();
		  VehicleMethods util = new VehicleMethods();
		  
		  //menu  
		  System.out.println("Here is the menu for implementing GET, CREATE, \n"
		  		+ "UPDATE, DELETE, FILTER, and PRINTALL methods \n"
		  		+ "__________________________________________\n"
		  		+ "C:Create new vehicle and store in the storage \n"
		  		+ "G:Get vehicle from storage with a given ID \n"
		  		+ "U:Update vehile info with a given an ID \n"
		  		+ "D:Delete a vehicle from the storage with a given ID \n"
		  		+ "F:filter the vehicle you want(year/make/model) \n"
		  		+ "  leave year to be 0 if not want to search by year \n"
		  		+ "  leave make or model empty if not search by them \n"
		  		+ "P:print all vehicles in the storage \n"
		  		+ "Q:quit the program \n");
		      
	    Scanner reader = new Scanner(System.in);  // Reading from System.in
	    
	 
	    while(true) {
	    	   //variables declaration
		    int id = 0;
		    int year = 0;
		    String make = "";
		    String model = "";
		    String temp = "";
		 
	    	System.out.println("Please enter your option: ");
	        String option = reader.next();
	        option = option.toUpperCase();
	        char optionChar = option.charAt(0);
	        
	        switch (optionChar) {	
	            case 'C':
	            	do
	            	{
	            		System.out.println("Enter the id: ");
	            		temp = reader.next(); 
	            		if(temp.matches("\\d+"))
		            		id =  Integer.parseInt(temp); 
	            	}while(!temp.matches("\\d+"));
	            	do
	            	{
	            		System.out.println("Enter the year: ");
		            	temp = reader.next(); 
		            	if(temp.matches("\\d{4}"))
		            		year =  Integer.parseInt(temp);	
	            	}while( !temp.matches("\\d+") || (year< 1950 || year > 2050) );
	            	do
	            	{
	            		System.out.println("Enter the make: ");
		            	temp = reader.nextLine(); 
		            	//remove space
		            	String[] array1 = temp.split("\\s"); 
		            	for(int i=0; i< array1.length; i++)
		            		make += array1[i];    		
	            	}while(make.equals(""));
	            	do
	            	{
	            		System.out.println("Enter the model: ");
		            	temp = reader.nextLine(); 
		            	//remove space
		            	String[] array2 = temp.split("\\s"); 
		            	for(int i=0; i< array2.length; i++)
		            		model += array2[i];    		
	            	}while(model.equals(""));	     

	    			//change make and model to lowerCase  
	    			make = make.toLowerCase();
	    			model = model.toLowerCase();
	    			//call createVehicle method
	            	util.CREATEVehicle(id, year, make, model, vehicleList);
	            	break;
	            	
	            case 'G':  
	            	do
	            	{
	            		temp = "";
	            		System.out.println("Enter the id: ");
	            		temp = reader.next(); 
	            		if(temp.matches("\\d+"))
		            		id =  Integer.parseInt(temp); 
	            	}while(!temp.matches("\\d+"));

	                Vehicle car = util.GETvehicle(id, vehicleList);
            	    if (car!=null)
            	    	car.printVehicle();
        		    else 
        		    	System.out.println("invalid ID!");
	            	break;
	            	
	            case 'U':  
	            	do
	            	{
	            		System.out.println("Enter the id: ");
	            		temp = reader.next(); 
	            		if(temp. matches("\\d+"))
		            		id =  Integer.parseInt(temp); 
	            	}while(!temp.matches("\\d+"));
	            	do
	            	{
	            		System.out.println("Enter the year: ");
	            		temp = reader.next(); 
		            	if(temp.matches("\\d{4}"))
		            		year =  Integer.parseInt(temp);	
	            	}while( !temp.matches("\\d+") || (year< 1950 || year > 2050) );
	            	do
	            	{
	            		System.out.println("Enter the make: ");
	            		temp = reader.nextLine(); 
	            		//remove space
		            	String[] array3 = temp.split("\\s"); 
		            	for(int i=0; i< array3.length; i++)
		            		make += array3[i];    		
	            	}while(make.equals(""));
	            	do
	            	{
	            		System.out.println("Enter the model: ");
	            		temp = reader.nextLine(); 
	            		//remove space
	            		String[] array4 = temp.split("\\s"); 
		            	for(int i=0; i< array4.length; i++)
		            		model += array4[i];    		
	            	}while(model.equals(""));	         
	            	
	    			//change make and model to lowerCase 
	    			make = make.toLowerCase();
	    			model = model.toLowerCase();
	  
	            	util.UPDATEvehicle(id, year, make, model, vehicleList);
	            	break;
	            	
	            case 'D':  
	            	do
	            	{
	            		System.out.println("Enter the id: ");
	            		temp = reader.next(); 
	            		if(temp.matches("\\d+"))
		            		id =  Integer.parseInt(temp); 
	            	}while(!temp.matches("\\d+"));
	         
	            	//call CREATEVehicle method 
	            	boolean delete = util.DELETEvehicle(id, vehicleList);
	            	if (delete)
	            		System.out.println("delete successful!");
	            	else 
	            		System.out.println("invalid ID, delete unsuccessful!");
	            	break;
	
	            case 'F':  
	            	do
	            	{
	            		System.out.println("Enter the year: ");
	            		temp = reader.next(); 
		            	if(temp.matches("\\d{4}"))
		            		year =  Integer.parseInt(temp);	
	            	}while( !temp.matches("\\d+"));
	   
            		System.out.println("Enter the make: ");
            		make = reader.next(); 
	         		
            		System.out.println("Enter the model: ");
            		model = reader.next();    		

	    			//change make and model to lowerCase 
            		if(make != "0")
            			make = make.toLowerCase();
	    			if(model != "0")
	    				model = model.toLowerCase();
	    			//call GetFilterVehicle
	    			
	    			System.out.println("year"+year);
	    			System.out.println("model"+model);
	    			System.out.println("make"+ make);
	    			
	            	util.GetFilterVehicle(year, make, model, vehicleList);
	            	break;
	            	
	            case 'P':  
	            	util.PrintALLvehicle(vehicleList);
	            	break;
	            case 'Q':
	            	return;
	            default: 
	            	System.out.println("invalid input option");
	        }
	    }
       
        
        

	  }
}








