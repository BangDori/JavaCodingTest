import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 수의 개수
    int N = sc.nextInt();
    
    // 공간 할당
    int[] A = new int[N];
    
    // 숫자 입력
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    // 버블 정렬
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < N - 1 - i; j++) {
        if (A[j] > A[j + 1]) {
          int temp = A[j];
          A[j] = A[j + 1];
          A[j + 1] = temp;
        }
      }
    }
    
    // 결과 출력
    for (int i = 0; i < N; i++) {
      System.out.println(A[i]);
    }
  }
}