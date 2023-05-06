import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P10866 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		Deque<Integer> myDeque = new LinkedList<>();
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int result = -2;
			
			switch(command) {
			case "push_front":
				myDeque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				myDeque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				result = myDeque.isEmpty() ? -1 : myDeque.pollFirst();
				break;
			case "pop_back":
				result = myDeque.isEmpty() ? -1 : myDeque.pollLast();
				break;
			case "size":
				result = myDeque.size();
				break;
			case "empty":
				result = myDeque.isEmpty() ? 1 : 0;
				break;
			case "front":
				result = myDeque.isEmpty() ? -1 : myDeque.peekFirst();
				break;
			case "back":
				result = myDeque.isEmpty() ? -1 : myDeque.peekLast();
				break;
			}
			
			if(result != -2) System.out.println(result);
		}
	}
}
