

import java.util.Scanner;

/*
 Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......
 */
public class Problem_3 {

	static void generatesOddSeries(int n) {
		int count = 0;
		if(n%2==0)
		{
			n=n-1;
		}

		for (int i = 1; i < Integer.MAX_VALUE; i++) {

			if (count == n) // 1 2 3 4//4
				break;
			if (i % 2 != 0) {
				System.out.print(" " + i);
				count++;
			}
			

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Series ... ");
		int a = sc.nextInt();
		generatesOddSeries(a);
	}

}
