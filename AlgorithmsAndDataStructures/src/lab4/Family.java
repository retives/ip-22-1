package lab4;
import java.time.LocalDate;
import java.util.ArrayList;
public class Family {
	class Person{
		protected String fName;
		protected String sName;
		protected LocalDate birthday;
		protected String occupation;
		protected int income;
		public String getfName() {
			return fName;
		}
		public String getsName() {
			return sName;
		}
		@Override
		public String toString() {
			return "Person [fName=" + fName + ", sName=" + sName + ", birthday=" + birthday + ", occupation="
					+ occupation + ", income=" + income + "]";
		}
		public LocalDate getBirthday() {
			return birthday;
		}
		public String getOccupation() {
			return occupation;
		}
		public int getIncome() {
			return income;
		}
		
		
		
	}

	Person husband;
	Person wife;
	ArrayList<Person> children = new ArrayList<>();
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
	
	public void printChildren() {
		for(Person c: children) {
			c.toString();
		}
	}
	public void addChild(Person c) {
		children.add(c);
	}
	
}
