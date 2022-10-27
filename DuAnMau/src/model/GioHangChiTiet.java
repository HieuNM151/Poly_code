/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import modelview.ChiTietSanPham;

/**
 *
 * @author ASUS
 */
public class GioHangChiTiet {
    
    private String idGioHang;
    private String idChiTietSP;
    private int soLuong;
    private double donGia;
    private double donGiaKhiGiam;
    private double thanhTien;
    private SanPham sp ;
    private ChiTietSanPham ctsp;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(SanPham sp,int soLuong, double donGia, double thanhTien) {
        this.sp = sp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public GioHangChiTiet(String idGioHang, String idChiTietSP, int soLuong, double donGia, double donGiaKhiGiam, double thanhTien) {
        this.idGioHang = idGioHang;
        this.idChiTietSP = idChiTietSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.donGiaKhiGiam = donGiaKhiGiam;
        this.thanhTien = thanhTien;
    }

    public ChiTietSanPham getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSanPham ctsp) {
        this.ctsp = ctsp;
    }

    public GioHangChiTiet(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(String idGioHang) {
        this.idGioHang = idGioHang;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(double donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public double thanhTien() {
        return soLuong * donGia;
    }
}
