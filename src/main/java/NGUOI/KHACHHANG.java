package NGUOI;

public class KHACHHANG {
    private String maKH;
    private String CMND;
    private String maSoThue;
    private String tenCongTy;
    
    public KHACHHANG() {}

    public KHACHHANG(String maKH, String CMND, String maSoThue, String tenCongTy) {
        this.maKH = maKH;
        this.CMND = CMND;
        this.maSoThue = maSoThue;
        this.tenCongTy = tenCongTy;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getCMND() {
        return CMND;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
}
