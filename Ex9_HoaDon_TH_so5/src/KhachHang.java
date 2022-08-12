import java.util.Scanner;

public class KhachHang {
	private String hoTen, diaChi;
	// constructor methods
	public KhachHang(String hoTen, String diaChi) {

		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	public KhachHang() {}
	
	
	// getter and setter methods
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	// handle methods
	public void nhap() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho ten khach hang: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap vao dia chi khach hang: ");
		diaChi = sc.nextLine();
	}
	@Override
	public String toString() {

		return "Khach hang: " + this.hoTen + "\n" + "Dia chi: " + this.diaChi;
	}
	
}
