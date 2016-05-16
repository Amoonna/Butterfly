import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class fileios {
	public void fileios(){
		
		int birdwing = 0;
		int monarch = 0;
		int swallowtail = 0;
		int zebra = 0;
		int dragon = 0;
		
	try {
//	File outFile = new File ("Butterfly_Log.txt");
//	FileOutputStream outFileStream;
//	
//	outFileStream = new FileOutputStream(outFile);
	PrintWriter outStream = new PrintWriter ("Log.txt");
	
	outStream.println("\nTotal butterflies caught: \n " +
					" \n"  + "Birdwing Butterflies: " + birdwing + "\nMonarch Butterflies: " + monarch +
					"\nSwallowtail Butterflies: " + swallowtail + "\nZebra Butterflies: " + zebra
					+ "\nDragonflies...?: " + dragon);
	//System.out.println("hello");
	outStream.close();
	}
	catch (IOException e) {
		e.printStackTrace();
		
	
	}
}


}
