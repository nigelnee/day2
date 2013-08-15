package day2;
import java.util.Scanner;
public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入本金：");
		Scanner input = new Scanner(System.in);
		double f = input.nextDouble(); 
		System.out.println("本金为："+ f);
		double d = f*(1+2.25/100);
		System.out.println("存取一年后的本息是="+d);
		double e = f*(1+2.7/100*2);
		System.out.println("存取两年后的本息是="+e);
		double i = f*(1+3.24/100*3);
		System.out.println("存取三年后的本息是="+i);
		double g = f*(1+3.6/100*5);
		System.out.println("存取五年后的本息是="+g);
		
	}

}
