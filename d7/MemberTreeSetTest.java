package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
	
}
public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new Mycompare());
//		// 순서대로 자동정렬됨
		set.add("Hong");
		set.add("Kang");
		set.add("Kim");
		set.add("Lee");
//		
		System.out.println(set); //[Hong, Kang, Kim, Lee]
//		MemberTreeSet memberTreeSet = new MemberTreeSet();
//		
//		Member memberHong = new Member(1004,"Hong");
//		Member memberLee = new Member(1001,"Lee");
//		Member memberKim = new Member(1002,"Kim");
//		Member memberKang = new Member(1003,"Kang");
//		
//		memberTreeSet.addMember(memberHong);
//		memberTreeSet.addMember(memberLee);
//		memberTreeSet.addMember(memberKim);
//		memberTreeSet.addMember(memberKang);
//		
//		memberTreeSet.showAllMember();
//		그냥 실행하면 오류가 발생 멤버에서 compareTo 를 @Override해줘야 사용가능
//		compareTo에서 if true return 이 -1 이고 else if return 이 1이면 정렬이 반대가됨
	}

}
