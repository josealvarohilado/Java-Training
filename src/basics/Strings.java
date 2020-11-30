package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book title contains " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		//String lastName = "Short";
		//String SSN = "65498461";
		
		System.out.println(firstName.substring(0, firstName.length()));
		
	}
}
