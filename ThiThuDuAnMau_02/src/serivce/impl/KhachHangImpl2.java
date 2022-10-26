/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serivce.impl;

import java.util.ArrayList;
import java.util.List;
import repository.KhachHangRepository2;
import serivce.KhachHangService2;
import viewmodel.KhachHangViewmodel2;

/**
 *
 * @author HieuIT
 */
public class KhachHangImpl2 implements KhachHangService2{
    KhachHangRepository2 khh = new KhachHangRepository2();
    
    @Override
    public List<KhachHangViewmodel2> getAll() {
        return khh.getAll();
    }

    @Override
    public String add(KhachHangViewmodel2 kh) {
        boolean add = khh.add(kh);
        if (add) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String xoa(String ma) {
        boolean xoa = khh.xoa(ma);
        if (xoa) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<KhachHangViewmodel2> getOne(String ma) {
        return khh.getOne(ma);
    }

    @Override
    public String sua(String ma, KhachHangViewmodel2 kh) {
        boolean sua = khh.sua(ma, kh);
        if (sua) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }



    
}
