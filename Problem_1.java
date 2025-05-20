



import java.util.Scanner;

/*
 Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication 
 and Division using class.
 Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
 Data type :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
 */
public class Problem_1 {
	double a;
	double b;

	void input(Scanner s) {
		
		System.out.print(" Enter a first number  :- ");
		this.a = s.nextDouble();
		System.out.print(" Enter a second number :-  ");
		this.b = s.nextDouble();
		
	}

	double sum() {
		return a + b;
	}

	double sub() {
		return a - b;
	}

	double multi() {
		return a * b;
	}

	double div() {
		if (b == 0) {
            System.out.println("Error Division by zero.");
            return 0;
        }
        return a / b;
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		Problem_1 ob = new Problem_1();
		String choice;
		String cont;
		
		do
		{
			ob.input(s);
			
			System.out.println(" Choose Symbol :- \n 1) Add (+) \n 2) Subtraction (-) \n 3) Multiplication (+) \n 4) Division (/)  ");
			choice=s.next();
			
			switch (choice) {
            case "+":
                System.out.println("Sum of two number: " + ob.sum());
                break;
            case "-":
                System.out.println("Sub of two number: " + ob.sub());
                break;
            case "*":
                System.out.println("Multiply two number: " + ob.multi());
                break;
            case "/":
                System.out.println("Divided two number : " + ob.div());
                break;
            default:
                System.out.println("Invalid operation symbol.");
        }
			System.out.print("Do you want to continue (y/n)? ");
            cont = s.next();
		}
		while(cont.equalsIgnoreCase("y"));
		System.out.println("Thanku for using calculator. Goodbye!");

	}

}

