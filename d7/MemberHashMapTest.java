package ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004,"Hong");
		Member memberLee = new Member(1001,"Lee");
		Member memberKim = new Member(1002,"Kim");
		Member memberKang = new Member(1003,"Kang");
		
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAll();
		
		HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Lee");
		hashMap.put(1002,"Kim");
		hashMap.put(1003,"Kang");
		hashMap.put(1004,"Hong");
		
		System.out.println(hashMap);

	}

}
