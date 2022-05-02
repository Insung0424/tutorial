package school;
import java.util.ArrayList;

public class School {
	//싱글톤 패턴으로 만듬
	private static School instance = new School();
	//싱글톤패턴에 필요한 기본생성자 여기는 static아님 
	private School () {}
	//학교 이름 필요는 없음
	
	//학생과 성적 리스트
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	//싱글톤패턴 instance생성
	public static School getInstance() {
		if(instance == null)
			instance = new School();
		return instance;
	}
	//학생과 성적 리스트 get,set
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	//학생목록에 학생추가
	public void addStudent(Student student) {
		studentList.add(student);
	}
	//성적목록에 성적추가
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	
}
