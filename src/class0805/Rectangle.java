package class0805;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(String name, int length, int width) {
		super(name);
		this.length = length;
		this.width = width;

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public int getArea() {

		return length * width;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
	

}
