/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serivce.impl;

import java.util.List;
import repository.KhachHangRepository;
import serivce.KhachHangService;
import viewmodel.KhachHangViewModel;

/**
 *
 * @author HieuIT
 */
public class KhachHangImpl implements KhachHangService{
    private KhachHangRepository khr = new KhachHangRepository();

    @Override
    public List<KhachHangViewModel> getAll() {
        return khr.getAll();
    }

    @Override
    public String them(KhachHangViewModel kh) {
        boolean them = khr.them(kh);
        if (them) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String xoa(String ma) {
        boolean xoa = khr.xoa(ma);
        if (xoa) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public String update(String ma, KhachHangViewModel kh) {
        boolean update = khr.update(ma, kh);
        if (update) {
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public List<KhachHangViewModel> getOne(String ma) {
        return khr.getOne(ma);
    }


    
    
    
}
