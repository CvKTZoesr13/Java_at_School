
import java.util.Scanner;

public class test {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// date of employment
		Date d1 = new Date(12, 8, 2020);
		Date d2 = new Date(12, 8, 2020);
		Date d3 = new Date(12, 8, 2020);
		// birthday
		Date b1 = new Date(16, 7, 2001);
		Date b2 = new Date(16, 7, 2001);
		Date b3 = new Date(16, 7, 2001);
		Employees e1 = new Employees("Nguyen Van", "Hoang", b1, d1);
		Employees e2 = new Employees("Nguyen Van", "B", b2, d2);
		Employees e3 = new Employees("Nguyen Van", "C", b3, d3);
		// employees array
		Employees arr[] = new Employees[3];
		arr[0] = e1;
		arr[1] = e2;
		arr[2] = e3;
		System.out.println(e1.toString());

		// dates array
		Date arrDate[] = new Date[3];
		for (int i = 0; i < arrDate.length; i++) {
			arrDate[i] = new Date(1, 1, 1);
		}
		Date arrDateOfEmployment[] = new Date[3];
		for(int i = 0; i < arrDateOfEmployment.length; i++) {
			arrDateOfEmployment[i] = new Date(2,2,2);
		}
		// Print table before update dates from keyboard
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("| Surname \t|\t Lastname \t|\t Birthday \t|\t Date of employment \t|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getSurName() + "\t|\t" + arr[i].getFirstName() + "\t" + "\t|\t"
					+ arr[i].getBirthday() + "\t|\t\t" + arr[i].getDateOfEmployment() + "\t|");
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		String surName = "", lastName = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input surname arr[" + i + "]: ");
			surName = sc.nextLine();
			System.out.println("Input lastname arr[" + i + "]: ");
			lastName = sc.nextLine();

			arrDate[i].setDate(i, i, i);
			arrDateOfEmployment[i].setDate(i, i, i);
			arr[i] = new Employees(surName, lastName, arrDate[i], arrDateOfEmployment[i]);
		}

		System.out.println("Initilazing an awesome table...");
		// Print table after doing everything
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println("| Surname \t|\t Lastname \t|\t Birthday \t|\t Date of employment \t|");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getSurName() + "\t|\t" + arr[i].getFirstName() + "\t" + "\t|\t"
					+ arr[i].getBirthday() + "\t|\t\t" + arr[i].getDateOfEmployment() + "\t|");
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		
		sc.close();
		System.exit(0);
	}

}
