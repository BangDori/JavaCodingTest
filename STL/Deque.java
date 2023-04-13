import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque {
	public static void main(String[] args) {
		// Deque 배열
		Deque<Integer> deque1 = new ArrayDeque<>();
		
		// Deque 리스트
		Deque<Integer> deque2 = new LinkedList<>();
		
		deque1.add(1);
		deque1.add(2);
		deque1.add(3);
		deque1.add(4);
		
		// 첫 번째 인덱스에 삽입
		deque1.addFirst(-1);

		// 마지막 인덱스에 삽입
		deque1.addLast(111); 
		
		// addFirst()와 동일
		deque1.push(15);
		
		// removeFirst()와 동일
		deque1.pop();
		
		// 첫 번째 인덱스 값 제거
		deque1.removeFirst();
		
		// 마지막 인덱스 값 제거
		deque1.removeLast();
		
		// 크기 출력
		deque1.size();
		
		// 첫 번째 인덱스 값 가져오기
		deque1.getFirst();
		
		// 마지막 인덱스 값 가져오기
		deque1.getLast();
		
		// 포함되어있는지 확인
		deque1.contains(3);
	}
}