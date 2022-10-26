/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author HieuIT
 */
public class ChiTietSP {

    private String id;
    private String idSp;
    private String idNsx;
    private String idMauSac;
    private String idDongSp;
    private int namBh;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double giaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, String idSp, String idNsx, String idMauSac, String idDongSp, int namBh, String moTa, int soLuongTon, double giaNhap, double giaBan) {
        this.id = id;
        this.idSp = idSp;
        this.idNsx = idNsx;
        this.idMauSac = idMauSac;
        this.idDongSp = idDongSp;
        this.namBh = namBh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSp() {
        return idSp;
    }

    public void setIdSp(String idSp) {
        this.idSp = idSp;
    }

    public String getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(String idNsx) {
        this.idNsx = idNsx;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdDongSp() {
        return idDongSp;
    }

    public void setIdDongSp(String idDongSp) {
        this.idDongSp = idDongSp;
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

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", idSp=" + idSp + ", idNsx=" + idNsx + ", idMauSac=" + idMauSac + ", idDongSp=" + idDongSp + ", namBh=" + namBh + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

}
