package bai2;

import java.util.Scanner;

public class SinhVien {
	// attributes
	private String maSV, hoTen;
	private float dlt, dth;

	// constructor function (method)
	public SinhVien(String maSV, String hoTen, float dlt, float dth) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.dlt = dlt;
		this.dth = dth;
	}
	public SinhVien() {}
	// getter and setter methods
	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDlt() {
		return dlt;
	}

	public void setDlt(float dlt) {
		this.dlt = dlt;
	}

	public float getDth() {
		return dth;
	}

	public void setDth(float dth) {
		this.dth = dth;
	}
	// handle methods
	public void nhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sinh vien: ");
		this.maSV = sc.nextLine();
		System.out.println("Nhap vao ho ten sinh vien: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap vao diem ly thuyet: ");
		this.dlt = sc.nextFloat();
		System.out.println("Nhap vao diem thuc hanh: ");
		this.dth = sc.nextFloat();

		System.out.println("Diem trung binh: " + ((dlt + dth) / 2));
//		sc.close();

	}
	public float tinhDiemTB() {
		return ((dlt + dth) / 2);
	}
	
	
	static void inTieuDe() {
		System.out.printf("%10s %15s %10s %10s %10s\n", "Ma SV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB" );
	}
	
	public void xuatTieuDe() {
		System.out.printf("%10s %15s %10.1f  %10.1f %10.1f\n", maSV, hoTen, dlt, dth, ((dlt + dth) / 2));
	}	
	// override methods
	@Override
	public String toString() {

		return this.maSV + " - " + this.hoTen + "\n Co diem trung binh: " + ((dlt + dth) / 2);
	}
}
