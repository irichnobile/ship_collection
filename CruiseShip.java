//******************************************************************************
//	CruiseShip.java		Author: Ian Nobile
//
//	Encapsulates the concept of a cruise ship. 
//	
//******************************************************************************

//import...

public class CruiseShip extends Ship
{
	private int iPass = 0;
	
	//--------------------------------------------------------------------------
	//	<<constructor>>; Creates an object of CruiseShip using name, year and 
	//	passengers.
	//--------------------------------------------------------------------------
	public CruiseShip(String name, int year, int passengers)
	{
		super(name,year);
		iPass = passengers;
	}	
	
	//--------------------------------------------------------------------------
	//	<<accessor>>; Gets number of passengers
	//--------------------------------------------------------------------------
	public int getPass()
	{
		return iPass;
	}

	//--------------------------------------------------------------------------
	//	<<mutator>>; Sets number of passengers
	//--------------------------------------------------------------------------
	public void setPass(int newpass)	
	{
		iPass = newpass;
	}
	
	//--------------------------------------------------------------------------
	//	Displays CruiseShip's name and number of passengers separated by a space
	//--------------------------------------------------------------------------
	public String toString()
	{
		return sName + " " + iPass;
	} //	end toString
	
} //	end class

