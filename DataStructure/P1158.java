import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1158 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] round = new int[N+1];
		int[] remain = new int[N+1];
		int count = 1; // 카운트 계산
		int loc = 0; // 기존 배열 돌기
		int store = 0; // 저장 번호
		
		for(int i = 0; i < N; i++) {
			round[i] = i+1;
		}
		
		while(store != N) {
			if(round[loc] != 0) {				
				if(count == K) {
					remain[store++] = round[loc];
					round[loc] = 0;
					count = 1;
				} else count++;
			}
			
			loc = (loc + 1) % N;
		}
		
		System.out.print("<");
		for(int i = 0; i < N-1; i++) {
			System.out.print(remain[i] + ", ");
		}
		System.out.println(remain[N-1] + ">");
	}
}
