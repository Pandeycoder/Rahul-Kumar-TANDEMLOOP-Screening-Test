
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 
 `Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 */

public class Problem_4 {


	static void multipleOfNum(ArrayList<Integer> l)
	{
	
		Map<Integer, Integer> res=new HashMap<>();
		
		for(int i=1; i<=9; i++)
		{
			res.put(i, 0);
		}
		
		  for (int i = 1; i <= 9; i++) {
	            int count = 0;
	            for (int num : l) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            res.put(i, count);
	        }

	    
	        System.out.println(res);
	}
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a size of number ");
	int n=sc.nextInt();
	
	ArrayList<Integer> l=new ArrayList<>();
	
	for(int i=0; i<n; i++)
	{
		System.out.print(" Enter a number "+(i+1) +" : ");
		l.add(sc.nextInt());
	}
	multipleOfNum(l);
	
	
	
}



}
