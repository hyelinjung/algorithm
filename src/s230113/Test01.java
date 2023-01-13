package s230113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test01 {

	public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	int n = Integer.parseInt(stringTokenizer.nextToken());
	int m = Integer.parseInt(stringTokenizer.nextToken());
	long[] S = new long[n+1];
	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	for(int i =1; i<=n; i++) {
		S[i] = S[i-1]+ Integer.parseInt(stringTokenizer.nextToken());
	}
	for(int j=0; j<m; j++) {
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int a = Integer.parseInt(stringTokenizer.nextToken());
		int b = Integer.parseInt(stringTokenizer.nextToken());
		System.out.println(S[b]-S[a-1]);
	}

	}

}
