package pack1;

public class Nameconstructors {
	
	
	String First_Name;
	String Middle_Name;
	String Last_Name;
	
	void setname(String First_Name) {//one parameter
	this.First_Name=First_Name;	
	}
	
	void setname(String First_Name,String Last_Name) {//two parameter
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
	}
	
	void setname(String First_Name,String Last_Name,String Middle_Name) {//three parameter
		this.First_Name=First_Name;
		this.Middle_Name=Middle_Name;
		this.Last_Name=Last_Name;		
	}

}