package review01;

import java.util.ArrayList;

public class ArrayStudent {

	//생성자 기본을 잘못알고 있고 향상된 for문 사용 arrayList사용	
	private String studentName;
	private int studentId;
	private ArrayList<Subject> subjectList;
	
	public ArrayStudent(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList ) {
			total += s.getSubjectScore();
			System.out.println(studentName + "'s " + s.getSubjectName() + " test score is " + 
		s.getSubjectScore());
		}
		System.out.println(studentName + "'s total score is " + total);
	}
	
	
	
	
}
