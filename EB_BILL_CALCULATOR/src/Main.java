import java.util.Scanner;
public class Main{
	static double selection(int unit) {
		double amount;
		if(unit<=500) {
			CalculateBelow500 below5000bject=new CalculateBelow500();
			amount=below5000bject.calculate(unit);
		}
		else {
			CalculateAbove500 Above500object=new CalculateAbove500();
			amount=Above500object.calculate(unit);
		}
		return amount;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ENTER NO UNITS:");
		int no_units=input.nextInt();
		System.out.println(selection(no_units));
		input.close();
	}

}
