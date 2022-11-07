package PHIEUDAT;

import java.util.Date;

public class CTPHIEUDAT {
    private String maCTPD;
    private String maHP;
    private String maPD;
    private int soLuongPhong;
    private int trangThai;

    public CTPHIEUDAT() {}

    public CTPHIEUDAT(String maCTPD, String maHP, String maPD, Date ngayBD, Date ngayKT, int soLuongPhong, int trangThai) {
        this.maCTPD = maCTPD;
        this.maHP = maHP;
        this.maPD = maPD;
        this.soLuongPhong = soLuongPhong;
        this.trangThai = trangThai;
    }

    public String getMaCTPD() {
        return maCTPD;
    }

    public String getMaPD() {
        return maPD;
    }

    public String getMaHP() {
        return maHP;
    }

    public int getSoLuongPhong() {
        return soLuongPhong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public void setSoLuongPhong(int soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void setMaCTPD(String maCTPD) {
        this.maCTPD = maCTPD;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }
}
