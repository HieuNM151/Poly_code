/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class ChiTietSP {
    
    private int id;
    private int idSP;
    private int nhaCungCap;
    private int soLuong;
    private String ram;
    private String camera;
    private String manHinh;
    private String boNho;
    private String mauSac;
    private float giaNhap;
    private float giaBan;
    private String image;
    private String trangThai;
    private String moTa;

    public ChiTietSP() {
    }

    public ChiTietSP(int id, int idSP, int nhaCungCap, int soLuong, String ram, String camera, String manHinh, String boNho, String mauSac, float giaNhap, float giaBan, String image, String trangThai, String moTa) {
        this.id = id;
        this.idSP = idSP;
        this.nhaCungCap = nhaCungCap;
        this.soLuong = soLuong;
        this.ram = ram;
        this.camera = camera;
        this.manHinh = manHinh;
        this.boNho = boNho;
        this.mauSac = mauSac;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.image = image;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public int getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(int nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
