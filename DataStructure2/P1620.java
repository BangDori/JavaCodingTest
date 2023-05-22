import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class P1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
			
		String[] poketmonDict = new String[N+1];
		Map<String, Integer> poketmon = new HashMap<>();
		for(int i = 1; i <= N; i++) {
			String name = br.readLine();
			
			poketmonDict[i] = name;			
			poketmon.put(name, i);
		}
		
		for(int i = 0; i < M; i++) {
			String quiz = br.readLine();
			
			if(quiz.charAt(0) >= '0' && quiz.charAt(0) <= '9') {
				bw.write(poketmonDict[Integer.parseInt(quiz)] + "\n");
			} else {
				bw.write(poketmon.get(quiz) + "\n");				
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}	
}