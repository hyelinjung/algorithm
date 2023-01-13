package s230113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int A[][] = new int[n+1][n+1];
		for(int i=0; i<= n; i++) {
		st = new StringTokenizer(br.readLine());
		for(int j = 0; j<=n; j++) {
			A[i][j] =Integer.parseInt(st.nextToken());
		}
			
		}//for 종료
		
		int D[][]= new int[n+1][n+1];
		for(int i = 0; i<=n; i++) {
			for(int j=0; j<=n;j++) {
				
			}
		}
	}
}
