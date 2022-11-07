package PHIEUDAT;

import java.util.Date;

public class PHIEUDAT {
    private CTPHIEUDAT CTPD;
    private String maKH;
    private String maPD;
    private Date ngayDat;
    private Date ngayKT;
    private String maNV;

    public PHIEUDAT() {}
    
    public PHIEUDAT(CTPHIEUDAT CTPD, String maKH, String maPD, Date ngayDat, Date ngayKT, String maNV) {
        this.CTPD = CTPD;
        this.maKH = maKH;
        this.maPD = maPD;
        this.ngayDat = ngayDat;
        this.ngayKT = ngayKT;
        this.maNV = maNV;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public CTPHIEUDAT getCTPD() {
        return CTPD;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaPD() {
        return maPD;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setCTPD(CTPHIEUDAT CTPD) {
        this.CTPD = CTPD;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
     public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
}
