package pack1;

public class human {
private String name;
private int age;

public void setname(String Name) {
	name=Name;
}
public String getname() {
	return name;
}

public void setage(int Age) {
	age=Age;
}
public int getage() {
	return age;
}


public class eyes{//inner class
	private String color;
	private String type;
	public void blink() {
		System.out.println("Eyes blinked");
	}
	public void setColor(String Color) {
		color=Color;
	}
	public String getColor(){
		return color;
	}
	public String gettype() {
		return type;
	}
	
	public void settype(String Type) {
		type=Type;
	}
}

public class heart{//inner class
	private boolean condition;
	public void beat() {
		if(condition=true) {
		System.out.println("heart beating");
	}}
	public void setcondition(boolean Condition) {
		condition=Condition;
	}
}
	
}//human end
