public class CT {

	public static void main(String[] args) {
		//Tao ra 2 sp
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Banh chuoi", "Do an nhanh","bc.png");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Do uong co con");
		sp1.setAnhSP("sg.png");
		
		//In ra man hinh thong tin 2 san pham 
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Ma SP2 la " + sp2.getMaSP();
			   thongtinSP2 += "Ten SP2 la " + sp2.getTenSP();
			   
		System.out.print(thongtinSP1);
		System.out.print(thongtinSP2);
	}

}

