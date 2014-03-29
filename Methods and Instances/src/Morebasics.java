
import java.util.Scanner;

class Morebasics { 

	public static void main(String[] args) {
		
		basics basicsObject= new basics("Grinch");
		basics basicsObject2 = new basics("Christmas");
		basicsObject.saying();
		basicsObject2.saying();	
		
	}
	
}

/* simple way to use constructor in conjunction with partnering code
 *
import java.util.Scanner;

class Morebasics { 

	public static void main(String[] args) {
		
		basics basicsObject= new basics("Grinch");
		
		basicsObject.saying();
			
		
	}
	
}
*/

/*  How to extract and return string name for Instance
import java.util.Scanner;

class Morebasics { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		basics basicsObject= new basics();
		
		System.out.println("Enter name of current gf here: ");
		
		String temp = input.nextLine();
		
		basicsObject.setName(temp);
		
		basicsObject.saying();
		
	}
	
}
*/