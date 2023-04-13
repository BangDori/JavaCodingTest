import java.util.Stack;

public class Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// 마지막에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		// 마지막 삭제
		stack.pop();
		
		// 크기 출력
		stack.size();

		// 비어있는지 확인
		stack.empty();
		
		// 3이 있는지 확인
		stack.contains(3);
		
		// 첫 번째 요소 출력
		stack.firstElement();
		
		// 마지막 번째 요소 출력
		stack.lastElement();
		
		// 초기화
		stack.clear();
	}
}