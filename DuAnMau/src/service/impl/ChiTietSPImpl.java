/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.ChiTietSpService;
import java.util.List;
import java.util.Map;
import model.ChiTietSP;
import repository.SanPhamChiTietRepository;
import modelview.ChiTietSanPham;

/**
 *
 * @author ASUS
 */
public class ChiTietSPImpl implements ChiTietSpService {

    private SanPhamChiTietRepository spr = new SanPhamChiTietRepository();

    @Override
    public List<ChiTietSP> getALL() {
        return spr.getALL();
    }

    @Override
    public String add(ChiTietSP DongSP) {
        boolean add = spr.add(DongSP);
        if (add) {
            return "Add Thành công";
        } else {
            return "add không thành công";
        }
    }

    @Override
    public String update(ChiTietSP DongSP, String ma) {
        boolean update = spr.update(DongSP, ma);
        if (update) {
            return "update Thành công";
        } else {
            return "update không thành công";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = spr.delete(ma);
        if (delete) {
            return "delete Thành công";
        } else {
            return "delete không thành công";
        }
    }

    @Override
    public List<ChiTietSanPham> getAllChiTietSanPham() {
        return spr.getALLSanPhamChiTiet();
    }

    @Override
    public List<ChiTietSanPham> searchMa(List<ChiTietSanPham> list, String ma) {
        list = spr.searchMa(ma);
        return list;
    }

    @Override
    public void update(Map<ChiTietSanPham, Integer> ctsp) {
        ctsp.forEach((t, u) -> {spr.update(t.getMaSP(), u);
        }
        );
    }

}
