
import java.util.Scanner;

/*
 Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
    .
    .
    5) input a = x, then output : 1, 3, 5, 7, .......
 */
public class Problem_2 {

	static void generatesOddNumberSeries(int n) {
		int count=0;
		for (int i = 1; i <=Integer.MAX_VALUE; i++) {
			if(i%2 !=0)
			{
				System.out.print(" "+i);
				count++;
			}
			if(count==n)
				break;
				
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter a number for series : ");
		int a=s.nextInt();
		generatesOddNumberSeries(a);
	}
	

}
