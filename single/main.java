package single;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent class properties");
		parent p = new parent();
		p.parent();
		
		
		
		System.out.println("child class properties");
		childcls c = new childcls();
		c.child();
		p.parent();
		
	}

}
