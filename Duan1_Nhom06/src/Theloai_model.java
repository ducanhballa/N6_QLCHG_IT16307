/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Theloai_model {
    private String Matheloai;
    private String Tentheloai;

    @Override
    public String toString() {
        return "Theloai_model{" + "Matheloai=" + Matheloai + ", Tentheloai=" + Tentheloai + '}';
    }

    public String getMatheloai() {
        return Matheloai;
    }

    public void setMatheloai(String Matheloai) {
        this.Matheloai = Matheloai;
    }

    public String getTentheloai() {
        return Tentheloai;
    }

    public void setTentheloai(String Tentheloai) {
        this.Tentheloai = Tentheloai;
    }

    public Theloai_model(String Matheloai, String Tentheloai) {
        this.Matheloai = Matheloai;
        this.Tentheloai = Tentheloai;
    }
}
