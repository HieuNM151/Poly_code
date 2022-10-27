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
import model.NhaSanXuat;
import utilities.ConnectDB;

/**
 *
 * @author ASUS
 */
public class NhaSXRepository {

    public List<NhaSanXuat> getALL() {
        String query = "select * from NSX";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhaSanXuat> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new NhaSanXuat(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(NhaSanXuat nhaSanXuat) {
        String query = "INSERT INTO [dbo].[NSX]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nhaSanXuat.getMa());
            ps.setObject(2, nhaSanXuat.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(NhaSanXuat nhaSanXuat, String ma) {
        String query = "UPDATE [dbo].[NSX]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nhaSanXuat.getMa());
            ps.setObject(2, nhaSanXuat.getTen());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[NSX]\n"
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

    public List<NhaSanXuat> getAllCBB() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "  FROM [dbo].[NSX]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhaSanXuat> list = new ArrayList<>();
            while (rs.next()) {
                NhaSanXuat sp = new NhaSanXuat();
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
