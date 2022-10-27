/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.KhachHangService;
import java.util.List;
import model.Khachhang;
import repository.KhachHangRepository;

/**
 *
 * @author ASUS
 */
public class KhachHangServiceImpl implements KhachHangService{

    private KhachHangRepository khr = new KhachHangRepository();
    
    @Override
    public List<Khachhang> getAll() {
        return khr.getALL();
    }

    @Override
    public String add(Khachhang kh) {
        boolean add = khr.add(kh);
        if (add) {
            return "Add thành công";
        } else {
            return "Add không thành công";
        }
    }

    @Override
    public String update(Khachhang kh, String ma) {
        boolean update = khr.update(kh, ma);
        if (update) {
            return "update thành công";
        } else {
            return "update không thành công";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = khr.delete(ma);
        if (delete) {
            return "delete thành công";
        } else {
            return "delete không thành công";
        }
    }
    
}
