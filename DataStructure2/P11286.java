import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class P11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
				
			if(num == 0) {
				if(heap.size() == 0) {
					System.out.println(0);
					continue;
				} else {
					int head = heap.remove();
					if(map.get(head) != null) {
						map.put(head, map.get(head) - 1);
						
						if(map.get(head) == 0) map.remove(head);
						System.out.println("-" + head);
					} else {
						System.out.println(head);
					}
						
				}				
			} else {
				int absNum = Math.abs(num);
				heap.add(absNum);
				
				if(num < 0) {
					if(map.containsKey(absNum)) map.put(absNum, map.get(absNum) + 1);
					else map.put(absNum, 1);
				}
			}
		}
	}
}