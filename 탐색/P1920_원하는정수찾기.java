import java.util.Arrays;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 데이터 개수
    int N = sc.nextInt();
    int[] A = new int[N];
    
    // 데이터 입력
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    // 수 정렬
    Arrays.sort(A);
    
    // 찾아야 할 숫자의 개수
    int M = sc.nextInt();
    
    // 찾아야 할 숫자 입력
    for (int i = 0; i < M; i++) {
      boolean find = false;
      int target = sc.nextInt();
      // 이진 탐색 시작
      int start = 0;
      int end = A.length - 1;
      
      while (start <= end) {
        int midi = (start + end) / 2;
        int midV = A[midi];
        if (midV > target) {
          end = midi - 1;
        } else if (midV < target) {
          start = midi + 1;
        } else {
          find = true;
          break;
        }
      }
      
      if (find) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}