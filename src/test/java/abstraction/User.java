package abstraction;

public class User {

	public static void main(String[] args) {
		
		Lenovo lvoe = new Lenovo();
		lvoe.copy();
		lvoe.past();
		lvoe.Security();
		
		HP hp = new HP();
		
		hp.copy();
		hp.Security();
		hp.past();
		hp.camera();

	}


}

