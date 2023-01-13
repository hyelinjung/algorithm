package s1220;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //내가 입력한 값을 변수에 초기화
		int a = sc.nextInt(); //int 형을 입력받기 위한
		 //String b = Integer.toString(a);  // 숫가형 -> 문자형으로 바꿈
		String b =sc.next();
		
		char[] c = b.toCharArray(); // b를 다시 배열로 변환
		int sum = 0; //합계 변수 초기화
		for (int i = 0; i < c.length; i++) { //합계를 구하기위해 인덱스 수 만큼 for문으로 돌림
			sum += c[i] - '0'; //횟수만큼 합이 구해짐
		}
		System.out.println(sum); //반복문이 끝나고 합계 
	
	}

	}


