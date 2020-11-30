package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		//Declare array
		String[] countries;
		
		//Define the array 
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		//Declare and define the array (only the size)
		String[] states = new String[5];
		states[0] = "Califorinia";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states.length);
		
		int i = 0;
		do {
			System.out.println("Do Loop: " + states[i]);
			i++;
		} while (i < states.length);
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			if (states[n] == "Texas") {
				System.out.println("State " + states[n] + " found!");
				stateFound = true;
			}
			n++;
		}
		
		for (int c = 0; c < states.length; c++) {
			System.out.println("For Loop: " + states[c]);
		}
	}

}
