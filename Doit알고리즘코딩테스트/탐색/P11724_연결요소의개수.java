import java.io.*;
import java.util.*;

public class App {
  static ArrayList<Integer>[] A;
  static boolean visited[];
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 노드 개수와 에지 개수 입력
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    // 노드 개수
    int n = Integer.parseInt(st.nextToken());
    
    // 에지 개수
    int m = Integer.parseInt(st.nextToken());
    
    // 노드 개수 + 1 배열 생성
    A = new ArrayList[n + 1];
    visited = new boolean[n + 1];
    
    // 인접 리스트 초기화
    for (int i = 1; i < n + 1; i++) {
      A[i] = new ArrayList<Integer>();
    }
    
    
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      
      // 양 방향 간선이므로 양쪽으로 간선을 더 해준다
      A[s].add(e);
      A[e].add(s);
    }
    
    
    int count = 0;
    for (int i = 1; i < n + 1; i++) {
      if (!visited[i]) { // 미 방문한 정점이 없을 때까지 반복
        count++;
        DFS(i);
      }
    }
    
    System.out.println(count);
  }
  
  static void DFS(int v) {
	  
	// 방문했다면 return
    if (visited[v]) {
      return;
    }
    
    // 방문
    visited[v] = true;
    for (int i : A[v]) {
      if (visited[i] == false) { // 연결 정점 중 방문하지 않았던 정점만 탐색함
        DFS(i);
      }
    }
  }
}