/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.math.BigDecimal;
import java.util.List;
import model.SanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.ChiTietSP;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class SanPhamRepository {

    public List<SanPham> getAllSP() {
        String query = "Select * from SanPham";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new SanPham(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(SanPham sp) {
        String query = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?) ";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(SanPham sp, String ma) {
        String query = "UPDATE [dbo].[SanPham]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Id = ? ";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[SanPham]\n"
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

    public static void main(String[] args) {

    }

    public List<SanPham> getAllCBB() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "  FROM [dbo].[SanPham]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> list = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId(rs.getString(1));
                sp.setMa(rs.getString(2));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
