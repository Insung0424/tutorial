package school;
import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName;  //과목 이름
	private int subjectId;      // 과목 고유번호
	private int gradeType;      // 과목 평가 방법 기본은 A,B 방식
	
	//수강 신청한 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	//Subject생성자 기본아님 변수받아서 생성하며 구현부에서 성적평가방식도 필요
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;   //기본적으로 A, B 타입
	}
//이름과 아이디,성적평가방식에 대한 get,set
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
//arrayList를 활용한 학생리스트와 과목리스트
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	//register() 메서드를 호출하면 학생리스트에 추가 됨
	//수강신청 = 변수의 학생이 해당과목을 수강해서 성적을 가지게 됨
	public void register(Student student){  
		studentList.add(student);
	}
}
