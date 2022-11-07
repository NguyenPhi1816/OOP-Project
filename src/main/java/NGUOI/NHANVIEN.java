package NGUOI;

import java.util.Date;

public class NHANVIEN extends NGUOI {
    private String maNV;
    private int phai;
    private Date ngaySinh;
    private String boPhan;
    private int trangThai;

    public NHANVIEN() {}

    public NHANVIEN(String maNV, int phai, Date ngaySinh, String boPhan, int trangThai, String ho, String ten, String diaChi, String soDT, String email) {
        super(ho, ten, diaChi, soDT, email);
        this.maNV = maNV;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.boPhan = boPhan;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public int getPhai() {
        return phai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setPhai(int phai) {
        this.phai = phai;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}

