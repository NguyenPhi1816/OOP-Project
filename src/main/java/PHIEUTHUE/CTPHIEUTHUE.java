package PHIEUTHUE;

import java.util.Date;

public class CTPHIEUTHUE {
    private String maCTPT;
    private String maPT;
    private String maPhong;
    private String maHD;
    private int trangThai;

    public CTPHIEUTHUE() {}

    public CTPHIEUTHUE(String maCTPT, String maPT, String maPhong, String maHD, int trangThai) {
        this.maCTPT = maCTPT;
        this.maPT = maPT;
        this.maPhong = maPhong;
        this.maHD = maHD;
        this.trangThai = trangThai;
    }

    public String getMaCTPT() {
        return maCTPT;
    }

    public String getMaPT() {
        return maPT;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getMaHD() {
        return maHD;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setMaCTPT(String maCTPT) {
        this.maCTPT = maCTPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    } 
}
