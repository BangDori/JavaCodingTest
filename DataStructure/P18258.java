import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P18258 {
    public static int myQueue[] = new int[2000001];
	public static int front = 0;
	public static int back = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int result = 0;
			
			switch(command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				
				myQueue[back++] = num;
				break;
			case "pop":
				if(front != back) {
					result = myQueue[front++];
				} else {
					result = -1;
				}
				
				break;
			case "size":
				result = back - front;
				break;
			case "empty":
				result = front == back ? 1 : 0;
				break;
			case "front":
				if(front != back) {
					result = myQueue[front];
				} else {
					result = -1;
				}
				break;
			case "back":
				if(front != back) {
					result = myQueue[back - 1];
				} else {
					result = -1;
				}
				break;
			default:
				break;
			}
			
			if(!command.equals("push")) bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}