/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USER;

/**
 *
 * @author ASUS
 */
public class User {
    private String tenDangNhap;
    private String matKhau;
    private int quyen; // Nhan vien: 0, Quan Ly: 1, Giam Doc: 2 

    public User(String tenDangNhap, String matKhau, int quyen) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }
}
