package day2;

import java.util.Scanner;

public class practice3 {

private static Scanner input;

//输入华氏度显示摄氏度
/**
 * @param args
 */
public static void main(String[] args) {
System.out.println("请输入华氏度：");
input = new Scanner(System.in);
double f = input.nextDouble(); 
double d = 5/9.0*(f-32);
System.out.println("摄氏度="+d);
	
	} 

}