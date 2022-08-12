import java.util.Scanner;

public class NhanVienDemo {
	static NhanVien dsnv[];
	static int n;
	static void nhapDSNV() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nhan vien n: ");
		n = sc.nextInt();
		dsnv = new NhanVien[n];
		for (int i = 0; i < dsnv.length; i++) {
			System.out.println("Nhap nhan vien thu " + (i + 1) + ":");
			dsnv[i] = new NhanVien();
			dsnv[i].nhap();
		}
	}
	static void inDSNV() {
		System.out.println("Danh sach nhan vien sau khi nhap: ");
		
		NhanVien.xuatTieuDe();
		for(NhanVien nv : dsnv) {
			nv.xuat();
		}
	}
	
	public static void main(String[] args) {
		nhapDSNV();
		inDSNV();
	}
}
