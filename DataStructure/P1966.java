import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1966 {
    	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] priority; // 중요도
		int[] docs;
		int loc; // 프린터의 출력 위치
		int count; // 프린터 출력 개수
		
		int test = Integer.parseInt(br.readLine());
		for(int i = 0; i < test; i++) {
			loc = count = 0; // 초기화
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken()); // 문서의 개수
			int M = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄돼었는지
			
			docs = new int[N];
			priority = new int[10];
			st = new StringTokenizer(br.readLine()); // 중요도 입력
			for(int k = 0; k < N; k++) {
				String pri = st.nextToken(); // 문서의 우선순위
				
				priority[Integer.parseInt(pri)]++; // 우선순위 갯수
				docs[k] = Integer.parseInt(pri); // 문서의 우선순위
			}
			
			for(int k = 9; k >= 0; k--) {
				if(priority[k] == 0) continue;
				
				int start = loc;
				do {
					if(docs[loc] == k) {
						count++;
						priority[k] -= 1;
						
						if(loc == M) {
							System.out.println(count);
							break;
						}
					}
					loc = (loc + 1) % N;
				} while(start != loc && priority[k] != 0);
			}
		}
	}
}