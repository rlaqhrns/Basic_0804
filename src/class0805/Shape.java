
package class0805;

public abstract class Shape {
	String name;

	Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract int getArea();

	public abstract int getPerimeter();

}
