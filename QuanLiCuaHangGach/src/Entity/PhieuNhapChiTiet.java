
package Entity;


public class PhieuNhapChiTiet {
    private String maPhieuNhapChiTiet;
    private String maPhieuNhap;
    private String soLuong;
    private float giaNhap;
    private float giaBan;

    public PhieuNhapChiTiet() {
    }

    public PhieuNhapChiTiet(String maPhieuNhapChiTiet, String maPhieuNhap, String soLuong, float giaNhap, float giaBan) {
        this.maPhieuNhapChiTiet = maPhieuNhapChiTiet;
        this.maPhieuNhap = maPhieuNhap;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getMaPhieuNhapChiTiet() {
        return maPhieuNhapChiTiet;
    }

    public void setMaPhieuNhapChiTiet(String maPhieuNhapChiTiet) {
        this.maPhieuNhapChiTiet = maPhieuNhapChiTiet;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
