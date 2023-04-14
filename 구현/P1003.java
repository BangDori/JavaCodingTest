import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] fibonacci = new int[41];		
		int T = Integer.parseInt(br.readLine()); // Test Case
				
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int x = 2; x < fibonacci.length; x++) {
			fibonacci[x] = fibonacci[x-1] + fibonacci[x-2];
		}
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) bw.write(1 + " " + 0 + "\n");
			else bw.write(fibonacci[N-1] + " " + fibonacci[N] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}	
}