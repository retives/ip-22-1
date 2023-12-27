package lab2;


import java.util.ArrayList;

class Family {
	 Family next;
	 Person husband;
	 Person wife;
	 ArrayList<Person> children = new ArrayList<Person>();
	 public Family() {
		 
	 }
	public Person getHusband() {
		return husband;
	}
	public void setHusband(Person husband) {
		this.husband = husband;
	}
	public Person getWife() {
		return wife;
	}
	public void setWife(Person wife) {
		this.wife = wife;
	}
	public void addChild(Person child) {
		children.add(child);
	}
	public void getChildren() {
		for(Person child:children) {
			System.out.print(child.firstName +" "+child.secondName+ ", ");
		}
	}
	public void printFamily() {
		System.out.print("Husband: "+husband.firstName +" "+husband.secondName+"| Wife: "+wife.firstName+" "+wife.secondName+"| Children: ");
		this.getChildren();
	}
}
