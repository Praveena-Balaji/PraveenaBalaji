package org.student;
import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name is Praveena");
	}
	public void studentDept() {
		System.out.println("Student dept is IT");
	}
	public void studentId() {
		System.out.println("Student id is 205037");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();

	}

}
