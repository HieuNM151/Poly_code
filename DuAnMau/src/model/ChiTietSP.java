/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.*;
import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
public class ChiTietSP {

    private String id;
    private String idSP;
    private String idNsx;
    private String idMauSac;
    private String idDongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double giaBan;
    private SanPham sp;
    private DongSP dsp;
    private MauSac ms;
    private NhaSanXuat nsx;
    private GioHangChiTiet ghct;

    public ChiTietSP() {
    }

    public ChiTietSP(int namBH, String moTa, int soLuongTon, double giaNhap, double giaBan, SanPham sp) {
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.sp = sp;
    }  

    public ChiTietSP(String id, int namBH, String moTa, int soLuongTon, double giaNhap, double giaBan, SanPham sp, DongSP dsp, MauSac ms, NhaSanXuat nsx) {
        this.id = id;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.sp = sp;
        this.dsp = dsp;
        this.ms = ms;
        this.nsx = nsx;
    }

    public ChiTietSP(int soLuongTon, double giaBan, SanPham sp, GioHangChiTiet ghct) {
        this.soLuongTon = soLuongTon;
        this.giaBan = giaBan;
        this.sp = sp;
        this.ghct = ghct;
    }

    public ChiTietSP(String id, String idSP, String idNsx, String idMauSac, String idDongSP, int namBH, String moTa, int soLuongTon, double giaNhap, double giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.idNsx = idNsx;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String idSP, String idNsx, String idMauSac, String idDongSP) {
        this.idSP = idSP;
        this.idNsx = idNsx;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
    }

    public ChiTietSP(String idSP) {
        this.idSP = idSP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
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

    public String getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
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

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public GioHangChiTiet getGhct() {
        return ghct;
    }

    public void setGhct(GioHangChiTiet ghct) {
        this.ghct = ghct;
    }

    public DongSP getDsp() {
        return dsp;
    }

    public void setDsp(DongSP dsp) {
        this.dsp = dsp;
    }

    public MauSac getMs() {
        return ms;
    }

    public void setMs(MauSac ms) {
        this.ms = ms;
    }

    public NhaSanXuat getNsx() {
        return nsx;
    }

    public void setNsx(NhaSanXuat nsx) {
        this.nsx = nsx;
    }

    public Object[] toDataRow() {
        return new Object[]{
            id,
            sp.getId(),
            nsx.getId(),
            ms.getId(),
            dsp.getId(),
            namBH,
            moTa,
            soLuongTon,
            giaNhap,
            giaBan};
    }

    public Object[] toDataRowGioHang(){
        return new Object[]{
            sp.getId(),
            sp.getMa(),
            sp.getTen(),
            soLuongTon,
            giaBan,
            ghct.getThanhTien()};
    }
}
