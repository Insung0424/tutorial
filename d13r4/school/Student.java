package school;
import java.util.ArrayList;

public class Student {
	
	   		private int studentId;//학번
			private String studentName;//이름
			private Subject majorSubject;
			//전공 과목 String 으로 변수 선언이아니라 subject클래스를 사용하는것
	
	//학생의 성적 리스트 private들어감
			private ArrayList<Score> ScoreList = new ArrayList<Score>();
	
	//학생생성자(변수)
			public Student(int studentId, String studentName, Subject majorSubject) {
				this.studentId=studentId;
				this.studentName=studentName;
				this.majorSubject=majorSubject;
			}
	//addSubjectSocre(점수) 메서드가 호출되면 성적리스트에 추가 됨
			// 변수에는 클래스를 호출하면됨
			public void addSubjectSocre(Score score) {
				ScoreList.add(score);
			}
//학생아이디와 이름,전공,성적리스트의 get,set
			public int getStudentId() {
				return studentId;
			}
			public void setStudentId(int studentId) {
				this.studentId = studentId;
			}
			public String getstudentName() {
				return studentName;
			}
			public void setstudentName(String studentName) {
				this.studentName = studentName;
			}
			public Subject getMajorSubject() {
				return majorSubject;
			}
			public void setMajorSubject(Subject majorSubject) {
				this.majorSubject = majorSubject;
			}
			public ArrayList<Score> getScoreList() {
				return ScoreList;
			}
			public void setScoreList(ArrayList<Score> scoreList) {
				ScoreList = scoreList;
			}
			
}
