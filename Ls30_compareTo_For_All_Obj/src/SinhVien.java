import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
	// attributes
	private int maSV;
	private String hoTen, tenLop;
	private float diemTB;

	// constructor methods
	public SinhVien() {
	};

	public SinhVien(int maSV, String hoTen, String tenLop, float diemTB) {

		this.maSV = maSV;
		this.hoTen = hoTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	// getter and setter methods
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	// compareTo method
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSV - o.maSV;
	}

	// handle methods
	public void nhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mã sinh viên: ");
		this.maSV = sc.nextInt();
		System.out.println("Nhập vào họ tên sinh viên: ");
		sc.nextLine();
		this.hoTen = sc.nextLine();
		System.out.println("Nhập vào tên lớp: ");
		this.tenLop = sc.nextLine();

	}

	public String xuat() {
		return this.maSV + " - " + this.hoTen + " - " + this.tenLop;
	}
}
