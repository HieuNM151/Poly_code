/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.HoaDon;
import model.NhanVien;
import utilities.ConnectDB;
import modelview.HoaDonCT;

/**
 *
 * @author ASUS
 */
public class HoaDonRepository {

    public List<HoaDonCT> getALLHoaDonChiTiet(String ma) {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Id AS Expr1, dbo.HoaDonChiTiet.IdHoaDon, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            List<HoaDonCT> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new HoaDonCT(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getFloat(7)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HoaDon> getALL() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TinhTrang]\n"
                + "  FROM [dbo].[HoaDon]";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new HoaDon(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(HoaDon sp) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[TinhTrang])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getNgayTao());
            ps.setObject(3, sp.getTinhTrang());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(HoaDon sp, String ma) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TinhTrang] = ?\n"
                + " WHERE Ma = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getTinhTrang());
            ps.setObject(2, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<HoaDon> getALLThanhToan(int tinhTrang) {
        String query = "SELECT [Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TinhTrang]\n"
                + "  FROM [dbo].[HoaDon]\n"
                + "  where TinhTrang = ?";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, tinhTrang);
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new HoaDon(rs.getString(1), rs.getDate(2), rs.getInt(3)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        HoaDon hd = new HoaDon(1);
        boolean update = new HoaDonRepository().update(hd, "HD2");
        System.out.println(update);
    }
}
