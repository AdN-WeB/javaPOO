package javaPOOQuest;

public class Wilder {
	
	//Initialization of attributes 
	String firstName;
	boolean aware;

	// constructor for this.attirbutes
	public Wilder (String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}

	//getter for firstame
	public  String getFirstName() {
		return this.firstName;
	}
	//setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//getter for aware
	public boolean isAware() {
		return this.aware;
	}
	//setter for aware
	public void setIsAware(boolean aware) {
		this.aware = aware;
		
	}
	//Method for return wilder with attributes 
	public  String whoAmI() {
		//If wilder is aware
		if (aware) {
			return "Je m'appelle " + firstName +  " et je suis aware";
		}
		//If not 
		else{
			return "Je m'appelle " + firstName + " et je ne suis pas aware";
		}
		
	}

}
