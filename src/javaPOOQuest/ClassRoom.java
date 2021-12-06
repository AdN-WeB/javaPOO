package javaPOOQuest;

public class ClassRoom {
	
	public static void main (String[] args) {
		Wilder vianney = new Wilder("Vianney",true);
		Wilder anthony = new Wilder("Anthony", true);
		Wilder adam = new Wilder ("Adam", false);
		Wilder adrien = new Wilder ("Adrien", false);
		
		System.out.println( vianney.whoAmI());
		System.out.println( anthony.whoAmI());
		System.out.println( adam.whoAmI());
		System.out.println( adrien.whoAmI());
		
	}
	
	

}
