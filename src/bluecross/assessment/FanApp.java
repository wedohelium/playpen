package bluecross.assessment;

import java.util.InputMismatchException;
import java.util.Scanner;

import bluecross.assessment.object.CeilingFan;
import static java.lang.System.exit;

/**
//* <h1>Ceiling Fan Simulator</h1>
*  A basic command line program to simulate the behaviour of a ceiling fan.
*  the program mimics a real-life ceiling fan: 
*  Upon initialisation, it is off. 
*  You can either pull the chain to turns it on/off or set the speed (p),
*  or reverse the rotation(r), or exit the program (e).
*  For option r and e, the new status of the fan will be displayed (on/off/speed/direction)
* <p>
*
* @author  Stephen MacIsaac
* @version 1.0
* @since   2022-03-01
*/

public class FanApp {
	static CeilingFan cfan;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ceiling Fan : ");
		cfan = new CeilingFan();
		String[] options = {"p - on/increase fan speed(1/2/3)/off","r - Reverse fan direction","e - Exit"};
		Scanner scanner = new Scanner(System.in);
		
		String option = "p";
		while (option!="e"){
			printMenu(options);
			try {
			    option = scanner.next();
			    switch (option.charAt(0)){
			        case 'p': option1(); break;
			        case 'r': option2(); break;
			        case 'e': scanner.close(); goodbye();
			        default: error(); break;
			    }
			}
			catch (InputMismatchException ex){
                System.out.println("Please enter p, r, or e");
                scanner.next();
            }
			catch (Exception ex){
			    System.out.println("Please enter p, r, or e");
			    scanner.next();
			}
		}
	}
	
	public static void printMenu(String[] options){
        for (String option : options){
        	CeilingFan cfan = new CeilingFan();
            System.out.println(option);
        }
        System.out.print("Press p , r, or e + <ENTER>: ");
        
    }

	// Options
    private static void option1() {
    	cfan.pull();
        System.out.println(cfan.toString());
    }
    private static void option2() {
    	cfan.reverse();
        System.out.println(cfan.toString());
    }
    
    private static void goodbye() {
    	System.out.println("GoodBye");
    	exit(0);
    }
 
    private static void error() {
    	System.out.println("Please enter p, r, or e");
    }
	
}
