package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.rectangleArea()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.rectanglePerimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.rectangleDiagonal()));
		sc.close();

	}

}
