import java.util.Scanner;

 class NhanVienSX extends NhanVien {
	private int soSanPham;

	public NhanVienSX(String MaNV) {
		super(MaNV);
		soSanPham = 0;
	}

	public NhanVienSX() {
		super();
		soSanPham = 0;

	}

	public double tinhLuong() {
		return soSanPham * 10000;

	}

	public void nhap() {
		super.nhap();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so san pham: ");
		soSanPham = sc.nextInt();
	}
	
	public static void inTieuDe() {
		NhanVien.inTieuDe();
		System.out.printf("%10s %15s %15s%n", " So san pham", "Phu cap", "Luong");
		
		
	}
	
	public void xuatDL() {
		super.xuatDL();
		System.out.printf("%10d %15.2f %15.2f %n", soSanPham, tinhPhuCap(), tinhLuong());
	}

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	

}
