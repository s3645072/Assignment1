
public class Profile {
	private String name;
	private int age;
	private String[] friend;
	private String ima;
	private String status;
	
	/**
	 * A Class with basic parameters for a person.
	 * @param name The string to Profile.
	 * @param age The integer to Profile.
	 * @param ima The string to Profile.
	 * @param status The string to Profile.
	 * @param friend The string array to Profile.
	 */	
	public Profile(String name, int age, String ima, 
			String status, String[] friend) {
		this.name = name;
		this.age = age;
		this.ima =ima;
		this.status = status;
		this.friend = friend;
		
	}

	/**
	 * Get a name of a person.
	 * @return A type of string name of a person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get age of a person.
	 * @return A type of integer of a person.
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Get whether display image or not for a person.
	 * @return A type of string ima(Y/N).
	 */	
	public String getIma() {
		return ima;
	}
	
	/**
	 * Get a status of a person.
	 * @return A type of string status of a person.
	 */	
	public String getStatus() {
		return status;
	}	

	/**
	 * Get friends' name of a person.
	 * @return A type of string array that include all of names of a person's friends.
	 */
	public String[] getFriend() {
		return friend;
	}

	/**
	 * Get dad's name of a person.
	 * @return A type of string dad's name of a person.
	 */
	public String getDad() {
		return null;
	}

	/**
	 * Get mum's name of a person.
	 * @return A type of string mum's name of a person.
	 */
	public String getMum() {
		return null;
	}

	/**
	 * Get child's name of a person.
	 * @return A type of string child's name of a person.
	 */
	public String getChild() {
		return null;
	}

}
