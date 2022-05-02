package grade;

public class ME implements GE{
	//getGrade 는 학점을 알려주기위한 메서드이므로
		// grade 가 무엇인지 알려줘야함
		//System.out.println();가 아님
		String grade;
		@Override
		public String getGrade(int Point) {
			// 95~100 이므로 && 
			if(Point >= 95 && Point <= 100) 
				grade = "S";
			else if(Point >= 90 && Point <= 94) 
	//오류로 인해 성적이 100을 넘을 수 있으므로 100까지 제한을 만듬
				grade = "A";
			else if(Point >= 80 && Point <= 89)
				grade = "B";
			else if(Point >= 70 && Point <= 79)
				grade = "C";
			else if(Point >= 60 && Point <= 69)
				grade = "D";
			else 
				grade = "F";
			return grade;
		}
}