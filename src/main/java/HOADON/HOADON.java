package HOADON;

import java.util.Date;

public class HOADON {
    private String maHD;
    private Date ngayLap;
    private String maPT;
    private float daTT;
    private String maNV;
    
    public HOADON() {}

    public HOADON(String maHD, Date ngayLap, String maPT, float daTT, String maNV) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.maPT = maPT;
        this.daTT = daTT;
        this.maNV = maNV;
    }

    public String getMaHD() {
        return maHD;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public String getMaPT() {
        return maPT;
    }

    public float getDaTT() {
        return daTT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public void setDaTT(float daTT) {
        this.daTT = daTT;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
}
