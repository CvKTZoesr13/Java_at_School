
public class Rectangle { 
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double calArea() {
		return (this.width * this.height) ;
	}
	public double calPerimeter() {
		return (this.width + this.height) * 2;
	}
	
	public static void main(String[] args) {
		Rectangle hinh1 = new Rectangle(12, 4);
		System.out.println("Chieu dai: "+ hinh1.getWidth());
		System.out.println("Chieu rong: "+ hinh1.getHeight());
		System.out.println("Dien tich: " + hinh1.calArea());
		System.out.println("Chu vi: " + hinh1.calPerimeter());
	}
}

