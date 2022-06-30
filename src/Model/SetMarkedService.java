///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class SetMarkedService implements SetMarked {

	public int set(int x,int y) {
		
		if ((x >= 90) && (x <= 200)) 
			return 0;
		if ((x >= 210) && (x <= 320)) 
			return 1;
		if ((x >= 330) && (x <= 440)) 
			return 2;
		if ((x >= 450) && (x <= 560)) 
			return 3;
	
		return -1;
	}
}
