package packagetest;

import java.util.Scanner;

import packagemain.DanhSachSinhVien;
import packagemain.SinhVien;

public class test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("Menu:");
			System.out.println("1.	Thêm sinh viên vào danh sách.\r\n"
					+ "2.	In danh sách sinh viên ra màn hình.\r\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\r\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\r\n"
					+ "5.	Làm rỗng danh sách sinh viên <xóa dssv>.\r\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\r\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\r\n"
					+ "8.	Tìm kiếm tất cả sinh viên có tên được nhập vào từ bàn phím.\r\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao tới thấp.\r\n"
					+ "0.   	Thoát khỏi chương trình!"
					);
			System.out.println("Vui lòng chọn chức năng:");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				break;
			case 2:
				dssv.inDssv();
				break;
			case 3:
				if(dssv.kiemTraDanhSachRong()) {
					System.out.println("Danh sách sinh viên rỗng!");
				} else {
					System.out.println("Có sinh viên trong danh sách!");
				}
				break;
			case 4:
				System.out.println("Số sinh viên trong danh sách là: " +dssv.laySoluongSinhVien() + " sinh viên.");
				break;
			case 5:
				if(dssv.kiemTraDanhSachRong()) {
					System.out.println("Không có sinh viên trong danh sách. Không thể xóa!");
				} else {		
				dssv.lamRongDanhSach();
				System.out.println("Danh sách sinh viên đã bị xóa!");
				}
				break;
			case 6:
				System.out.println("Nhập vào mã sinh viên: "); String maSinhVien1 = sc.nextLine();
				SinhVien sv1 = new SinhVien(maSinhVien1);
				if(dssv.kiemTraTonTai(sv1)) {
					System.out.println("Sinh viên trên có trong danh sách!");
				} else {
					System.out.println("Sinh viên trên không tồn tại trong danh sách!");
				}
				break;
			case 7:
				System.out.println("Nhập vào mã sinh viên: "); String maSinhVien2 = sc.nextLine();
				SinhVien sv2 = new SinhVien(maSinhVien2);
				if(dssv.xoaSinhVien(sv2)) {
					System.out.println("Xóa thành công!");
				} else {
					System.out.println("Xóa thất bại, không có sinh viên này trong danh sách!");
				}
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			default:
				break;
			}
			
		}while(luaChon != 0);
	}
}
