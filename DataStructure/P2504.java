import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class P2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> myStack = new Stack<>();
		myStack.add('@'); // emptyStack 에러가 발생하지 않도록 더미 추가
		
		String quiz = br.readLine(); // 입력 값
		int result = 0; // 결과 값
		int cur = 1; // 현재 값
		boolean isAdd = false;
				
		for(int i = 0; i < quiz.length(); i++) {
			Character bracket = quiz.charAt(i);
			
			switch(bracket) {
			case ')':
				if(myStack.pop() == '(') {
					if(isAdd) {
						result += cur;
						isAdd = false;
					};
					cur /= 2;
				} else {
					System.out.println(0);
					return;
				}
				
				break;
			case ']':
				if(myStack.pop() == '[') {
					if(isAdd) {
						result += cur;
						isAdd = false;
					}
					cur /= 3;
				} else {
					System.out.println(0);
					return;
				}
				
				break;
			default:
				if(bracket == '(') cur *= 2;
				else if(bracket == '[') cur *= 3;
				myStack.add(bracket);
				isAdd = true;
				
				break;
			}
		}

		if(myStack.size() > 1) result = 0;
		System.out.println(result);
	}
}