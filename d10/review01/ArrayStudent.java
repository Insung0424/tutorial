package review01;

import java.util.ArrayList;

public class ArrayStudent {
		
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;

	public ArrayStudent (int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); //여기 못함
	}

	//여기부터 못함
	public void addSubject(String name, int scorePoint) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(scorePoint);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject o : subjectList) {
			total = total + o.getScorePoint();
			System.out.println(studentName + "'s " + o.getName() + "score is " + o.getScorePoint());
		}
		System.out.println(studentName + "'s total score is " + total);
	}

}
