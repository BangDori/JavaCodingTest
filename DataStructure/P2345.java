import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P2345 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] paper = new int[N*1000];
		int loc = 0;
		
		StringBuilder sb = new StringBuilder(); // 풍선 저장
		for(int i = 1; i <= N; i++) {
			sb.append(i);
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 풍선 번호
		for(int i = 0; i < N; i++) {
			paper[i] = Integer.parseInt(st.nextToken());
			if(paper[i] > 0) paper[i] -= 1;
		}
		
		do {
			System.out.print(sb.charAt(loc) + " ");
			System.out.println("??");
			
			if(sb.length() == 1) break;

			int num = (sb.charAt(loc) - '1') % sb.length();
			sb.deleteCharAt(loc);
			
			loc = (loc + paper[num]) % sb.length();
			
			if(loc < 0) loc += sb.length();
			
			if(loc >= sb.length()) loc = sb.length() - 1;
		} while(true);
	}
}