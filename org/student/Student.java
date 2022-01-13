package org.student;

import org.department.Departmentt;

public class Student extends Departmentt {
	
	public void studentName()
	{
		System.out.println("Kalaivani R");
	}
	
	public void studentDept()
	{
		System.out.println("Copmputer Technoloy");
	}
	
	public void studentId()
	{
		System.out.println("12bx23");
	}
	
	
	public static void main(String[] args) {
		
		Student Std = new Student();
		Std.studentName();
		Std.studentDept();
		Std.studentId();
		Std.collegeName();
		Std.collegeRank();
		Std.collegeCode();
		Std.deptName();
		
		
	}
	// studentName(),studentDept(),studentId()

}
