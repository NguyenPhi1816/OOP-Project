package NGUOI;

public class NGUOI {
    private String ho;
    private String ten;
    private String diaChi;
    private String soDT;
    private String email;
    
    public NGUOI() {}

    public NGUOI(String ho, String ten, String diaChi, String soDT, String email) {
        this.ho = ho;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.email = email;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
