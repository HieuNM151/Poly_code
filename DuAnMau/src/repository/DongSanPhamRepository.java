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
import model.DongSP;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class DongSanPhamRepository {

    public List<DongSP> getALL() {
        String query = "select * from DongSP";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<DongSP> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new DongSP(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(DongSP dongSp) {
        String query = "INSERT INTO [dbo].[DongSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, dongSp.getMa());
            ps.setObject(2, dongSp.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(DongSP dongSp, String ma) {
        String query = "UPDATE [dbo].[DongSP]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE Id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, dongSp.getMa());
            ps.setObject(2, dongSp.getTen());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[DongSP]\n"
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

    public List<DongSP> getAllCBB() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "  FROM [dbo].[DongSP]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<DongSP> list = new ArrayList<>();
            while (rs.next()) {
                DongSP sp = new DongSP();
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

    public static void main(String[] args) {
        List<DongSP> l = new DongSanPhamRepository().getAllCBB();
        System.out.println(l.toString());
    }
}
