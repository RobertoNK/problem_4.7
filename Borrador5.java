import java.util.Scanner;

public class Borrador5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int number = input.nextInt();
		int original = number;
		int count =0;
		while(number>0) {
			number=number/10;
			count++;
		}
		
		System.out.println("The number "+original+" has "+ count+" digits");
	}

}
