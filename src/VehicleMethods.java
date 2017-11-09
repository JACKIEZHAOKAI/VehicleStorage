/*	Author: ZHAOKAI XU (Jackie)
 *  class: VehicleMethods
 * 	email: zhx121@ucsd.edu
 *  time: OCT 28th,2017
 */
import java.util.LinkedList; 

public class VehicleMethods {
	
	/* name: GETvehicle
	 * purpose: find the vehicle from the vehicleList 
	 * linkedlist with the given vehicle ID 
	 * para: ID, vehicleList
	 * return type: the vehicle obj
	 */
	public Vehicle GETvehicle (int id, LinkedList<Vehicle> vehicleList)
	{	
		assert (vehicleList != null);
		//traverse through the linked list to find the vehicle
		for(Vehicle v : vehicleList)
		{
			if(v.getID() == id)
				return v;
		}	
		return null;
	}
	
	/* name: CREATEVehicle
	 * purpose: create a vehicle and store in the vehicle linkedlist
	 * para: id, year, make, model, vehicleList
	 * return type: boolean 
	 */
	public boolean CREATEVehicle(int id, int year, String make, String model, LinkedList<Vehicle> vehicleList)
	{
		//change make and model to lowercase 
		make = make.toLowerCase();
		model = model.toLowerCase();
		
		make = make.replaceAll("\\s+","");
		model = model.replaceAll("\\s+","");
		
		//traverse linked list to see if the ID already existed
		for(Vehicle v : vehicleList)
		{
			if(v.getID() == id )
				return false;
		}
		
		// if ID not existed, create an vehicle and insert into the linkedlist 
		vehicleList.add(new Vehicle(id, year, make, model) );
		return true;
	}		
	
	/* name: UPDATEvehicle
	 * purpose: find the vehicle in the vehicleList and update its info
	 * para: id, year, make, model, vehicleList
	 * return type: boolean 
	 */
	public boolean UPDATEvehicle(int id, int year, String make, String model, LinkedList<Vehicle> vehicleList)
	{				
		int counter = 0;
		for(Vehicle v : vehicleList)
		{
			if(v.getID() == id )
			{
				vehicleList.set(counter, new Vehicle(id, year, make, model));
				return true;
			}
			counter++;
		}	
		// if the ID is invalid 
		return false;
	}		
	
	/* name: DELETEvehicle
	 * purpose:delete the vehicle from the vehicle linkedlist 
	 * with the given vehicle ID
	 * para: ID, vehicleList
	 * return type: void 
	 */
	public boolean DELETEvehicle(int id,LinkedList<Vehicle> vehicleList)
	{	
		for(Vehicle v : vehicleList)
		{
			if(v.getID() == id )
			{
				vehicleList.remove(v);
				return true;
			}
		}	
		//delete unsuccessfully
		return false;
	}
	
	/* name: FilterVehicle
	 * purpose: find the vehicles that match the given properties
	 * such as Year, Make, and Model in the vehicleList 
	 * para: Year, Make, Model, vehicleList
	 * return type: void 
	 */
	public void GetFilterVehicle (int year, String make, String model, LinkedList<Vehicle> vehicleList)
	{	
		//1		filter based on year only
		if(year !=0 && make=="0" && model=="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getYear() == year)
					v.printVehicle();	
			}	
		}
		//2		filter based on make only	
		if(year==0 && make!="0" && model=="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getMake().equals(make) )
					v.printVehicle();					
			}	
		}
		//3		filter based on model only	
		if(year==0 && make=="0" && model!="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getModel().equals(model) )
					v.printVehicle();
			}	
		}
		//4 	filter based on year and make 
		if(year!=0 && make!="0" && model=="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getYear()==year && v.getMake().equals(make) )
					v.printVehicle();
			}	
		}
		//5		filter based on year and model 
		if(year!=0 && make=="0" && model!="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getYear()==year && v.getModel().equals(model))
					v.printVehicle();
			}	
		}
		//6		filter based on make and model 
		if(year==0 && make!="0" && model!="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getModel().equals(model) && v.getMake().equals(make))
					v.printVehicle();
			}	
		}				
		//7		filter based on year, make,and model 
		if(year!=0 && make!="0" && model!="0" )
		{
			for(Vehicle v : vehicleList)
			{
				if( v.getYear() == year && v.getModel().equals(model) && v.getMake().equals(make))
					v.printVehicle();
			}	
		}			
	}
	
	
	/* name: PrintALLvehicle
	 * purpose: print info of all vehicles in the vehicleList 
	 * para: vehicleList
	 * return type: void
	 */
	public void PrintALLvehicle (LinkedList<Vehicle> vehicleList)
	{	
		for(Vehicle v : vehicleList)
			v.printVehicle(); 	
	}	
}


