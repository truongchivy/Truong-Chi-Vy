import java.util.Scanner;
public class NhanVienSanXuat extends NhanVien
{
    private int sosanpham;
    public NhanVienSanXuat()
    {
        super();
        sosanpham = 0;
    }
    public int getsosanpham()
    {
        return sosanpham;
    }
    public void setsosanpham(int sosanpham)
    {
        this.sosanpham = sosanpham;
    }
    @Override
    public double luongnhanvien()
    {
        return sosanpham * 20000;
    }
    @Override
    public void NhapThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapThongTinNhanVien();
        System.out.print("So luong san pham : ");
        sosanpham = sc.numint();
    }
    @Override
    public void XuatThongTinNhanVien()
    {
        super.XuatThongTinNhanVien();
        System.out.println("Luong nhan vien san xuat : " + luongnhanvien());
    }
}
