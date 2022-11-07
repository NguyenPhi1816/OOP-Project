package NGUOI;

import java.util.Date;

public class QUANLY {
    private String maBP;
    private String maNV;
    private Date ngayKQD;

    public QUANLY() {}

    public QUANLY(String maBP, String maNV, Date ngayKQD) {
        this.maBP = maBP;
        this.maNV = maNV;
        this.ngayKQD = ngayKQD;
    }

    public String getMaBP() {
        return maBP;
    }

    public String getMaNV() {
        return maNV;
    }

    public Date getNgayKQD() {
        return ngayKQD;
    }

    public void setMaBP(String maBP) {
        this.maBP = maBP;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNgayKQD(Date ngayKQD) {
        this.ngayKQD = ngayKQD;
    }
}
