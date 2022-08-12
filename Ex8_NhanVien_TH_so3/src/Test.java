
public class Test {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		nv1.nhap();
		nv2.nhap();
		NhanVien.inTieuDe();
		nv1.xuatTieuDe();
		nv2.xuatTieuDe();
	}
}
