/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import modelview.ChiTietSanPham;

/**
 *
 * @author ASUS
 */
public class SanPham {

    private String id;
    private String ma;
    private String ten;
    private ChiTietSanPham chiTietSP;

    public SanPham() {
    }

    public SanPham(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham(String id, String ma, String ten, ChiTietSanPham chiTietSP) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.chiTietSP = chiTietSP;
    }

    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ChiTietSanPham getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSanPham chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    @Override
    public String toString() {
        return ma + '-'+ id;
    }

    public Object[] toDataRow() {
        return new Object[]{
            id, ma, ten
        };
    }
}
