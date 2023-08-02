package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	
	public double rectangleArea() {
		return Width * Height;
	}
	
	public double rectanglePerimeter() {
		double result = 2 * (Width + Height);
		return result;
	}
	
	public double rectangleDiagonal() {
		double x = Math.pow(Width, 2);
		double y = Math.pow(Height, 2);
		
		double resultado =  Math.sqrt((x +y));
		return resultado;
	}

}
