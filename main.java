/*I wrote the code for the butterfly catching and recording based on 
 * knowledge from past assignments
 */

import java.security.SecureRandom;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class main extends JFrame {
	
	JFrame field = new JFrame();
	ImageIcon icon = new ImageIcon("/Users/Amoonna/Documents/Carroll/eclipse/butterflyfile/src/Butterfly_Swarm.jpg");
	JLabel Label = new JLabel(icon);
	
	//received help from Nick and stackoverflow
	public main(){
	
	//public static Display f = new Display();
	
	field.pack();
//	field.setState(MAXIMIZED_BOTH);
	field.setResizable(false);
	field.setSize(200, 200);
	field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	field.setTitle("Butterfly Field");
	field.add(Label);
	field.pack();
	field.setVisible(true);
	
//	try {
//	    Thread.sleep(2000);                 //1000 milliseconds is one second.
//	} catch(InterruptedException ex) {
//	    Thread.currentThread().interrupt();
//	}
	
	}
	
	

	private static int species () {
		//lets the user decide which type of butterfly to go after
		String [] color = {"Blue", "Orange", "Yellow", "Black"};
		
		int wings = JOptionPane.showOptionDialog(null,
		"What color of butterfly do you wish to try and catch?",
		"",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, color, "none");
		//System.out.println(wings +" " +color [0]+" " + color [1]);
		return (wings);
	
		
		
	}private static int catchrate(int success){
		SecureRandom Butterfly = new SecureRandom ();
		success = Butterfly.nextInt(10);
//		System.out.println(success);
		return (success);
	}
	//loop attempt
    
	public static void main(String[] args) {
		
	
		boolean playagain = true;
		
		
			
			
		
		
		
		//variables used
		int wings = 0;
		int success = 0;
		int birdwing = 0;
		int monarch = 0;
		int swallowtail = 0;
		int zebra = 0;
		int dragon = 0;
		
		//input name of player
		String name = JOptionPane.showInputDialog(null, "Enter Player Name");
		
		while (playagain){
			
		String [] play = {"No", "Yes"};
		//starts game "No" exits program
		int start = JOptionPane.showOptionDialog(null,
				"Welcome, " + name + ". Are you ready to play?",
				"",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, play, "none");
		
		
			
		if (start == 0){
			JOptionPane.showMessageDialog(null, "You've become drunk on adrenaline and cannot continue; " +
					"have a safe walk home!");
			JOptionPane.showMessageDialog(null, "Thank you for playing!");
			JOptionPane.showMessageDialog(null, "Total butterflies caught: \n " +
					" \n"  + "Birdwing Butterflies: " + birdwing + "\nMonarch Butterflies: " + monarch +
					"\nSwallowtail Butterflies: " + swallowtail + "\nZebra Butterflies: " + zebra
					+ "\nDragonflies...?: " + dragon);
			
			
			fileios f = new fileios();
			f.fileios();
					
			
			System.exit(0);
		}
		else if (start == 1){
			JOptionPane.showMessageDialog(null, "You walk into a field of flowers and find butterflies all around.");
			
			main b = new main();
			
			JOptionPane.showMessageDialog(null, "You grip your net and stalk forward cautiously \ndeciding which one to pursue.");
			
			//calls on method string
			
			int wings2 = main.species(); 
			
			
			//int wings = (1); //tester for the rest of the program w/out the method species
			
			
			//Birdwing butterfly chance
			if (wings2 == 0){
				//System.out.println(success + "blue");
				
					int newsuccess =  main.catchrate(success) - 4;
					//JFrame Birdwing
					if (newsuccess > 4 ){
						JOptionPane.showMessageDialog(null, "Congratulations " + name + "! \n You caught a Birdwing Butterfly!");
					
						birdwing = birdwing + 1;
						
					}
					
					else {
						JOptionPane.showMessageDialog(null, "The butterfly has evaded capture, for now.");
					}
			}
			else if (wings2 == 1){
				
					int newsuccess = main.catchrate(success);
					//JFrame Monarch
						if (newsuccess > 5 ){
							JOptionPane.showMessageDialog(null, "Congratulations " + name + "! \nYou caught a Monarch Butterfly!");
						
							monarch = monarch + 1;
						
						}
						
						else {
							JOptionPane.showMessageDialog(null, "The butterfly has evaded capture, for now.");
						}
					
			}
			else if (wings2 == 2){
				//System.out.println(success + "yellow");
				
					int newsuccess = main.catchrate(success) - 3;
				//JFrame Swallowtail
						if (newsuccess > 4 ){
							JOptionPane.showMessageDialog(null, "Congratulations " + name + "! \n You caught a Swallowtail Butterfly!");
					
						swallowtail = swallowtail + 1;
						
						}
							else {
								JOptionPane.showMessageDialog(null, "The butterfly has evaded capture, for now.");
					
			}
		}
				
			else if (wings2 == 3){
				
					int newsuccess = main.catchrate(success) ;
					System.out.println(newsuccess);
				//Jframe 
					if (newsuccess < 9 && newsuccess > 4){
						JOptionPane.showMessageDialog(null, "Congratulations, " + name + "! \n You caught a Zebra Butterfly!");
					
						zebra = zebra + 1;
					
					}
				//Jframe Dragonfly
					else if (newsuccess >= 9){
				
				JOptionPane.showMessageDialog(null, "Oops, " + name + ", you seem to have caught a large dragonfly!");
				JOptionPane.showMessageDialog(null, "Better release it or it'll cause PROBLEMS.");
					dragon = dragon + 1;
			}
				else if (newsuccess <= 4){
					JOptionPane.showMessageDialog(null, "The butterfly has evaded capture, for now.");
					
				
			}
			}}
	
		
//this is all code that I originally had but replaced/removed 
		//either i found a better way or this code did nothing
		
		//loop help received from stackoverflow.com/questions/21978065/how-do-i-loop-my-whole-program
//		System.out.println ("Would you like to try again? (Y/N) ");
//	    char answer = body.nextLine();
//		
//	    if (answer == 'y'){
//	        playagain = true;
//	        }
//	      else {
//	        playagain = false;
//	        }
//	
	}
			

//		private static int species (int wings) {
//		
//			String [] color = {"Blue", "Orange", "Yellow", "Black"};
//			wings = JOptionPane.showOptionDialog(null,
//			"What color of butterfly do you wish to try and catch?",
//			"",
//			JOptionPane.YES_NO_CANCEL_OPTION,
//			JOptionPane.QUESTION_MESSAGE,
//			null, color, "none");
//			return (wings);
	}}
		
//		//method to determine if the butterfly has been caught or not
//		private static int catchrate(int success){
//			SecureRandom Butterfly = new SecureRandom ();
//			success = Butterfly.nextInt(15);
////			System.out.println(success);
//			return (success);
//			
//		}
		
	
		
	
	
	

