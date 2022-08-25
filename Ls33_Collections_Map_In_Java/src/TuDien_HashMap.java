import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TuDien_HashMap {
	// attributes
	private Map<String, String> duLieu = new HashMap<String, String>();
	// constructor functions

	// handle methods
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();

		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
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
		TuDien_HashMap tuDien = new TuDien_HashMap();
		Scanner sc = new Scanner(System.in);
		
		int luaChon = 0;
		do {
			for (int i = 0; i < 100; i++) {
				System.out.print("-");
			}
			System.out.println("\nTừ điển cá nhân");
			System.out.println("Menu: ");
			System.out.println("1.	Thêm từ (Từ khóa, Ý nghĩa).\r\n"
					+ "2.	Xóa từ.\r\n"
					+ "3.	Tìm nghĩa của từ khóa => Tra từ.\r\n"
					+ "4.	In ra danh sách từ khóa.\r\n"
					+ "5.	In ra số lượng từ.\r\n"
					+ "6.	Xóa tất cả các từ khóa.\r\n"
					+ "0.	Thoát chương trình.\r\n"
					+ "");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1: {
				System.out.println("Nhập vào từ khóa và ý nghĩa: "); 
				sc.nextLine();
				String tuKhoa = sc.nextLine();
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia);
				pressEnterToContinue();
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				System.out.println("Số lượng từ hiện tại trong từ điển cá nhân của bạn là: "+ tuDien.laySoLuong() +" từ");
				pressEnterToContinue();
				break;
			}
			case 6: {
				
				break;
			}
			default:
				if(luaChon !=0) {
					throw new IllegalArgumentException("Unexpected value: " + luaChon);
				} else {
					break;
				}
				
			}
		} while (luaChon != 0);
		
	}
}
