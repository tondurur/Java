package abstraction;
	public abstract class SampleAC implements Laptop {

		@Override
		public void copy() {
			System.out.println("Copy code");

		}

		@Override
		public void past() {
			System.out.println("Past code");
		


		}

		
		public abstract void Security() ;
		public abstract void camera ();
			
		}





