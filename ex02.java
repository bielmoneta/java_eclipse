package curso_java_udemy;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = 2.00;
		double y = 100.64;
		double z = 150.00;
		double area_a, area_b, area_c;
		
		
		area_a = 3.14159 * (Math.pow(x, 2.0));
		area_b = 3.14159 * (Math.pow(y, 2.0));
		area_c = 3.14159 * (Math.pow(z, 2.0));
		
		System.out.printf("A = %.4f %n",area_a);
		System.out.printf("A = %.4f %n",area_b);
		System.out.printf("A = %.4f %n",area_c);
		
		
	}
}