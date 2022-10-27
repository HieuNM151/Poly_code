/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.NhanVienService;
import java.util.List;
import model.NhanVien;
import repository.NhanVienRepository;

/**
 *
 * @author ASUS
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository nvr = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return nvr.getALL();
    }

    @Override
    public String add(NhanVien nv) {
        boolean add = nvr.add(nv);
        if (add) {
            return "Add thành công";
        } else {
            return "Add thất bại";
        }
    }

    @Override
    public String update(NhanVien nv, String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
