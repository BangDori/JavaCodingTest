import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// 배열 선언
		ArrayList<Integer> array = new ArrayList<>();
		
		// 추가
		array.add(1);
		array.add(3);
		array.add(2);
		array.add(6);
		array.add(3);
		array.add(9);
		array.add(4);

		// 오름차순 정렬
		Collections.sort(array);
		System.out.println(array);
		
		// 내림차순 정렬
		Collections.sort(array, Collections.reverseOrder());
		System.out.println(array);
		
		// 문자열의 경우, 대소문자 구분없이 오름차순
		Collections.sort(array, String.CASE_INSENSITIVE_ORDER);
		
        // 문자열의 경우, 대소문자 구분없이 내림차순
        Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        
		// 지정
		array.set(0, 5);
		
		// 0번째 인덱스 제거
		array.remove(0);
		
		// 0번째 인덱스 가져오기
		array.get(0);

		// 3번째 인덱스 제거
		// 인덱스 혹은 문자열의 경우 문자열 입력 가능
		array.remove(3);

		// 크기 출력
		array.size();

		// 배열이 비어있는지 확인
		array.isEmpty();
		
		// 값이 존재하는지 확인
		array.contains(3);		
		
		// 해당 엘리먼트의 인덱스 리턴
		array.indexOf(3);
		
		// 초기화
		array.clear();
	}
}