import java.util.HashSet;

public class HashSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		// 추가
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		
		// 삭제
		set.remove(2);
		
		// 존재 여부
		set.contains(1);
		
		// 크기
		set.size();
		
		// 초기화
		set.clear();
		
		System.out.println(set);
	}
}