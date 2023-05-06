import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		Stack<Character> myStack = new Stack<>();
		
		for(int i = 0; i < count; i++) {
			String parenthesis = br.readLine();
			
			for(int k = 0; k < parenthesis.length(); k++) {
				char ch = parenthesis.charAt(k);
				
				switch(ch) {
				case '(':
					myStack.push(ch);
					break;
				case ')':
					if(myStack.size() == 0) {
						myStack.push(ch);
					} else {						
						if(myStack.lastElement() == '(') myStack.pop();
						else myStack.push(ch);
					}
					break;
				default:
					break;
				}
			}
			
			if(myStack.size() == 0) System.out.println("YES");
			else {
				System.out.println("NO");
				myStack.clear();
			}			
		}
	}
}