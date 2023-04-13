import java.util.Scanner;

public class App {
  static int answer = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 수식 입력
    String example = sc.nextLine();
    
    // - 를 기준으로 자르기
    String[] str = example.split("-");
    for (int i = 0; i < str.length; i++) {
    	System.out.println(str[i]);
      int temp = mySum(str[i]);
      
      if (i == 0)
        answer = answer + temp; // 제일 앞에 것만 더해주고
      else
        answer = answer - temp; // 뒤에 부분은 더한 값들을 빼줌
    }
    System.out.println(answer);
  }
  
  static int mySum(String a) { // 나눠진 그룹의 더하기 연산 수행 함수
    int sum = 0;
    String temp[] = a.split("[+]");
    
    // 더하기
    for (int i = 0; i < temp.length; i++) {
    	System.out.println(temp[i]);
      sum += Integer.parseInt(temp[i]);
    }
    return sum;
  }
}