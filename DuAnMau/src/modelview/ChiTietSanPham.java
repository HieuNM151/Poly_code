/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelview;

import model.*;
import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
public class ChiTietSanPham {
    
    private String id;
    private String maSP;
    private String tenSP;
    private int namBaHanh;
    private String moTa;
    private int soLuong;
    private float giaNhap;
    private float giaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, String maSP, String tenSP, int namBaHanh, String moTa, int soLuong, float giaNhap, float giaBan) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBaHanh = namBaHanh;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getNamBaHanh() {
        return namBaHanh;
    }

    public void setNamBaHanh(int namBaHanh) {
        this.namBaHanh = namBaHanh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
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
