import java.util.Scanner;
public abstract class NhanVien
{
    private String ten;
    private String ngaysinh;
    private String diachi;
    public NhanVien()
    {
        ten =  "Null";
        ngaysinh = "Null";
        diachi = "Null";
    }
    public String getten()
    {
        return  ten;
    }
    public void setten(String ten)
    {
        this.ten = ten;
    }
    public String getngaysinh()
    {
        return ngaysinh;
    }

    public void setngaysinh(String ngaysinh)
    {
        this.ngaysinh = ngaysinh;
    }
    public String getdiachi(){
        return diachi;
    }
    public void setdiachi(String diachi)
    {
        this.diachi = diachi;
    }

    public abstract double luongnhanvien();
    public void NhapThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien : ");
        ten = sc.nextLine();
        System.out.print("Nhap ngay sinh nhan vien : ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhap dia chi cua nhan vien : ");
        diachi = sc.nextLine();
    }
    public void XuatThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten nhan vien : " + ten);
        System.out.println("Ngay sinh nhan vien : " + ngaysinh);
        System.out.println("Dia chi nhan vien : " + diachi);
    }
}
