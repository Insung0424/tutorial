package school;
public class Score {
	int studentId;   //학번
	Subject subject; //과목
	int point;      //점수
	//성적의 생성자(변수)
	public Score( int studentId, Subject subject, int point){
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
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
//toString() 인데 왜 쓰는지 모르겠음 학번과 과목, 성적을 반환
	public String toString(){
		return "학번:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}
}
