package s230118;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	int b[] = new int[a]; //배열생성
	
	for(int i = 0; i<a; i++ ) {//배열 초기화
		b[i] = sc.nextInt();
	}
	
	for(int p=0; p<a-1;p++) { //배열 수 오름차순 정렬
		for(int q= 0; q<a-1-p; q++) {
			if(b[p]>b[q]) {
				int temp = b[q]; //변수 선언 후 초기화 
				b[q]=b[p];
				b[p]=temp;
			}
		}
	}
	
	for(int j =0; j<a; j++) {
		System.out.println(b[j]);
	}

	}

}
