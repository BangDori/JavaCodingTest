import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2164 {
    public static int[] card;
	public static int head = 0;
	public static int tail;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		card = new int[2*N + 1];
		tail = N;
		for(int i = 0; i < N; i++) {
			card[i] = i+1;
		}
		
		while(tail - head != 1) {
			head++;
			
			card[tail++] = card[head++];
		}
		
		System.out.println(card[head]);
	}
}