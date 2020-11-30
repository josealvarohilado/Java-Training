package basics;

public class Weather {

	public static void main(String[] args) {
		// This program will give us suggestions of what to wear based on the weather (temperature)
		int temperature = 61;
		String sunCondition = "Sunny";
		
		if (temperature > 80){
			System.out.println("It's pleasant to wear shorts and t-shirt.");
		}
		else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeved shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		
	}

}
