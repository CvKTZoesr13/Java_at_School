import java.util.Scanner;

public class Hang {
	private String tenHang;
	private float soLuong, donGia;

	// constructor functions (methods)
	public Hang(String tenHang, float soLuong, float donGia) {
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public Hang() {
	}

	// getter and setter functions
	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public void nhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten mat hang: ");
		tenHang = sc.nextLine();
		System.out.println("Nhap vao so luong: ");
		soLuong = sc.nextFloat();
		System.out.println("Nhap vao don gia: ");
		donGia = sc.nextFloat();

	}

	public float tinhTongTien() {
		float tongTien = 0;
		tongTien += donGia;
		return tongTien;
	}
	public static void inTieuDe() {
		System.out.printf("%15s %15s %15s %15s\n", "Ten Hang", "Don Gia", "So Luong", "Thanh Tien");
		
	}
	public void inDL() {
		System.out.printf("%15s %15.1f %15.1f %15.1f\n", tenHang, donGia, soLuong, donGia*soLuong);
	}
	
}
