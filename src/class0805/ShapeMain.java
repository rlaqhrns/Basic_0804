package class0805;

public class ShapeMain {

	public static void main(String[] args) {


		Shape squ = new Rectangle("도형1", 5, 3);
		
		int area = squ.getArea();
		int peimeter = squ.getPerimeter();
		
		System.out.println(squ.getName());
		System.out.println("area : " + squ.getArea());
		System.out.println("perimeter : " + squ.getPerimeter());
		System.out.println(area);
		System.out.println(peimeter);
		
	}

}
