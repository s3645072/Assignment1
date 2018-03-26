
public class Dependent extends Profile{
	private String dad;
	private String mum;
	
	/**
	 * Create a constructor for child named dependent.
	 * @param dad The string to Dependent.
	 * @param mum The string to Dependent.
	 */
	public Dependent(String name, int age, String ima, 
			String status, String[] friend, String dad, String mum) {
		super(name, age, ima, status, friend);
		this.dad = dad;
		this.mum = mum;
	}
	
	@Override
	public String getDad() {
		return dad;
	}
	
	@Override
	public String getMum() {
		return mum;
	}
	
	@Override
	public String[] getFriend() {
		return super.getFriend();	
	}

}
