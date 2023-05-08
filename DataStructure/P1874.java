import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		int[] stack = new int[n];
		StringBuilder output = new StringBuilder();
		int order = 1; // 순서대로 숫자가 삽입
		int size = 0; // 현재 개수
		
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < n; i++) {
			int num = input[i]; // 삽입된 숫자
			
			while(order <= num) {
				stack[size++] = order++; // 순서대로 삽입
				output.append('+');
			}
			
			if(stack[--size] == num) {
				output.append('-');
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		for(int i = 0; i < output.length(); i++) {
			System.out.println(output.charAt(i));
		}
	}
}