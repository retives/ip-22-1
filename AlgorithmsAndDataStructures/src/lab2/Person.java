package lab2;

import java.time.LocalDate;

public class Person {
	String firstName;
	 String secondName;
	 LocalDate birthday;
	 String job;
	 int income;
	public Person(String firstName, String secondName, LocalDate birthday, String job, int income) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthday = birthday;
		this.job = job;
		this.income=income;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
}
