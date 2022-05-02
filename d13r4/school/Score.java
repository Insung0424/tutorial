package school;
public class Score {
	   private int studentId;//학번
	   Subject subject;//과목 어떤 과목이 몆점인지 클래스 과목을 불러오는 것
	   private int point;  //점수
	//성적의 생성자(변수) 변수에 클래스가 들어갈때는 언제나 클래스와 변수를 같이사용
	   public Score(int studentId, Subject subject, int point) {
		   this.studentId= studentId;
		   this.subject=subject;
		   this.point=point;
	   }
	   //toString() 인데 왜 쓰는지 모르겠음 학번과 과목, 성적을 반환
	   // 성적은 이미 변수가 있음 응용아님
	   @Override
		public String toString() {
			return studentId + subject.getSubjectName() + point;
		}
	 //학번,과목,점수의 get,set
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
