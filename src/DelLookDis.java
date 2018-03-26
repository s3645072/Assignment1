import java.util.*;
public class DelLookDis {
	
	Scanner in = new Scanner(System.in);

	/**
	 * Delete all of information for a person in people arrayList.
	 */
	public void delete(List<Profile> people) {
		System.out.println("Please enter name you want to delete: ");
		String name = in.next();
		int i = find(name, people);  
		if (i != -1) {
			people.remove(i);
			   System.out.println(name + " delete successfully:)");            
		   }
		else
			System.out.println("Sorry, cannot find " + name +" :(");
	}
	
	/**
	 *Search for a person's name in people arrayList.
	 */
	public void lookUp(List<Profile> people) {
		System.out.println("enter name you want to select: ");
		String name = in.next();
		int i = find(name, people);
		if (i != -1)
			System.out.println("Congratulation, "+name +" is here:)");
		else
		    System.out.println("Sorry, cannot find " + name +" :(");			  	 
	}
	
	/**
	 * Display all of information for a person selected in people arrayList.
	 */
	public void display(List<Profile> people) {
		System.out.println("enter name you want to display: ");
		String name = in.next();
		int i = find(name, people);
		if (i != -1) {
//				   System.out.println(getClass());
				   System.out.println("name: " + people.get(i).getName() );
				   System.out.println( "age: "+ people.get(i).getAge());
				   System.out.println( "image: " + people.get(i).getIma());
				   System.out.println( "status: " + people.get(i).getStatus());
				   for(int j =0; j<people.get(i).getFriend().length; j++)
					   System.out.println( "friend: " + people.get(i).getFriend()[j]);
			   }
	    else
		    System.out.println("Sorry, cannot find " + name +" :(");
	}
	
	/**
	 * Get parents' names for a person in people arrayList.
	 */
	public void parentsName(List<Profile> people) {
		System.out.println("Please enter your name: ");
		String name = in.next();
		int i = find(name, people);
		if(i != -1) 
			    System.out.println("Parents information, dad: " + people.get(i).getDad() +
				                ", mum: " + people.get(i).getMum());	
	}
	
	/**
	 * Get child's name for a person in people arrayList.
	 */
	public void childName(List<Profile> people) {
		System.out.println("Please enter your name: ");
		String name = in.next();
		int i = find(name, people);       
		if (i != -1) 
			     System.out.println("Child's name is: " + people.get(i).getChild());		
	}
	
	/**
	 * Search for a person if he/she in people arrayList.
	 * @return A integer that represent whether exist in the people.
	 */
	public int find (String name, List<Profile> people) {
		for (int i=0; i<people.size(); i++) 
			if (people.get(i).getName().equals(name)) {
				return i;          
			}
		return -1;			
	}

}
