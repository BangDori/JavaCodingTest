import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class P1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 피연산자의 수
		int N = Integer.parseInt(br.readLine());
		// postfix
		String postfix = br.readLine();
		Stack<Double> myStack = new Stack<>();
		// 알파벳에 대응되는 숫자
		double number[] = new double[26];
		
		for(int i = 0; i < N; i++) {
			// 알파벳에 대응되는 숫자 저장
			double num = Integer.parseInt(br.readLine());
			number[i] = num;
		}
		
		for(int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				// 피연산자
				myStack.add(number[ch-'A']);
			} else {
				// 연산자
				double b = myStack.pop();
				double a = myStack.pop();
				
				if(ch == '+') {
					myStack.add(a + b);
				} else if(ch == '-') {
					myStack.add(a - b);
				} else if(ch == '*') {
					myStack.add(a * b);
				} else if(ch == '/') {
					myStack.add(a / b);
				}
			}
		}
		
		System.out.printf("%.2f", myStack.pop());
	}
}
