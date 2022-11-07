package PHIEUTHUE;

import java.util.Date;

public class PHIEUTHUE {
    private CTPHIEUTHUE CTPT;
    private String maPT;
    private String maKH;
    private String maPD;
    private String maNV;
    private int loaiPT;
    private Date ngayBD;
    private Date ngayKT;

    public PHIEUTHUE() {}

    public PHIEUTHUE(CTPHIEUTHUE CTPT, String maPT, String maKH, String maPD, String maNV, int loaiPT, Date ngayBD, Date ngayKT) {
        this.CTPT = CTPT;
        this.maPT = maPT;
        this.maKH = maKH;
        this.maPD = maPD;
        this.maNV = maNV;
        this.loaiPT = loaiPT;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }
    
    public CTPHIEUTHUE getCTPT() {
        return CTPT;
    }
    
    public String getMaPT() {
        return maPT;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaPD() {
        return maPD;
    }

    public String getMaNV() {
        return maNV;
    }

    public int getLoaiPT() {
        return loaiPT;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setLoaiPT(int loaiPT) {
        this.loaiPT = loaiPT;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public void setCTPT(CTPHIEUTHUE CTPT) {
        this.CTPT = CTPT;
    }
}
