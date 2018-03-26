import java.util.*;
public class Add {
	
	Profile p, dependent, adult;	
	public List<Profile> people=new ArrayList<Profile>();
	
	/**
	 * Add information for a person in people arrayList.
	 * Judge the person's age, and then create different objects.
	 */
	public void add(List<Profile> people) {	
		int friendNum = 0;
		String[] friend = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter name: ");
		String name = in.next();
		System.out.println("Please enter status: ");
		String status = in.next();
		System.out.println("Enter image or not (Y/N): ");
		String image = in.next();
		System.out.println("enter age: ");
		int age = in.nextInt();
		int flag = 0;
		String dad = null, mum = null, chiName = null;
		String y = "Y";
		if (age < 16) {
			System.out.println("Please enter your dad's name: ");
			dad = in.next();
			System.out.println("Please enter your mum's name: ");
			mum = in.next();
			flag = 1;			
		}
		else {
			String hasChild;
			System.out.println("Do you have a child (Y/N)?");
			hasChild = in.next();
			if (hasChild.equals(y)) {
				System.out.println("Please enter your child's name: ");
				chiName = in.next();
				flag = 0;
			}
			else
				flag = 2;				
		}
		
		if(age >2) {
			System.out.println("How many friends are you have? ");
			friendNum = in.nextInt();
			friend = new String[friendNum];
			for (int i = 0; i<friendNum; i++) {
				System.out.println("Please enter your friends' name: "); 
				friend[i] = in.next();
			}
		}
		if (flag == 1) {
			dependent = new Dependent(name, age, image, status, friend, dad, mum);
			people.add(dependent);
		}
		else if (flag == 0) {
			adult = new Adult(name, age, image, status, friend, chiName);
			people.add(adult);
		}
		else {
			p = new Profile(name, age, image, status, friend);
			people.add(p);
		}
			System.out.println(name +" add successfully:)");
	}

}
