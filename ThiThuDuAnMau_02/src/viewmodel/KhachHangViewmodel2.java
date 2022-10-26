/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author HieuIT
 */
public class KhachHangViewmodel2 {

    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String ngaySinh;
    private String sdt;
    private String diaChi;
    private String thanhPho;
    private String quocGia;

    public KhachHangViewmodel2() {
    }

    public KhachHangViewmodel2(String ma, String ten, String tenDem, String ho, String ngaySinh, String sdt, String diaChi, String thanhPho, String quocGia) {
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
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

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "KhachHangViewmodel2{" + "ma=" + ma + ", ten=" + ten + ", tenDem=" + tenDem + ", ho=" + ho + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", diaChi=" + diaChi + ", thanhPho=" + thanhPho + ", quocGia=" + quocGia + '}';
    }

    public Object[] toRowData() {
        return new Object[]{ma, ho + " " + tenDem + " " + ten, ngaySinh, sdt, diaChi + ", " + quocGia + ", " + thanhPho};
    }
}
