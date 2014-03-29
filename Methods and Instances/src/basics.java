
public class basics {
	private String girlName;
	
	public basics ( String name) {
		girlName=name;
	}
	
	public void setName (String name) {
		girlName=name;
	}

	public String getName(){
		return girlName;
	}

	public void saying(){
		System.out.printf("You have the grouched %s\n", getName());
	}

}

/* simple way to use constructor in conjunction with partnering code
 * 
public class basics {
	private String girlName;
	
	public basics ( String name) {
		girlName=name;
	}
	
	public void setName (String name) {
		girlName=name;
	}

	public String getName(){
		return girlName;
	}

	public void saying(){
		System.out.printf("You are the grouchiest %s\n", getName());
	}

}
*/



/* how to make basic instances
public class basics {
	private String girlName;
	public void setName (String name) {
		girlName=name;
	}

	public String getName(){
		return girlName;
	}

	public void saying(){
		System.out.printf("You are the grouchiest %s", getName());
	}

}
*/