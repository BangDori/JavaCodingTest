import java.util.Scanner;

public class P1929_소수구하기 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // 범위
    int M = in.nextInt();
    int N = in.nextInt();
    int[] A = new int[N + 1];
    for (int i = 2; i <= N; i++) {
      A[i] = i;
    }
    
    // 제곱근 까지 수행
    for (int i = 2; i <= Math.sqrt(N); i++) {
      if (A[i] == 0) {
        continue;
      }
      
      // A의 배수 모두 제거
      for (int j = i + i; j <= N; j = j + i) {
        A[j] = 0;
      }
    }
    
    // 소수 출력
    for (int i = M; i <= N; i++) {
      if (A[i] != 0) {
        System.out.println(A[(int) i]);
      }
    }
  }
}