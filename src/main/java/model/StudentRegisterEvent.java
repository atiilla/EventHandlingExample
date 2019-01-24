package model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import interfaces.StudentInterface;

@Component
@Scope("prototype")
@Primary
public class StudentRegisterEvent implements StudentInterface{

	private String name;
	private String email;
	private String schoolName;


 	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public StudentRegisterEvent(String name,String email,String schoolName) {
		super();
		this.name = name;
		this.email= email;
		this.schoolName = schoolName;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println("I am studying");
	}

	public void Take_a_break(int time) {
		System.out.println("I am taking a break of " + time + " minutes");
	}


	public void ShowStudent() {
		System.out.println("Student record:\nNAME: "+ name +"\nEMAIL: " + email + "\nSCHOOL: " + schoolName);
		
	}


	public void Study() {
		
		System.out.println(name + " is currently studying Java Spring at " + schoolName);
	}

	
}
