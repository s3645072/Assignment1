
public class Adult extends Profile{
	private String child;
	
	/**
	 * Create a constructor for child named dependent.
	 * @param child The string to Adult.
	 */
	public Adult(String name, int age, String ima, 
			String status, String[] friend, String child) {
		super(name, age, ima, status, friend);
		this.child= child;
	}
	
	@Override
	public String getChild() {
		return child;
	}
	
	

}
