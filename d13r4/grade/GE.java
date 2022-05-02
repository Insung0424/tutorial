package grade;

public interface GE {
	//성적평가방식 인터페이스 
	//성적을 구하므로 당연히 변수가 존재
	//public String getGrade(); 구현부가 없는 인터페이스의 기본
	//인터페이스에서 변수를 선언하면 상수화 됨 int Point; 사용안됨
	public String getGrade(int Point);
	//GenerateGradeReport 에서 평가 방식마다 if문의 길이 달라지는데
	//2가지 클래스를 만드는 것보다 하나의 인터페이스에서 나눠지는게 효율적이고
	//그 변수 또한 하나로 고정된다?
}
