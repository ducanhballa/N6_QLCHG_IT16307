/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NhaCungCap_model {
    private String Manhacungcap;
    private String Tennhacungcap;
    private String Diachi;
    private String SDT;
    private String Email;
    private String Thongtinkhac;
    private boolean TrangThai;

    @Override
    public String toString() {
        return "NhaCungCap_model{" + "Manhacungcap=" + Manhacungcap + ", Tennhacungcap=" + Tennhacungcap + ", Diachi=" + Diachi + ", SDT=" + SDT + ", Email=" + Email + ", Thongtinkhac=" + Thongtinkhac + ", TrangThai=" + TrangThai + '}';
    }

    public String getManhacungcap() {
        return Manhacungcap;
    }

    public void setManhacungcap(String Manhacungcap) {
        this.Manhacungcap = Manhacungcap;
    }

    public String getTennhacungcap() {
        return Tennhacungcap;
    }

    public void setTennhacungcap(String Tennhacungcap) {
        this.Tennhacungcap = Tennhacungcap;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getThongtinkhac() {
        return Thongtinkhac;
    }

    public void setThongtinkhac(String Thongtinkhac) {
        this.Thongtinkhac = Thongtinkhac;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public NhaCungCap_model(String Manhacungcap, String Tennhacungcap, String Diachi, String SDT, String Email, String Thongtinkhac, boolean TrangThai) {
        this.Manhacungcap = Manhacungcap;
        this.Tennhacungcap = Tennhacungcap;
        this.Diachi = Diachi;
        this.SDT = SDT;
        this.Email = Email;
        this.Thongtinkhac = Thongtinkhac;
        this.TrangThai = TrangThai;
    }
            
    
}
