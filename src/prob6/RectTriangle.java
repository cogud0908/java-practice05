package prob6;

public class RectTriangle extends Shape{
	
	public RectTriangle(double w, double h)
	{
		width = w;
		height = h;
	}
	
	@Override
	public String getArea() {
		// TODO Auto-generated method stub
		
		double result = (width * height) * 0.5; 
		
		return String.valueOf(result);
	}

	@Override
	public String getPerimeter() {
		// TODO Auto-generated method stub
		
		double result = (width + height) + Math.sqrt((width*width)+(height*height));
		
		return String.valueOf(result);
	}	
	
	
}
