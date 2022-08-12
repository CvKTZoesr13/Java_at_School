import java.util.Arrays;
import java.util.Scanner;

public class HoaDon {
	private String soHD, ngayHD;
	private int soMatHang;
	private KhachHang kh = new KhachHang();
	private Hang dsHang[];
	private float tongTienHang = 0;

	// constructor methods
	public HoaDon(String soHD, String ngayHD, int soMatHang, KhachHang kh, Hang[] dsHang, float tongTienHang) {
		this.soHD = soHD;
		this.ngayHD = ngayHD;
		this.soMatHang = soMatHang;
		this.kh = kh;
		this.dsHang = dsHang;
		this.tongTienHang = tongTienHang;
	}

	public HoaDon() {
	}

	// getter and setter methods
	public String getSoHD() {
		return soHD;
	}

	public void setSoHD(String soHD) {
		this.soHD = soHD;
	}

	public String getNgayHD() {
		return ngayHD;
	}

	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}

	public int getSoMatHang() {
		return soMatHang;
	}

	public void setSoMatHang(int soMatHang) {
		this.soMatHang = soMatHang;
	}

	public KhachHang getKh() {
		return kh;
	}

	public void setKh(KhachHang kh) {
		this.kh = kh;
	}

	public Hang[] getDsHang() {
		return dsHang;
	}

	public void setDsHang(Hang[] dsHang) {
		this.dsHang = dsHang;
	}

	public float getTongTienHang() {
		return tongTienHang;
	}

	public void setTongTienHang(float tongTienHang) {
		this.tongTienHang = tongTienHang;
	}

	// handle methods
	public void nhap() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so hoa don: ");
		soHD = sc.nextLine();
		System.out.println("Nhap ngay/thang/nam lap hoa don: ");
		ngayHD = sc.nextLine();
		System.out.println("Nhap vao so mat hang: ");
		soMatHang = sc.nextInt();
		System.out.println("Nhap vao thong tin khach hang: ");
		kh.nhap();
		System.out.println("Nhap vao danh sach mat hang: ");
		dsHang = new Hang[soMatHang];
		for (int i = 0; i < dsHang.length; i++) {
			System.out.println("Nhap vao mat hang thu " + (i + 1) + ":");
			dsHang[i] = new Hang();
			dsHang[i].nhap();

		}
	}

	public void inHD() {
		float tongSL = 0, tongTT = 0;
		System.out.println("\t Ma HD: " + this.soHD + "\t\t\t" + "Ngay ban: " + this.ngayHD);
		System.out.println("\t Khach hang: " + this.kh.getHoTen() + "\t\t\t" + "Dia chi: " + this.kh.getDiaChi());
		Hang.inTieuDe();
		for (Hang h : dsHang) {
			h.inDL();
			tongTT += (h.getSoLuong() * h.getDonGia());
			tongSL += h.getSoLuong();
		}
		System.out.printf("\t %10s %10s %15.1f %15.1f ", "Tong tien", " ", tongSL, tongTT);
	}

	public void sapXep() {
		Arrays.sort(dsHang, (a, b) -> a.getTenHang().compareTo(b.getTenHang()));
		for (int i = 0; i < dsHang.length; i++) {
			for (int j = i + 1; j < dsHang.length; j++) {
				if (dsHang[i].getTenHang().equals(dsHang[j].getTenHang()) == true) {
					Arrays.sort(dsHang, new Sortbyroll());
				}
			}

		}

	}
}
