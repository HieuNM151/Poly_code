/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.SanPhamService;
import java.util.List;
import model.ChiTietSP;
import model.SanPham;
import repository.SanPhamRepository;

/**
 *
 * @author ASUS
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public String add(SanPham sp) {
        boolean add = sanPhamRepository.add(sp);
        if (add) {
            return "Add thành công";
        } else {
            return "Add thất bại";
        }
    }

    @Override
    public String update(SanPham sp, String ma) {
        boolean update = sanPhamRepository.update(sp, ma);
        if (update) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = sanPhamRepository.delete(ma);
        if (delete) {
            return "delete thành công";
        } else {
            return "delete thất bại";
        }
    }

    @Override
    public List<SanPham> getAllSP() {
        return sanPhamRepository.getAllSP();
    }

    @Override
    public List<SanPham> getAllCbb() {
        return sanPhamRepository.getAllCBB();
    }

}
