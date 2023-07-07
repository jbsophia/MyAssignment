package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()//Multilevel inheritance
	{
		System.out.println("Sophia babu");
	}
	public void studentDept()
	{
		System.out.println("Computer science");
	}
	public void studentId()
	{
		System.out.println("2122");
	}
	
	public static void main(String[] args) {
		
		Student S=new Student();
		S.studentName();
		S.studentDept();
		S.studentId();
		S.deptName();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		
	}

}
