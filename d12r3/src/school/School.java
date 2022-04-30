package school;
import java.util.ArrayList;

public class School {
	//싱글톤 패턴으로 만듬
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good School";
	
	//학생과 성적 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	//싱글톤패턴에 필요한 기본생성자
	public School(){}
	//싱글톤패턴 instance생성
	public static School getInstance(){
		if(instance == null) 
			instance = new School();
		return instance;
	}
	//학생과 성적 리스트 get,set
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	//학생목록에 학생추가
	public void addStudent(Student student){
		studentList.add(student);
	}
	//성적목록에 성적추가
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}
