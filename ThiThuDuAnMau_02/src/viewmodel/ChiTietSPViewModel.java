/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author HieuIT
 */
public class ChiTietSPViewModel {
    private String id;
    private int namBh;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;

    public ChiTietSPViewModel() {
    }

    public ChiTietSPViewModel(String id, int namBh, String moTa, int soLuongTon, double giaNhap) {
        this.id = id;
        this.namBh = namBh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNamBh() {
        return namBh;
    }

    public void setNamBh(int namBh) {
        this.namBh = namBh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    @Override
    public String toString() {
        return "ChiTietSPViewModel{" + "id=" + id + ", namBh=" + namBh + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + '}';
    }
    public Object[] toRowData(){
        return new Object[]{id, namBh, moTa, soLuongTon, giaNhap, soLuongTon >= 900 ? "Nhiều sản phẩm" : "Ít sản phẩm"};
    }
}
