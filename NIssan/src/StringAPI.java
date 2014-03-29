
public class StringAPI {

	public static void main(String[] args) {
	
		String a = "Amazing";
		
		String b = "bangladesh";
		
		String c = "amazing";
		
		
		//1.charAt
		System.out.println(b.charAt(6));
		
		//2.CompareTO
		System.out.println(a.compareTo(b));
		
		//3. CompareToIgnoreCase
		System.out.println(a.compareToIgnoreCase(c));
		

	}

}


/*
public class StringAPI {

public static void main(String[] args) {

	String a = "Amazing";
	
	String b = "bangladesh";
	
	String c = "apple";
	
	String d = "cram";
	
	System.out.println(a.charAt(0));
	
	System.out.println(b.charAt(6));
	
	System.out.println(c.charAt(0));
	
	System.out.println(d.charAt(3));
	

}

}
*/