package s230119;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int end_index=1;
	int start_index=1;
	int count = 1;
	int sum = 1;
	
	while(end_index != n) {
		if(n == sum) {
			count++;
			end_index++;
			sum += end_index;
		}else if(n<sum) {
			sum-=start_index;
			start_index++;
		}else {
		 end_index++;sum+= end_index;
		}
	}
	
	System.out.println(count);

	}

}
