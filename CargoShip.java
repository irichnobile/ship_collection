//******************************************************************************
//	CargoShip.java		Author: Ian Nobile
//
//	Encapsulates the concept of a cargo ship. 
//	
//******************************************************************************

//import...

public class CargoShip extends Ship
{
	private int iCargo = 0;
	
	//--------------------------------------------------------------------------
	//	<<constructor>>; Creates an object of CargoShip using name, year and 
	//	tonnage.
	//--------------------------------------------------------------------------
	public CargoShip(String name, int year, int cargo)
	{
		super(name,year);
		iCargo = cargo;
	}	
	
	//--------------------------------------------------------------------------
	//	<<accessor>>; Gets maximum tonnage
	//--------------------------------------------------------------------------
	public int getCargo()
	{
		return iCargo;
	}

	//--------------------------------------------------------------------------
	//	<<mutator>>; Sets maximum tonnage
	//--------------------------------------------------------------------------
	public void setCargo(int newcargo)	
	{
		iCargo = newcargo;
	}
	
	//--------------------------------------------------------------------------
	//	Displays CruiseShip's name and max tonnage separated by a space
	//--------------------------------------------------------------------------
	public String toString()
	{
		return sName + " " + iCargo;
	} //	end toString
	
} //	end class

