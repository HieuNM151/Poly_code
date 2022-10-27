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
import model.ChiTietSP;
import model.DongSP;
import model.GioHangChiTiet;
import model.MauSac;
import model.NhaSanXuat;
import model.SanPham;
import utilities.ConnectDB;
import modelview.ChiTietSanPham;

/**
 *
 * @author ASUS
 */
public class SanPhamChiTietRepository {

    public List<ChiTietSanPham> getALLSanPhamChiTiet() {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietSanPham> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new ChiTietSanPham(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ChiTietSanPham> searchMa(String ma) {
        String query = " SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n"
                + "FROM dbo.ChiTietSP INNER JOIN\n"
                + "dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id  where dbo.SanPham.Ma like ?";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, "%" + ma + "%");
            ResultSet rs = ps.executeQuery();
            List<ChiTietSanPham> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new ChiTietSanPham(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(String id, int soLuong) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [SoLuongTon] = ?\n"
                + " WHERE Id = ?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, soLuong);
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<ChiTietSP> getALL() {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Id AS Expr1, dbo.NSX.Id AS Expr2, dbo.MauSac.Id AS Expr3, dbo.DongSP.Id AS Expr4, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, \n"
                + "                  dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id ";
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietSP> list = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(2));
                NhaSanXuat nhaSanXuat = new NhaSanXuat(rs.getString(3));
                MauSac ms = new MauSac(rs.getString(4));
                DongSP dsp = new DongSP(rs.getString(5));
                list.add(new ChiTietSP(
                        rs.getString(1),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        sp,
                        dsp,
                        ms,
                        nhaSanXuat));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(ChiTietSP chiTietSP) {
        String query = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "           ([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, chiTietSP.getIdSP());
            ps.setObject(2, chiTietSP.getIdNsx());
            ps.setObject(3, chiTietSP.getIdMauSac());
            ps.setObject(4, chiTietSP.getIdDongSP());
            ps.setObject(5, chiTietSP.getNamBH());
            ps.setObject(6, chiTietSP.getMoTa());
            ps.setObject(7, chiTietSP.getSoLuongTon());
            ps.setObject(8, chiTietSP.getGiaNhap());
            ps.setObject(9, chiTietSP.getGiaBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(ChiTietSP chiTietSP, String ma) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [NamBH] = ?\n"
                + "      ,[MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + " WHERE Id =?";
        int check = 0;
        try ( Connection con = ConnectDB.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, chiTietSP.getNamBH());
            ps.setObject(2, chiTietSP.getMoTa());
            ps.setObject(3, chiTietSP.getSoLuongTon());
            ps.setObject(4, chiTietSP.getGiaNhap());
            ps.setObject(5, chiTietSP.getGiaBan());
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
