import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	// attributes
	Set<String> thungPhieuRutThamTrungThuong = new HashSet<String>();

	// constructor functions
	public RutThamTrungThuong_HashSet(Set<String> thungPhieuRutThamTrungThuong) {
		super();
		this.thungPhieuRutThamTrungThuong = thungPhieuRutThamTrungThuong;
	}

	public RutThamTrungThuong_HashSet() {
	};

	// handles methods
	public boolean themPhieuDuThuong(String giaTri) {
		return this.thungPhieuRutThamTrungThuong.add(giaTri);
	}

	public boolean xoaPhieuDuThuong(String giaTri) {
		return this.thungPhieuRutThamTrungThuong.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuRutThamTrungThuong.contains(giaTri);
	}

	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuRutThamTrungThuong.clear();
	}

	public int laySoLuong() {
		return this.thungPhieuRutThamTrungThuong.size();
	}

	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();

		int viTri;
		viTri = rd.nextInt(this.thungPhieuRutThamTrungThuong.size());
		ketQua = (String) this.thungPhieuRutThamTrungThuong.toArray()[viTri];
		return ketQua;

	}

	public void inTatCaPhieuTrongThung() {
		System.out.println(Arrays.toString(this.thungPhieuRutThamTrungThuong.toArray()));
	}

	public int layRandom() {
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuRutThamTrungThuong.size());
		return viTri;
	}

	public static void pressEnterToContinue() {
		System.out.println("Nhấn phím Enter để tiếp tục chương trình...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}

	// main
	public static void main(String[] args) {

		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();

		try (Scanner sc = new Scanner(System.in)) {
			int luaChon = 0;
			do {
				for (int i = 0; i < 100; i++) {
					System.out.print("-");
				}
				System.out.println("\nMenu: ");
				System.out.println("\n1.	Thêm mã số dự thưởng.\r\n" + "2.	Xóa mã số dự thưởng\r\n"
						+ "3.	Kiểm tra mã số dự thưởng có tồn tại hay không?\r\n"
						+ "4.	Xóa tất cả mã số dự thưởng.\r\n" + "5.	Số lượng phiếu dự thưởng.\r\n"
						+ "6.	Rút thăm trúng thưởng.\r\n" + "7.	Các mã phiếu dự thưởng hiện có trong thùng.\r\n"
						+ "0.	Thoát khỏi chương trình.\r\n" + "");
				luaChon = sc.nextInt();
				switch (luaChon) {
				case 1, 2, 3:
					System.out.println("Nhập vào mã phiếu dự thưởng: ");
					sc.nextLine();
					String giaTri = sc.nextLine();
					if (luaChon == 1) {
						rt.themPhieuDuThuong(giaTri);
					} else if (luaChon == 2) {
						rt.xoaPhieuDuThuong(giaTri);
					} else {
						if (rt.kiemTraPhieuTonTai(giaTri)) {
							System.out.println("Số phiếu bạn vừa nhập có trong thùng phiếu!");
						} else {
							System.out.println("Số phiếu bạn vừa nhập không có trong thùng phiếu!");
						}
					}
					pressEnterToContinue();
					break;

				case 4:
					rt.xoaTatCaPhieuDuThuong();
					System.out.println("Đã xóa!");
					pressEnterToContinue();
					break;
				case 5:
					System.out.println("Số phiếu dự thưởng trong thùng phiếu là: " + rt.laySoLuong());
					pressEnterToContinue();
					break;
				case 6:
					System.out.println("Mã số phiếu trúng thưởng là: " + rt.rutMotPhieu());
					pressEnterToContinue();
					break;
				case 7:
					System.out.println("Các mã số phiếu dự thưởng trong thùng là: ");
					rt.inTatCaPhieuTrongThung();
					pressEnterToContinue();
					break;
				case 8:
					System.out.println("Fix: " + rt.layRandom());
					pressEnterToContinue();
					break;
				default:
					break;
				}
			} while (luaChon != 0);
		}
	}

}
