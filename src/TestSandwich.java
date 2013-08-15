import javax.swing.JOptionPane;

public class TestSandwich {

	public static void main(String[] args) {
		/*
		 * This class is a program class.
		 * It WILL include a main() method.
		 * This program should create two instances of
		 * Sandwich, and it should demonstrate the
		 * use of all of the methods encapsulated
		 * in the Sandwich class.
		 * 
		 * Finish off this program by displaying the
		 * values of each of the fields for each 
		 * Sandwich instance.
		 * 
		 */
		
		/*Instantiate a sandwich object
		 * 
		 */
		Sandwich artsPBJ = new Sandwich() ;
		Sandwich CJPBJ = new Sandwich() ;
		/* Set the Values of PB & J
		 * 
		 */
		artsPBJ.setmainIngred(" Peanut Butter, Jelly ");
		artsPBJ.setBreadType(" Whole Wheat ");
		artsPBJ.setPrice(2.75);
		
		/*Output the details of my PBJ Sandwich	 */
		
		String sandwichMaker;
		sandwichMaker = JOptionPane.showInputDialog("Who is making the Sandwich?");
		JOptionPane.showMessageDialog (null, sandwichMaker + "is making a " + artsPBJ.getMainIngred()
				+ "sandwich on" + artsPBJ.getbreadType() + "the Price is $" + artsPBJ.getPrice());
		CJPBJ.setmainIngred(" Peanut Butter, Jelly ");
		CJPBJ.setBreadType(" Whole Wheat ");
		CJPBJ.setPrice(2.75);
		
		/*Output the details of my PBJ Sandwich	 */
		
		String sandwichMaker1;
		sandwichMaker1 = JOptionPane.showInputDialog("Who is making the Sandwich?");
		JOptionPane.showMessageDialog (null, sandwichMaker1 + "is making a " + CJPBJ.getMainIngred()
				+ "sandwich on" + CJPBJ.getbreadType() + "the Price is $" + CJPBJ.getPrice());
	}

}
