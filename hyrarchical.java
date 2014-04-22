class student {
	int roll;
	String name;
	void get(){
		roll=123;
		name="anika";
	}
	void display(){
		System.out.println("inside student");
		System.out.println("roll is" +roll);
		System.out.println("name is" +name);
	}
}
class exam extends student{
	float mark;
	void get(){
		mark=100;
		
	}
	void display()
	{
		System.out.println("inside exam");
		System.out.println("mark is" +mark);
	}
	
}
class result extends exam{
	student s=new student();
	exam e=new exam();
	void get(){
		s.get();
		e.get();
		
	}
	void display(){
		s.display();
		e.display();
	}
	
}
public class hyrarchical {
	public static void main(String args[]){
		result r=new result();
		r.get();
		r.display();
	}

}
