public class Main 
{
    public static void main(String[] args) 
    {
        CongTy congTyABC = new CongTy();
        congTyABC.NhapThongTin();
        congTyABC.XuatThongTin();
        System.out.println("Luong cua tat ca nhan vien: " + congTyABC.luong());
    }
}
