/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class HoaDon {
    
    private int id;
    private int idKhachHang;
    private int idNhanVien;
    private int idHinhThucTT;
    private int idHinhThucGH;
    private String maHD;
    private float tongTien;
    private Date ngayTao;
    private String thoiGianBaohanh;
    private Date hanTra;
    private Date ngayTra;
    private String trangThai;
    private String moTa;

    public HoaDon() {
    }

    public HoaDon(int id, int idKhachHang, int idNhanVien, int idHinhThucTT, int idHinhThucGH, String maHD, float tongTien, Date ngayTao, String thoiGianBaohanh, Date hanTra, Date ngayTra, String trangThai, String moTa) {
        this.id = id;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idHinhThucTT = idHinhThucTT;
        this.idHinhThucGH = idHinhThucGH;
        this.maHD = maHD;
        this.tongTien = tongTien;
        this.ngayTao = ngayTao;
        this.thoiGianBaohanh = thoiGianBaohanh;
        this.hanTra = hanTra;
        this.ngayTra = ngayTra;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdHinhThucTT() {
        return idHinhThucTT;
    }

    public void setIdHinhThucTT(int idHinhThucTT) {
        this.idHinhThucTT = idHinhThucTT;
    }

    public int getIdHinhThucGH() {
        return idHinhThucGH;
    }

    public void setIdHinhThucGH(int idHinhThucGH) {
        this.idHinhThucGH = idHinhThucGH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getThoiGianBaohanh() {
        return thoiGianBaohanh;
    }

    public void setThoiGianBaohanh(String thoiGianBaohanh) {
        this.thoiGianBaohanh = thoiGianBaohanh;
    }

    public Date getHanTra() {
        return hanTra;
    }

    public void setHanTra(Date hanTra) {
        this.hanTra = hanTra;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}