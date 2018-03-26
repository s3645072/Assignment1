import java.util.*;

public class MiniNet {

	public static void  main(String[] args) {
		
		MiniNet mininet = new MiniNet();
		Drive m = new Drive();
		int choice;
		while((choice = mininet.choice())!= 9) {
			m.begin(choice);
		}		
	}
	
	/**
	 * Print all of information for menu(the behavior should be done).
	 * @return A integer number that represent choice.
	 */
	public int choice(){	
		    System.out.println("MiniNet Menu");
			System.out.println("-----------------");
			System.out.println("1. Add a person");
			System.out.println("2. Delete a person");
			System.out.println("3. Select a person");
			System.out.println("4. List information for a person");
			System.out.println("5. update information for a person");
			System.out.println("6. Are there two direct friend?");
			System.out.println("7. What's your parents' name?");
			System.out.println("8. What's your child's name?");
			System.out.println("9. Exit");
			
			System.out.print("Please enter your choice: ");
			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();
			return choice;

    }
}