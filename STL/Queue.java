import java.util.LinkedList;
import java.util.Queue;

public class Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// 추가
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		// 포함되어있는지 확인
		queue.contains(3);
		
		// 크기 출력
		queue.size();
		
		// 비어있는지 확인
		queue.isEmpty();
		
		// 첫 번째 인덱스 값 제거
		queue.remove();
		
		// 해당하는 값 제거
		queue.remove(3);
		
		System.out.println(queue);
		
		// 초기화
		queue.clear();		
	}
}