import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		Stack<Integer> myStack = new Stack<>();
		
		for(int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch(command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				myStack.add(num);
				break;
			case "pop":
				int popNum = myStack.size() == 0 ? -1 : myStack.pop();				
				System.out.println(popNum);
				break;
			case "top":
				int topNum = myStack.size() == 0 ? -1 : myStack.lastElement();				
				System.out.println(topNum);
				break;
			case "empty":
				if(myStack.empty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "size":
				System.out.println(myStack.size());
				break;
			default:
				break;
			}
		}
	}
}