package school;
import java.util.ArrayList;

import pp1.Define;

public class Subject {
	 	 private String subjectName;//과목 이름
	     private int subjectNumber;// 과목 고유번호
	     private int gradeType;// 과목 평가 방법 기본은 A,B 방식
	
	   //수강 신청한 학생 리스트 private들어감
	     private ArrayList<Student> studentList = new ArrayList<>();
	
	//Subject생성자 기본아님 변수받아서 생성하며 구현부에서 성적평가방식도 필요
	     public Subject(String subjectName, int subjectNumber) {
	    	 this.subjectName=subjectName;
	    	 this.subjectNumber=subjectNumber;
	    	 this.gradeType=Define.AB_TYPE;
	     }
//이름,아이디,성적평가방식,학생리스트 get,set

		public String getSubjectName() {
			return subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}

		public int getSubjectNumber() {
			return subjectNumber;
		}

		public void setSubjectNumber(int subjectNumber) {
			this.subjectNumber = subjectNumber;
		}

		public int getgradeType() {
			return gradeType;
		}

		public void setgradeType(int gradeType) {
			this.gradeType = gradeType;
		}

		public ArrayList<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(ArrayList<Student> studentList) {
			this.studentList = studentList;
		}
	
	//register() 메서드를 호출하면 학생리스트에 학생이 추가 됨
	//수강신청역할 변수부분의 학생이 해당과목을 수강해서 성적을 가지게 됨
		public void register(Student student) {
			studentList.add(student);
		}
}
