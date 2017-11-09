/*	Author: ZHAOKAI XU (Jackie)
 *  class: Vehicle
 * 	email: zhx121@ucsd.edu
 *  time: OCT 28th,2017
 */
public class Vehicle {
	//member variables declaration
	public int ID;
	public int Year;
	public String Make;
	public String Model;
	
	//vehicle constructor 
	public Vehicle(int ID, int Year, String Make, String Model) {
	    this.ID = ID;
	    this.Year = Year;
	    this.Make = Make;
	    this.Model = Model;
	}
	//setter for member variables 
	public void setID(int ID){this.ID =  ID;}
	public void setYear(int Year){this.Year =  Year;}
	public void setMake(String Make){this.Make =  Make;}
	public void setModel(String Model){this.Model =  Model;}
	
	//getter for member variables 
	public int getID(){return this.ID;}
	public int getYear(){return this.Year;}
	public String getMake(){return this.Make;}
	public String getModel(){return this.Model;}
	
	//print out info of the vehicle 
	public void printVehicle()
	{
		System.out.printf("ID:    %10d \n",this.ID);
		System.out.printf("Year:  %10d \n",this.Year);
		System.out.printf("Make:  %10s \n",this.Make);
		System.out.printf("Model: %10s \n\n",this.Model);
	}
}


