import java.util.Scanner;

public class Circle {
	private double R;
	private String circleName;
	private final double Pi = 3.14;

	public Circle(double r, String circleName) {
		R = r;
		this.circleName = circleName;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		this.R = r;
	}

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public double calArea() {
		return this.R * this.R * this.Pi;
	}

	public double calPerimeter() {
		return this.R * 2 * this.Pi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.circleName + " has radius R = " + this.R;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle[] arr = new Circle[2];

		for (int i = 0; i < arr.length; i++) {

			System.out.print("Input a" + "[" + i + "]" + " = ");
			double r;
			r = sc.nextDouble();
			arr[i] = new Circle(r, "myCircle");
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Output a" + "[" + i + "]" + " is " + arr[i] + "\n" + "It has the Area: "
					+ arr[i].calArea() + " and the Perimeter is: " + arr[i].calPerimeter());

		}

		sc.close();
	}
}
