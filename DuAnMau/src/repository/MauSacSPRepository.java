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
import model.MauSac;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class MauSacSPRepository {

    public List<MauSac> getALL() {
        String query = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac] ";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new MauSac(
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

    public boolean add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(MauSac ms, String ma) {
        String query = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE Id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MauSac]\n"
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

    public List<MauSac> getAllCBB() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "  FROM [dbo].[MauSac]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> list = new ArrayList<>();
            while (rs.next()) {
                MauSac sp = new MauSac();
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
