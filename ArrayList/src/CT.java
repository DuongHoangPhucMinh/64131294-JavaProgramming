import java.util.ArrayList;
public class CT {

	public static void main(String[] args) {
		//Khai bao danh sach sp
		ArrayList<SanPham> dsSanPham;
		//Xin moi 
		dsSanPham = new ArrayList<SanPham>();
		//Nhap 3 sp
		SanPham sp1 = new SanPham(0, "Kem", "Giai khat", null);
		SanPham sp2 = new SanPham(1, "Com", "Do an", null);
		SanPham sp3 = new SanPham(2, "Pho", "Do an", null);
		
		//them vao arraylist
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for (SanPham x: dsSanPham)
//			System.out.println(x.toString());
		
		for (int i=0; i<dsSanPham.size(); i++) {
			{
				SanPham sp = dsSanPham.get(i);
			System.out.println(dsSanPham.get(i).toString());
			}
		}
	}
}
