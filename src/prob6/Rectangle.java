package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	
	@Override
	public String getArea() {
		// TODO Auto-generated method stub
		double result = width * height;
		
		return String.valueOf(result);
	}

	@Override
	public String getPerimeter() {
		// TODO Auto-generated method stub

		double result = (width + height) * 2;
		
		return String.valueOf(result);
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		
		width = width * s;
		height = height *s;
	}
}
