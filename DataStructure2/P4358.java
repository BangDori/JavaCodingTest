import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P4358 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> trees = new HashMap<>();
		String tree = "";
		int count = 0;
		
		while(sc.hasNext()) {
			tree = sc.nextLine();
			if(tree.length() == 0) break;
			
			if(trees.containsKey(tree)) {
				trees.put(tree, trees.get(tree) + 1);
			} else {
				trees.put(tree, 1);
			}
			
			count++;
		}
		
		Set<String> treeSet = trees.keySet();
		ArrayList<String> treeList = new ArrayList<>(treeSet);
		
		Collections.sort(treeList);
		
		for(String name : treeList) {
			System.out.printf("%s %.4f\n", name, (trees.get(name) * 100 / (double)count));
		}
	}
}