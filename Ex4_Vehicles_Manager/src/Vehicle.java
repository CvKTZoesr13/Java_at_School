import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

public class Vehicle {
	private String carOwnerName, kindOfVehicle;
	private double price;
	double capacity;

	public Vehicle(String carOwnerName, String kindOfVehicle, double capacity, double price) {
		this.carOwnerName = carOwnerName;
		this.kindOfVehicle = kindOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public String getKindOfVehicle() {
		return kindOfVehicle;
	}

	public void setKindOfVehicle(String kindOfVehicle) {
		this.kindOfVehicle = kindOfVehicle;
	}

	public String getCapacity() {
		DecimalFormat format = new DecimalFormat("0.#");
		return format.format(capacity);
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getPrice() {
		DecimalFormat format = new DecimalFormat("0.#");
		return format.format(price);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String calTax() {
		DecimalFormat format = new DecimalFormat("0.#");
		double tax = 0;

		if (this.capacity < 100) {
			tax = this.price * 0.01;
		} else if (this.capacity >= 100 && this.capacity <= 200) {
			tax = this.price * 0.03;
		} else if (this.capacity > 200) {
			tax = this.price * 0.05;
		}
		return format.format(tax);
	}

	public void PrintList(Vehicle arr[]) {
		// Print table
		System.out.println("| Ten chu xe \t|\t Loai xe \t|\t Dung tich \t|\t Tri gia \t|\t Thue phai nop |");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCarOwnerName() + "\t|\t\t" + arr[i].getKindOfVehicle() + "\t|\t\t"
					+ arr[i].getCapacity() + "\t|\t\t" + arr[i].getPrice() + "\t|\t" + arr[i].calTax() + "\t\t|");
		}
	}

	public static void main(String[] args) {
		String nameOfOwner = "", nameOfCar = "";
		double capacity = 0, price = 0;

		Vehicle arr[] = new Vehicle[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhap ten chu xe arr [" + i + "]: ");
			nameOfOwner = sc.nextLine();
			System.out.print("Nhap loai xe: arr [" + i + "]: ");
			nameOfCar = sc.nextLine();
			System.out.print("Nhap dung tich xe: arr [" + i + "]: ");
			capacity = sc.nextDouble();
			System.out.print("Nhap gia xe: arr [" + i + "]: ");
			price = sc.nextDouble();
			sc.nextLine();

			arr[i] = new Vehicle(nameOfOwner, nameOfCar, capacity, price);
		}

		// Print table
		System.out.println("| Ten chu xe \t|\t Loai xe \t|\t Dung tich \t|\t Tri gia \t|\t Thue phai nop |");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCarOwnerName() + "\t|\t\t" + arr[i].getKindOfVehicle() + "\t|\t\t"
					+ arr[i].getCapacity() + "\t|\t\t" + arr[i].getPrice() + "\t|\t" + arr[i].calTax() + "\t\t|");
		}
		sc.close();
	}
}
