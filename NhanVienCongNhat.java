import java.util.Scanner;
public class NhanVienCongNhat extends NhanVien
{
    private int songaycong;
    NhanVienCongNhat()
    {
        super();
        songaycong = 0;
    }
    public int getsongaycong()
    {
        return songaycong;
    }
    public void setsongaycong(int songaycong)
    {
        this.songaycong = songaycong;
    }
    @Override
    public double luongnhanvien()
    {
        return songaycong * 50000;
    }
    @Override
    public void NhapThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapThongTinNhanVien();
        System.out.print("Nhap so ngay cong: ");
        songaycong = sc.numint();
    }
}
