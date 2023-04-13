import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue {
	public static void main(String[] args) {
		// 낮은 숫자 우선순위 큐
		PriorityQueue<Integer> pql = new PriorityQueue<>();
		
		// 높은 숫자 우선순위 큐
		PriorityQueue<Integer> pqh = new PriorityQueue<>(Collections.reverseOrder());

		// 추가
		pql.add(1);
		pql.add(12);
		pql.add(3);
		pql.add(7);
		pql.add(2);
		
		// 첫번째 값 제거
		pql.remove();
		
		// 첫번째 값 반환, 제거 X
		pql.peek();
				
		// 포함되어있는지 확인
		pql.contains(3);
		
		// 크기 출력
		pql.size();
		
		// 비어있는지 확인
		pql.isEmpty();
		
		// 초기화
		pql.clear();
	}
}