import java.util.Scanner;
public class CongTy 
{
    private NhanVien [] abc;
    private int soluongnhanvien;
    public CongTy()
    {
        this.abc = null;
        this.soluongnhanvien = 0;
    }
    public int getsoluongnhanvien()
    {
        return soluongnhanvien;
    }
    public void setsoluongnhanvien(int soluongnhanvien)
    {
        this.soluongnhanvien = soluongnhanvien;
    }
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soluongnhanvien = sc.nextInt();
        abc = new NhanVien[soluongnhanvien];

        for(int i = 0; i < soluongnhanvien; i++) 
        {
            System.out.println("Nhap vao loai nhan vien (1 la nhan vien quan ly, 2 la nhan vien cong nhat, 3 la nhan vien san xuat ) : ");
            int choose = sc.nextInt();
            if (choose == 1) 
            {
                abc[i] = new NhanVienQuanLy();
                abc[i].NhapThongTinNhanVien();
            } else if (choose == 2) 
            {
                abc[i] = new NhanVienCongNhat();
                abc[i].NhapThongTinNhanVien();
            } else if (choose == 3) 
            {
                abc[i] = new NhanVienSanXuat();
                abc[i].NhapThongTinNhanVien();
            } else
                System.out.println("error!!!");
        }
    }
    public void XuatThongTin()
    {
        for(int i = 0; i < soluongnhanvien; i++)
            abc[i].XuatThongTinNhanVien();
    }
    public double luong()
    {
        double total = 0;
        for(int i = 0; i < soluongnhanvien; i++)
            total += abc[i].luongnhanvien();
        return total;
    }
}
