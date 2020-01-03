//******************************************************************************
//	Ship.java		Author: Ian Nobile
//
//	Encapsulates the concept of a ship. 
//	
//******************************************************************************

//import...

public class Ship implements Comparable<Ship>
{
	protected String sName = "";
	protected int iYear = 0000;
	
	
	//--------------------------------------------------------------------------
	//	<<constructor>>; Creates object of Ship using name and year
	//--------------------------------------------------------------------------
	public Ship(String name, int year)
	{
		sName = name;
		iYear = year;
	}	
	
	//--------------------------------------------------------------------------
	//	<<accessor>>; Gets sName
	//--------------------------------------------------------------------------
	public String getName()
	{
		return sName;
	}

	//--------------------------------------------------------------------------
	//	<<accessor>>; Gets iYear
	//--------------------------------------------------------------------------
	public int getYear()
	{
		return iYear;
	}
	
	//--------------------------------------------------------------------------
	//	<<mutator>>; Sets sName
	//--------------------------------------------------------------------------
	public void setName(String newname)	
	{
		sName = newname;
	}
	
	//--------------------------------------------------------------------------
	//	<<mutator>>; Sets iYear
	//--------------------------------------------------------------------------
	public void setYear(int newyear)	
	{
		iYear = newyear;
	}
	
	//--------------------------------------------------------------------------
	//	Displays Ship's name and year separated by a space
	//--------------------------------------------------------------------------
	public String toString()
	{
		return sName + " " + iYear;
	}
	
	//--------------------------------------------------------------------------
	//	Compares two Ship objects by name; needed for alphabetise method
	//--------------------------------------------------------------------------
	@Override //required
    public int compareTo(Ship othership)
	{	
		int iCompVal = 2;
		
		//----------------------------------------------------------------------
		//	Compares the names and returns the standard 0, 1, -1 result
		//----------------------------------------------------------------------
		if(sName.compareTo(othership.getName())>0)
		{
			iCompVal = 1; //if the first comes first in the alphabet
		}
		else if(sName.compareTo(othership.getName())<0)
		{
			iCompVal = -1; //if the second comes lexically before the first
		}
		else if(sName == othership.getName())
		{
			iCompVal = 0; //if they are the same
		}
		return iCompVal;
    } //	end compareTo
	
} //	end class

