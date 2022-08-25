import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập vào số sinh viên: ");
			n = sc.nextInt();
		}
		SinhVien[] sv = new SinhVien[n] ;
		for (int i = 0; i < sv.length; i++) {
			sv[i]= new SinhVien();
			sv[i].nhap();
		}
		for (int i = 0; i < sv.length; i++) {
			System.out.println(sv[i].xuat());;
		}
	}
}
