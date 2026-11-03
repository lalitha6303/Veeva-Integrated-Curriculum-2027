package com.filehandling;

public class Student {

	    private String rollno;
	    private String age;
	    private String name;
	    private String m1;
	    private String m2;
	    private String m3;
	    private String m4;
	    private String m5;
	    private String grade;
	    public Student() {
	    }
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getM1() {
			return m1;
		}
		public void setM1(String m1) {
			this.m1 = m1;
		}
		public String getM2() {
			return m2;
		}
		public void setM2(String m2) {
			this.m2 = m2;
		}
		public String getM3() {
			return m3;
		}
		public void setM3(String m3) {
			this.m3 = m3;
		}
		public String getM4() {
			return m4;
		}
		public void setM4(String m4) {
			this.m4 = m4;
		}
		public String getM5() {
			return m5;
		}
		public void setM5(String m5) {
			this.m5 = m5;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public Student(String rollno, String age, String name, String m1, String m2, String m3, String m4, String m5,
				String grade) {
			super();
			this.rollno = rollno;
			this.age = age;
			this.name = name;
			this.m1 = m1;
			this.m2 = m2;
			this.m3 = m3;
			this.m4 = m4;
			this.m5 = m5;
			this.grade = grade;
		}
}
