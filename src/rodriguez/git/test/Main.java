package rodriguez.git.test;

import java.util.ArrayList;

public class Main {

	int totalDillos;
	ArrayList<String> DILLOS = new ArrayList<String>();
	
	public Main(int totalDillos) {	
		this.totalDillos = totalDillos;
		System.out.println("== D I L L O ==");	
	}
	
	
	public ArrayList<String> generateDillos() {
		for(int i=0; i<totalDillos; i++) {
			DILLOS.add(String.valueOf(i));
			
			System.out.println("D");
			if(i > totalDillos / 5) {
				for(int j = 0; j<i; j++)
					System.out.println("D I");
					DILLOS.add("D I");
				for(int j = 0; j<i; j++)
					System.out.print(" L L O");
			}
			if(i > totalDillos / 4) {
				for(int j = 0; j<i; j++)
					System.out.println("D I L");
					DILLOS.add("D I L");
				for(int j = 0; j<i; j++)
					System.out.print(" L O");
			}
			if(i > totalDillos / 3) {
				for(int j = 0; j<i; j++) 
					System.out.println("D I L L");
					DILLOS.add("D I L L");
				for(int j = 0; j<i; j++)
					System.out.print(" O");
			}
			if(i > totalDillos / 2) {
				for(int j = 0; j<i; j++)
					System.out.println("D I L L O");
					DILLOS.add("D I L L O");
			}
			
			
			
		}
		
		return DILLOS;
	}
	
	public static void main(String[] args) {
		Main testMain = new Main(500);
		
		ArrayList<String> dillos = testMain.generateDillos();
		
		System.out.println("DILLOS COLLECTED");
		for(int i=0; i<dillos.size(); i++) {
			System.out.println(dillos.get(i));
		}
	}
	
	
}
