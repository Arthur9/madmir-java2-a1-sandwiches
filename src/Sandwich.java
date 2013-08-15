
public class Sandwich {

	/* 
	 * This is the Sandwich class.
	 * This is an object class.
	 * There will be no main() method here
	 * Instead, you will declare variables to create
	 * the object's "fields", and then add methods 
	 * to retrieve or change the value of each field.
	 * 
	 */
/* Declare fields for this object
 */
 	static String mainIngred;
	static String breadType;
	static double price;
	
/*These are the accessor methods
 */	

	public String getMainIngred() {
		return mainIngred;
	}
	
	public String getbreadType() {
		return breadType;
	}	
	public double getPrice() {
		return price;
	}
	/* These are the mutator methods
	 */
	public void setmainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
	}
	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
		
}
		


