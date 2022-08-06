package pack1;

public class doubleconstructors {

 static	class student{
		byte age;
		String rollno;
		String Name;
	
		student change_parameters (student s1) {
			s1.age=10;
			s1.rollno="21sw081";
			s1.Name="Farasthe";
			return s1;
		}
		
		student(){
		this.age=0;
		this.rollno="xxSW000";
		this.Name="default";
			
		}
		
		student(student s){
			this.change_parameters(s);
		}
		void display() {
		System.out.println(this.Name);
		System.out.println(this.age);
		System.out.println(this.rollno);
		}
	}
	public static void main(String[] args) {
		student s1,s2; //two objects created
		
		s1 = new student();// initializing first object 
		
		s1.display();//calling first object display method to see values before changing values 
		
		s2 = new student(s1.change_parameters(s1));//using constructor of s2 to change the values of
		//s1 using the change parameters method
		
		s1.display();//displaying s1 values after chaning vales
	}
}
