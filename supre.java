class student{
	private int roll;
	private String name;
	void get(){
		roll=1;
		name="anika";
	}
	void display(){
		System.out.println("roll is" +roll);
		System.out.println("name is" +name);
	}
}
class result extends student{
	float mark;
	void get(){
		super.get();
		mark=100;
		
	}
	void display(){
		super.display();
		System.out.println("mark is" +mark);
	}
}
public class supre {
	public static void main(String args[]){
		result e=new result();
		e.get();
		e.display();
	}

}
