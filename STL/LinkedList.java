import java.util.LinkedList;
import java.util.ListIterator;

public class LiknedList {
	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		
		// 추가
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);
		link.add(7);
		link.add(8);
		
		// 첫 번째에 추가
		link.addFirst(-1);
		
		// 마지막 번째에 추가
		link.addLast(111);
		
		// 포함되어 있는지
		link.contains(1);
		
		// 인덱스 값 가져오기
		link.get(3);
				
		// 첫번째 인덱스 값 가져오기
		link.getFirst();
		
		// 마지막 인덱스 값 가져오기
		link.getLast();

		// 값 지정하기
		link.set(0, 99);
		
		// 비어있는지 확인하기
		link.isEmpty();
		
		// 첫 번째 인덱스 pop
		link.pop();
		
		// 첫 번째 인덱스 push
		link.push(3);

		// 첫번째 인덱스 제거하기
		link.removeFirst();
		
		// 인덱스 값 제거하기
		link.remove(3);
		
		// 마지막 인덱스 값 제거하기
		link.removeLast();
		
		// 크기 출력하기
		link.size();

		// 9이 저장되어 있는지 확인
		link.indexOf(9);
		
		// 순회
		for(int i : link) System.out.println(i);
		
		ListIterator it = link.listIterator(); // LinkedList의 ListIterator를 반환한다
		 
		// 정방향 순회
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println("");

		// 역방향 순회
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}

		// 초기화
		link.clear();
	}
}