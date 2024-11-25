package encaptulation.practice;

public class Student {
	
	private int Age ;
	
	public int getAge () {
		return Age;
	}
		public void setAge (int a) {
			this.Age =a;
		}
		public static void main(String[] args) {
			
			Student s = new Student();
			
			s.setAge(40);
			System.out.println(s.getAge());
			
			
			
			
			
			
			
			
		}
	}
	
	
	
	
	
	
	
	

