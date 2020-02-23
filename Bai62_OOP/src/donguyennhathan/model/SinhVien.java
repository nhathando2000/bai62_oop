package donguyennhathan.model;

public class SinhVien {

		private String hoTen;
		private double diem;
		
		public void setHoTen(String hoTen)
		{
			this.hoTen = hoTen;
		}
		public String getHoTen()
		{
			return this.hoTen;
		}
		public void setDiem(double diem)
		{
			this.diem=diem;
		}
		public double getDiem()
		{
			return this.diem;
		}
		
		public SinhVien()
		{
			System.out.println("Đây là constructor không đối số");
			this.hoTen="XYZ";
		}
		public SinhVien(String hoTen, double diem)
		{
			this.hoTen= hoTen;
			this.diem=diem;
			System.out.println("Đây là constructor có đối số");
		}
		
		public void XuatThongTin()
		{
			System.out.println(this.hoTen+"\t"+this.diem);
		}
		
		@Override
		public String toString() {
			return this.hoTen +"-"+this.diem;
		}
}
