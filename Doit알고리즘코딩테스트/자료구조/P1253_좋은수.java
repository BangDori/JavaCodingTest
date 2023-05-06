import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    // 수의 개수
    int N = Integer.parseInt(bf.readLine());
    
    // 결과값
    int Result = 0;
    long A[] = new long[N];
    StringTokenizer st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < N; i++) {
      // Token들을 Long 타입으로 변환한 후 배열에 추가
      A[i] = Long.parseLong(st.nextToken());
    }

    // 배열 정렬
    Arrays.sort(A);

    // 배열 탐색
    for (int k = 0; k < N; k++) {
      long find = A[k];
      int i = 0;
      int j = N - 1;

      while (i < j) {  // 투포인터 알고리즘 
        if (A[i] + A[j] == find) {
          // find는 서로 다른 두 수의 합이여야됨을 체크
          if (i != k && j != k) {
            Result++;
            break;
          } else if (i == k) {
            i++;
          } else if (j == k) {
            j--;
          }
          // find보다 작다면, i++
        } else if (A[i] + A[j] < find) {
          i++;

          // find보다 크다면 j--
        } else {
          j--;
        }
      }
    }
    System.out.println(Result);
    bf.close();
  }
}