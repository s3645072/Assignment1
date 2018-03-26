import java.util.*;

public class Drive implements Appliable{
	int choice;
	DelLookDis dld = new DelLookDis();
	Add add = new Add();

	/**
	 * Create a arrayList named people for profile to store 
	 * all of the information for the person.
	 */
	public List<Profile> people=new ArrayList<Profile>();
	Scanner in = new Scanner(System.in);

	@Override
	public void add() {
		add.add(people);
	}
	
	@Override
	public void delete() {
		dld.delete(people);
	}
	
	@Override
	public void display() {
		dld.display(people);
	}
	
	@Override
	public void lookUp() {
		dld.lookUp(people);
	}
	
	/**
	   * Update information for a person.
	   */	
	public void update() {
		System.out.println("Please enter name you want to update: ");
		String name = in.next();
		for(int i = 0; i<people.size(); i++) {
			if (people.get(i).getName().equals(name)) {
				people.remove(i);
				add();
				System.out.println(name +" update successfully:)");
				break;
			}
		}		
			System.out.println("Sorry, cannot find " + name +" :(");
		
	}
	
	/**
	   * Get the relationship between two people(check whether they are friends or not).
	   */	
	public void relation() {
		System.out.println("Please enter name1: ");
		String name1 = in.next();
		System.out.println("Please enter name2: ");
		String name2 = in.next();
		for(int i= 0; i<people.size(); i++) {
			if (people.get(i).getName().equals(name1))
				for(int j=0; j<people.get(i).getFriend().length; j++) {
					if(people.get(i).getFriend()[j].equals(name2)) {
						System.out.println(name1 + " and " + name2 +" are friends. ");
						return;
			}	
		}
		}
			System.out.print(name1 + " and " + name2 +" are not friends. ");						
	}
	
	@Override
	public void parentsName() {
		dld.parentsName(people);
	}
	
	@Override
	public void childName() {
		dld.childName(people);
	}
	
	/**
	   * Get a choice for a people to know what should be done.
	   * @param choice The integer to begin.
	   */	
    public void begin(int choice){	
			
		if(choice == 1)
			add();
		else if(choice == 2)
			delete();
		else if(choice == 3)
			lookUp();
		else if(choice == 4)	
				display();
		else if(choice == 5)
			update();
		else if(choice == 6)
			relation();
		else if(choice == 7)
			parentsName();
		else if(choice == 8)
			childName();
    }
	
}

