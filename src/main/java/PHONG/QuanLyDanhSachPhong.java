/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PHONG;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QuanLyDanhSachPhong {
    private List<Phong> danhSachPhong;

    public QuanLyDanhSachPhong() {
        danhSachPhong = new ArrayList<>();
    }
    
    public List<Phong> layDanhSach() {
        return this.danhSachPhong;
    }
    
    public void themPhong(Phong p) {
        danhSachPhong.add(p);
    }
    
    public boolean thayDoiTrangThai(String maPhong, int trangThai) {
        Phong phong = this.danhSachPhong.stream()
                .filter(p -> p.getMaPhong().equals(maPhong))
                .findFirst().orElse(null);
        
        if (phong == null) {
            return false;
        }
        
        phong.setTrangThai(trangThai);
        return true;
    }
}
