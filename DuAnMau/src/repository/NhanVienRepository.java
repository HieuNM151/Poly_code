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
import model.NhanVien;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class NhanVienRepository {

    public List<NhanVien> getALL() {
        String query = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Sdt]\n"
                + "  FROM [dbo].[NhanVien] ";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new NhanVien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([Ten])\n"
                + "     VALUES\n"
                + "           (?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nv.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(NhanVien nv, String ma) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [NamBH] = ?\n"
                + "      ,[MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + " WHERE Id =?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(1, nv.getTen());
            ps.setObject(1, nv.getGioiTinh());
            ps.setObject(1, nv.getMa());
            ps.setObject(6, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[ChiTietSP]\n"
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
