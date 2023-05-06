import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); // TestCase
		int count = 0;
		
		ArrayList<Planet> planet;
		ArrayList<Double> dis;
		
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int planetNo = Integer.parseInt(br.readLine());
			planet = new ArrayList<>();
			
			dis = new ArrayList<>();
			for(int j = 1; j <= planetNo; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				double distance = getDistance(x, x1, y, y1);
				double distance2 = getDistance(x, x2, y, y2);
				
				if(distance <= r || distance2 <= r) {					
					planet.add(new Planet(x, y, r));
					dis.add(distance);
				}				
			}
			
			for(int k = 0; k < planet.size(); k++) {
				int x = planet.get(k).x;
				int y = planet.get(k).y;
				int r = planet.get(k).r;
				
				double distance = getDistance(x, x2, y, y2);
				
				if(dis.get(k) <= r) {
					if(distance > r) count++;
				} else {
					if(distance <= r) count++;
				}
			}
			
			bw.write(count + "\n");
			
			count = 0;
			planet.clear();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static double getDistance(int x, int x1, int y, int y1) {
		int distance_x = x - x1;
		int distance_y = y - y1;
		
		return Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));
	}
}

class Planet {
	int x;
	int y;
	int r;
	
	Planet(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
}