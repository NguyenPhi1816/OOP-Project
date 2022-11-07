/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PHONG;

/**
 *
 * @author ASUS
 */
public class Phong {
    private String maPhong;
    private int trangThai; //San Sang: 0, Dang Cho Thue: 1, Dang Bao Tri: 2
    private String maPT;

    public Phong(String maPhong, int trangThai, String maPT) {
        this.maPhong = maPhong;
        this.trangThai = trangThai;
        this.maPT = maPT;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }
}
