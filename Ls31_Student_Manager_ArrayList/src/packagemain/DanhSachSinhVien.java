package packagemain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	// attributes
	private ArrayList<SinhVien> danhSach;

	// constructor methods
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public DanhSachSinhVien() {
		danhSach = new ArrayList<SinhVien>();
	};

	// handle methods
	public void themSinhVien(SinhVien sv) {
		danhSach.add(sv);
	}

	public void inDssv() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

	public boolean kiemTraDanhSachRong() {
		return danhSach.isEmpty();
	}

	public int laySoluongSinhVien() {
		return danhSach.size();
	}

	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	public boolean kiemTraTonTai(SinhVien o) {
		return this.danhSach.contains(o);
	}

	public boolean xoaSinhVien(SinhVien o) {
		return this.danhSach.remove(o);
	}

	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return -1;
				} else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return 1;

				} else {
					return 0;
				}
			}

		});
	}

}
