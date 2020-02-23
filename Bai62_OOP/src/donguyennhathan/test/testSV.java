package donguyennhathan.test;

import donguyennhathan.model.SinhVien;

public class testSV {

	public static void main(String[] args) {
		SinhVien sv1= new SinhVien();
		SinhVien sv2= new SinhVien("Tèo", 9.5);
		
		System.out.println("Điểm của Tèo là: "+sv2.getDiem());
		System.out.println("Tên của Tèo là: "+sv2.getHoTen());
		
		System.out.println("Tên của sv1: "+ sv1.getHoTen()); //null vì sv1 chưa khởi tạo gì cả
		sv1.setHoTen("Obama");
		System.out.println("Tên của sv1: "+ sv1.getHoTen());
		
		System.out.println("Tên \tĐiểm");
		System.out.println("------------------------");
		sv1.XuatThongTin();
		System.out.println("------------------------");
		sv2.XuatThongTin();
		
	}

}
