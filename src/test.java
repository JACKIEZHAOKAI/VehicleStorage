/*	Author: ZHAOKAI XU (Jackie)
 *  class: VehicleMethods
 * 	email: zhx121@ucsd.edu
 *  time: OCT 29th,2017
 */
import java.util.LinkedList;

public class test {
	  public static void main(String[] args) {
			 
		  //create a linked list to store vehicle data 
		  LinkedList<Vehicle> vehicleList = new LinkedList<Vehicle>();
		  VehicleMethods util = new VehicleMethods();
		  
		  //test Create method
		  util.CREATEVehicle(10, 1999, "hond a ", "C  R- V", vehicleList);		//upper case, space
		  util.CREATEVehicle(8, 2003, "hon DA", "Civic", vehicleList);			
		  util.CREATEVehicle(20, 2003, "hon DA", "Ci  vi c", vehicleList);		
		  util.CREATEVehicle(37, 2003, "hon DA", "C i   vic", vehicleList);
		  util.CREATEVehicle(12,2003, "Ho n d a", "HR-v", vehicleList);
		  util.CREATEVehicle(1, 1999, "honda", "accord", vehicleList);
		  util.CREATEVehicle(10, 1999, "", "Civic", vehicleList);				//depulicated id
		  util.CREATEVehicle(13, 2010, "honda", "accord", vehicleList);
		  
		  util.CREATEVehicle(23,200000, "Toyota", "cameral", vehicleList);
		  util.CREATEVehicle(203,2003, "Toyota", "pri U s", vehicleList);
		  util.CREATEVehicle(287,2003, "Toyota", "86", vehicleList);
		  util.CREATEVehicle(75,2003, "TOyoTA", "corolla", vehicleList);
		  util.CREATEVehicle(103,2039, "TO  y o  TA", "corolla", vehicleList);
		  
		  // testing PrintALLvehicle method
		  System.out.println("\n-------testing PrintALLvehicle--------------------------");
		  util.PrintALLvehicle(vehicleList);;
		  
		  // testing GETvehicle methods 
		  Vehicle car = util.GETvehicle(10, vehicleList);
		  System.out.println("\n-----------testing GETvehicle----------------------");
		  if (car!=null)
			  car.printVehicle();
		  else 
			  System.out.println("invalid ID!");
		  car = util.GETvehicle(83, vehicleList);
		  System.out.println("\n-----------testing GETvehicle----------------------");
		  if (car!=null)
			  car.printVehicle();
		  else 
			  System.out.println("invalid ID!");
		  
		  
		  // testing update methods 
		  boolean update = util.UPDATEvehicle(83, 1000,"toyota","carola", vehicleList);
		  System.out.println("\n-----------testing UPDATEvehicle----------------------");
		  if (update)
			  System.out.println("update successful!");
		  else 
			  System.out.println("invalid ID, update unsuccessful!");
		  update = util.UPDATEvehicle(3023, 1000,"toyota","carola", vehicleList);
		  System.out.println("\n-----------testing UPDATEvehicle----------------------");
		  if (update)
			  System.out.println("update successful!");
		  else 
			  System.out.println("invalid ID, update unsuccessful!");
		  
		  
		  // testing filter methods 
		  System.out.println("\n------testing GetFilterVehicle------2003----------------");
		  util.GetFilterVehicle(2003, "0", "0", vehicleList);
		  System.out.println("\n------testing GetFilterVehicle------honda---------------");
		  util.GetFilterVehicle(0, "honda", "0", vehicleList);
		  System.out.println("\n------testing GetFilterVehicle------civic---------------");
		  util.GetFilterVehicle(0, "0", "civic", vehicleList);
		  System.out.println("\n-------testing GetFilterVehicle------2003-----honda-----");
		  util.GetFilterVehicle(2003, "honda", "0", vehicleList);
		  System.out.println("\n-------testing GetFilterVehicle------2003-----civic-----");
		  util.GetFilterVehicle(2003, "0", "civic", vehicleList);
		  System.out.println("\n-------testing GetFilterVehicle------honda----civic-----");
		  util.GetFilterVehicle(0, "honda", "civic", vehicleList);
		  System.out.println("\n-------testing GetFilterVehicle---2003---honda---civic--");
		  util.GetFilterVehicle(2003, "honda", "civic", vehicleList);
		  
		  
		  // testing delete methods 
		  boolean delete = util.DELETEvehicle(1, vehicleList);
		  System.out.println("\n-----------testing DELETEvehicle----------------------");
		  if (delete)
			  System.out.println("delete successful!");
		  else 
			  System.out.println("invalid ID, delete unsuccessful!");
		  delete = util.DELETEvehicle(10, vehicleList);
		  System.out.println("\n-----------testing DELETEvehicle----------------------");
		  if (delete)
			  System.out.println("delete successful!");
		  else 
			  System.out.println("invalid ID, delete unsuccessful!");
		  delete = util.DELETEvehicle(100, vehicleList);
		  System.out.println("\n-----------testing DELETEvehicle----------------------");
		  if (delete)
			  System.out.println("delete successful!");
		  else 
			  System.out.println("invalid ID, delete unsuccessful!");
		  
		  // testing filter method after delete 
		  System.out.println("\n-------testing GetFilterVehicle---2003---honda---accord--");
		  util.GetFilterVehicle(0, "honda", "accord", vehicleList);
		  
		  // testing PrintALLvehicle method
		  System.out.println("\n-------testing PrintALLvehicle--------------------------");
		  util.PrintALLvehicle(vehicleList);		
		  		  
	  }
}











