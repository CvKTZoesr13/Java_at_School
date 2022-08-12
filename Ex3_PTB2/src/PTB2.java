import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class PTB2 {
	private double a, b, c;

	public PTB2(double a, double b, double c) {
		if (a == 0) {
			this.a = 1;
		} else {
			this.a = a;
		}
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("0.#");
		if(this.a == 1) {
		return "Phuong trinh co dang x^2" + " + " + format.format(this.b) + "x"
				+ " + " + format.format(this.c) + " = 0";
		} else if (this.c == 0) {
			return "Phuong trinh co dang " + format.format(this.a) + "x^2" + " + " + format.format(this.b) + "x"
					+" = 0";
		} else {
			return "Phuong trinh co dang " + format.format(this.a) + "x^2" + " + " + format.format(this.b) + "x"
					+ " + " + format.format(this.c) + " = 0";
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void Input(/* double a, double b, double c */) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Input a: ");
			this.a = sc.nextDouble();
		} while (a == 0);

		System.out.println("Input b: ");
		this.b = sc.nextDouble();

		System.out.println("Input c: ");
		this.c = sc.nextDouble();
		sc.close();

	}

	public String doSomething() {
		DecimalFormat format = new DecimalFormat("0.#");
		double x1 = 0;
		double x2 = 0;
		double delta = this.b * this.b - 4 * this.a * this.c;
		if (delta == 0) {
			x1 = (-b) / (2 * a);
			return "Phuong trinh co mot nghiem duy nhat la x = " + x1;
		} else if (delta > 0) {
			x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			return "Phuong trinh co hai nghiem phan biet la x1 = " + format.format(x1) + " va x2 = " + format.format(x2);
		}
		return "Phuong trinh vo nghiem";
	}

	public static void main(String[] args) {
		System.out.println("Chuong trinh giai phuong trinh bac 2 ax^2 + bx + c = 0");

		PTB2 a = new PTB2(4, 12, 6);
//		System.out.println(a.toString());
		a.Input();
		System.out.println(a.toString());
		
		System.out.println(a.doSomething());
	}

}
