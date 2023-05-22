import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class P14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 집합에 포함되어 있는 문자열의 개수
		int M = Integer.parseInt(st.nextToken()); // 검사해야 하는 문자열의 개수
		int count = 0; // 집합에 포함된 문자열의 개수
		
		Map<Integer, String> set = new HashMap<>();
		for(int i = 1; i <= N; i++) {
			set.put(i+1, br.readLine());
		}
		
		for(int i = 0; i < M; i++) {
			String quiz = br.readLine();
			
			if(set.containsValue(quiz)) count++;
		}
		
		System.out.println(count);
	}
}