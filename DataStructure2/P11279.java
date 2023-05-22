import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Collections;

public class P11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 연산의 개수
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				if(heap.size() == 0) bw.write(0 + "\n");
				else bw.write(heap.poll() + "\n");
			} else 
				heap.add(num);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}