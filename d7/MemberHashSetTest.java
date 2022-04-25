package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
			
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"Lee");
		Member memberKim = new Member(1002,"Kim");
		Member memberKang = new Member(1003,"Kang");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAllMember();
		//해시코드를 사용할 때에는 동일한 값이 입력가능하므로 이퀄과 해시코드값을 
//		재정의 해서 중복을 방지해야한다.
		Member memberHong = new Member(1003,"Hong");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
//		memberHashSet.removeMember(memberKim.getMemberId());
//		memberHashSet.showAllMember();
	}

}
