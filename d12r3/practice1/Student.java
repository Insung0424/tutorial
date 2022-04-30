package practice1;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new  Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s: subjectList) {
			total += s.getSubjectScore();
			System.out.println(studentName + " " + s.getSubjectName() + " " +  s.getSubjectScore());
		}
		System.out.println(studentName + " total " + total);
	}

}
