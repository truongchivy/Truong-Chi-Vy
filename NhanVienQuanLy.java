import java.util.Scanner;
public class NhanVienQuanLy extends NhanVien
{
    private double luongcoban;
    private double hesoluong;
    NhanVienQuanLy()
    {
        super();
        luongcoban = 0;
        hesoluong = 0;
    }
    public double getluongcoban()
    {
        return luongcoban;
    }
    public void setluongcoban(double luongcoban)
    {
        this.luongcoban = luongcoban;
    }
    public double gethesoluong()
    {
        return hesoluong;
    }
    public void sethesoluong(double hesoluong)
    {
        this.hesoluong = hesoluong;
    }
    @Override
    public double luongnhanvien() 
    {
        return luongcoban * hesoluong;
    }
    @Override
    public void NhapThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapThongTinNhanVien();
        System.out.print("Nhap luong co ban : ");
        luongcoban = sc.numdou();
        System.out.print("Nhap he so luong : ");
        hesoluong = sc.numdou();
    }
    @Override
    public void XuatThongTinNhanVien()
    {
        super.XuatThongTinNhanVien();
        System.out.println("Luong nhan vien quan ly : " + luongnhanvien());
    }
}
