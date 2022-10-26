/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import utilities.ConnectDB;
import viewmodel.KhachHangViewmodel2;

/**
 *
 * @author HieuIT
 */
public class KhachHangRepository2 {

    public List<KhachHangViewmodel2> getAll() {
        String query = "SELECT \n"
                + "       [Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KhachHangViewmodel2> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new KhachHangViewmodel2(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(KhachHangViewmodel2 kh) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTenDem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getNgaySinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getDiaChi());
            ps.setObject(8, kh.getThanhPho());
            ps.setObject(9, kh.getQuocGia());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoa(String ma) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE Ma = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
// 

    public ArrayList<KhachHangViewmodel2> getOne(String ma) {
        ArrayList< KhachHangViewmodel2> listkh = new ArrayList<>();
        String query = "SELECT \n"
                + "       [Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[KhachHang] where Ma = ?";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangViewmodel2 kh2 = new KhachHangViewmodel2(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                listkh.add(kh2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listkh;
    }

    public boolean sua(String ma, KhachHangViewmodel2 kh) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ten] = ?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE [Ma] = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getTen());
            ps.setObject(2, kh.getTenDem());
            ps.setObject(3, kh.getHo());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getThanhPho());
            ps.setObject(8, kh.getQuocGia());
            ps.setObject(9, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new KhachHangRepository2().getAll().forEach((t) -> System.out.println(t.toString()));
    }
}
