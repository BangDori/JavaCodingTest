import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ETC {
	public static void main(String[] args) throws IOException {
		// 한번에 하나만 입력 받기
		Scanner sc = new Scanner(System.in);
		
		int scInt = sc.nextInt(); // int
		String scString = sc.next(); // String
		double scDouble = sc.nextDouble(); // double
		long scLong = sc.nextLong(); // long
		
		System.out.println(scInt + " " + scString + " " + scDouble + " " + scLong);
		
		// 한줄에 모든 값을 입력 받기
		// InputStreamReader 하고 readLine() 사용해서 입력받으려면 throws IOException 추가 필수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 토크나이저로 띄어쓰기 구분해서 토큰 구분하기
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 1번 방법
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		
//		System.out.println(a + " " + b);
		
		// 2번 방법
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// 특수문자로 구분하기
		StringTokenizer st2 = new StringTokenizer(br.readLine(), "!@#$%");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		String sNum = "1234";
		int i = Integer.parseInt(sNum);
		double d = Double.parseDouble(sNum);
		long l = Long.parseLong(sNum);
		float f = Float.parseFloat(sNum);
		
		System.out.println(i + " " + d + " " + l + " " + f);
	}
}