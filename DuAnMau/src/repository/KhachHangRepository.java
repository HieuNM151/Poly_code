/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Khachhang;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class KhachHangRepository {

    public List<Khachhang> getALL() {
        String query = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "      ,[MatKhau]\n"
                + "  FROM [dbo].[KhachHang] ";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<Khachhang> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Khachhang(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Khachhang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia]\n"
                + "           ,[MatKhau])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTenDem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getNgaySinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getDiaChi());
            ps.setObject(8, kh.getThanhPho());
            ps.setObject(9, kh.getQuocGia());
            ps.setObject(10, kh.getMatKhau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(Khachhang kh, String ma) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + "      ,[MatKhau] = ?\n"
                + " WHERE id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTenDem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getNgaySinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getDiaChi());
            ps.setObject(8, kh.getThanhPho());
            ps.setObject(9, kh.getQuocGia());
            ps.setObject(10, kh.getMatKhau());
            ps.setObject(11, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE Id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
