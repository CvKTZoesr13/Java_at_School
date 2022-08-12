import java.util.Scanner;

public class NgayThang {
	private int ngay, thang, nam;
	// 1-31 based on month
	// 1-12
	// any year

	// over write method toString to describe day/month/year
	public String toString() {
		return this.ngay + "/" + this.thang + "/" + this.nam;
	}

	public void Nhap() {
		System.out.println("nhap ngay, thang, nam ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int t = s.nextInt();
		int nam = s.nextInt();
		kiemTra(n, t, nam);
	}

	public void kiemTra(int ngay, int thang, int nam) {
		if (thang > 1 && thang < 12) {
			this.thang = thang;
		} else {
			this.thang = 1;
			System.out.println("thang " + thang + " khong hop le. Dat lai mac dinh thang = 1");
		}
		this.nam = nam;
		this.ngay = checkDay(ngay);
		
		System.out.println("In thong tin ngay thang nam: " + toString());
	}

	private int checkDay(int ngaykiemtra) {
		int ngayTrongThang[] = {0, 31, 28, 31, 30,31,30,31,31,30,31,30,31};
		if (ngaykiemtra > 0 && ngaykiemtra <= ngayTrongThang[thang])
		return ngaykiemtra;
		else if(((thang == 2) && (ngaykiemtra == 29)) && ((nam % 400 == 0) || (nam % 4 == 0) && (nam % 100 != 0))) {
			return ngaykiemtra;
		} else {
			System.out.println("Ngay " + ngaykiemtra + " khong hop le. Dat lai mac dinh ngay = 1");
			return 1;
		}
	}
}
