//******************************************************************************
//	ShipsCollection.java		Author: Ian Nobile
//
//	Client program incorporating the Ship, CruiseShip and CargoShip classes to 
//	allow a user to create a list of up to 10 Ship objects. Displays the 
//	information of these objects in ascending order based on their names after 
//	the fleet creation phase is complete.
//	
//******************************************************************************

import java.util.Scanner;

public class ShipsCollection
{
	//--------------------------------------------------------------------------
	//	<<main method>>
	//--------------------------------------------------------------------------
	public static void main (String[] args)
	{
		String sName = " ";
		String sType = " ";
		int iYear = 0000;
		int iAddit = 0;
		char cContinue = 'Y';
		int iCount = 0;
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n"); //allows for the use of spaces in ship names
		Ship[] aShip = new Ship[10]; //creates the array of Ship objects
		
		
		//----------------------------------------------------------------------
		//	Dialogue begins here with greeting:
		//----------------------------------------------------------------------
		System.out.println("Ahoy, there! Let us create your fleet.");
		
		//----------------------------------------------------------------------
		//	Fleet Creation Phase; while-loop prompts the user for input and  
		//	creates objects of Cruise and Cargo type in two separate ways:
		//----------------------------------------------------------------------
		while(cContinue!='N'&&cContinue!='n')
		{
			System.out.print("What be the name of yer ship? ");
			sName = scan.next();
			System.out.print("Splendid! And in what year was she launched "
							+ "originally? ");
			iYear = scan.nextInt();
			System.out.print("And what sort of craft be the good ship \"" 
							+ sName + "\" there, ah, Cap'n? "
								+ "(You may say \"Cruise\" or \"Cargo\") ");
			sType = scan.next();
			//------------------------------------------------------------------
			//	Should the user designate "Cruise", this if-statement christens 
			//	a new ship object first before filling in details using mutator 
			//	methods built into the CruiseShip class:
			//------------------------------------------------------------------
			if((sType.compareTo("Cruise")==0)
					||(sType.compareTo("cruise")==0)
						||(sType.compareTo("CRUISE")==0))
			{
				CruiseShip csCruise = new CruiseShip("name", 0000, 0); 
				csCruise.setName(sName);
				csCruise.setYear(iYear);
				System.out.print("Aye, aye. And what be her maximum number of "
						+ "passengers? ");
				//collects user input and sets object attribute in one step:
				csCruise.setPass(scan.nextInt());
				aShip[iCount] = csCruise; //adds ship to array
			}
			//------------------------------------------------------------------
			//	Should the user designate "Cargo", this if-statement first 
			//	collects tonnage, the final required variable, before sending 
			//	all parametres to the Cargo class constructor and creating 
			//	the object that way:
			//------------------------------------------------------------------
			else if((sType.compareTo("Cargo")==0)
					||(sType.compareTo("cargo")==0)
						||(sType.compareTo("CARGO")==0))
			{
				System.out.print("Aye, aye. And what be her maximum tonnage? ");
				iAddit = scan.nextInt();
				CargoShip csCargo = new CargoShip(sName, iYear, iAddit);
				aShip[iCount] = csCargo; // adds ship to array
			}
			iCount++; //increments counter for number of array elements 
			System.out.println("Very well, there, Admiral. Ship created.");
			if(iCount==10)
				break; //ends fleet creation at ten ships
			System.out.print("Do you wish to create another? (Y/N) ");
			cContinue = scan.next().charAt(0);
		}
		scan.close(); //prevents data leakage
		
		//----------------------------------------------------------------------
		//	Fleet Sorting Phase; alphabetises Ship array objects using the 
		//	selection sort algorithm:
		//----------------------------------------------------------------------
		Ship sTemp = new Ship("name", 0000); //temp object used for swapping
		int minimum;
		for(int i=0; i<(iCount-1); i++)
		{
			minimum = i;
			for(int k=i+1; k<iCount; k++)
			{
				if(aShip[k].compareTo(aShip[minimum])<0)
				{
					minimum = k;
				}
			//swaps objects in the array
			sTemp = aShip[minimum];
			aShip[minimum] = aShip[i];
			aShip[i] = sTemp;
			} //end k for
		} //end i for
		
		//----------------------------------------------------------------------
		//	Fleet Display Phase; prints objects in the Ship array:
		//----------------------------------------------------------------------
		System.out.println("Here be yer list of ships, Captain. Pleasant "
				+ "sailing to ye!");
		for(int j = 0; j<iCount; j++)
		{
			System.out.println(aShip[j]);
			
		} //end for
		
	} //end main
	
} //end class

