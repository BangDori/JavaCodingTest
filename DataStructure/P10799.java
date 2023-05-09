import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brackets = br.readLine();
		char[] bracketStack = new char[brackets.length()];
		int[] bracketIdx = new int[brackets.length()];		
		int[] laser = new int[brackets.length() / 2];
		int[] bar = new int[brackets.length()];
		int laserSize = 0;
		int loc = 0; // 현재 읽고 있는 괄호의 인덱스
		int barStart = 0; // 저장된 막대기 바의 시작 위치
		int length = 0; // 현재 막대기의 길이
		int result = 0; // 총 막대기의 개수
		
		for(int i = 0; i < brackets.length(); i++) {
			char bracket = brackets.charAt(i);
			
			switch(bracket) {
				case '(':
					length = 0;
					bracketStack[loc] = bracket;
					bracketIdx[loc++] = i;
					break;
				case ')':
					length++;					
					if(length == 1) laser[laserSize++] = i-1;
					
					int pos = bracketIdx[--loc];
					
					if(length >= 2) {
						bar[barStart++] = pos;
						bar[barStart++] = i;
					};
					break;
				default:
					break;
			}
		}
		
		for(int i = 0; i < barStart; i += 2) {
			int s = bar[i];
			int e = bar[i+1];
			
			for(int k = 0; k < laserSize; k++) {
				if (laser[k] >= s && laser[k] <= e) result++;
				else if (laser[k] > e) break;
			}
		}
		
		result = result + barStart/2;		
		System.out.println(result);
	}
}