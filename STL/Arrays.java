import java.util.Arrays;
import java.util.Collections;

public class Arrays {
	public static void main(String[] args) {
		Integer[] array = {1, 26, 17, 25, 99, 44, 303};

		System.out.println(Arrays.toString(array));

		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// 내림차순 정렬
		Arrays.sort(array, Collections.reverseOrder());		
		System.out.println(Arrays.toString(array));
		
		// 부분 오름차순 정렬
		Arrays.sort(array, 0, 4);
		System.out.println(Arrays.toString(array));
		
		// 부분 내림차순 정렬
		Arrays.sort(array, 0, 4, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		// Collections.reverseOrder()을 적용하면 내림차순 정렬의 경우
		// Int[]가 아닌, Integer[]로 해야함
	}
}