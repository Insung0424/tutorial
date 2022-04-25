package ch14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

		private HashMap<Integer, Member> hashMap;
		public MemberHashMap() {
			hashMap = new HashMap<>();
			
		}
		
		public void addMember(Member member) {
			hashMap.put(member.getMemberId(), member);
		}
		
		public boolean removemember(int memberId) {
			if(hashMap.containsKey(memberId)) {
				hashMap.remove(memberId);
			}
			System.out.println("No element");
			return false;
		}
		
		public void showAll() {
			Iterator<Integer> ir = hashMap.keySet().iterator();
			while(ir.hasNext()) {
				int key = ir.next();
				Member member = hashMap.get(key);
				System.out.println(member);
			}
		}
}
