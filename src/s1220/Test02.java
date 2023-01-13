package s1220;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int[] b = new int[a]; //a 길이만큼 배열 생성
	for(int i=0; i<b.length; i++) { //배열 인덱스에 들어갈 값 삽입
		b[i] = sc.nextInt();
	}
	int max = 0; //최고값
	int sum = 0; //합
	for(int i=0;i<b.length;i++) { //배열에서 가장 큰값과 합을 구하기 위해서
		if(b[i]>max) max = b[i];
		
		sum += b[i];
	}
	
	System.out.println("총점 : "+ sum/max*100/a);
	
	}

}
