/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.DongSPService;
import java.util.List;
import model.DongSP;
import repository.DongSanPhamRepository;

/**
 *
 * @author ASUS
 */
public class DongSPServiceImpl implements DongSPService{

    private DongSanPhamRepository impl = new DongSanPhamRepository();
    
    @Override
    public List<DongSP> getAll() {
        return impl.getALL();
    }

    @Override
    public String add(DongSP DongSP) {
        boolean add = impl.add(DongSP);
        if (add) {
            return "add thành công";
        } else {
            return "add không thành công";
        }
    }

    @Override
    public String update(DongSP DongSP, String ma) {
        boolean update = impl.update(DongSP, ma);
        if (update) {
            return "update thành công";
        } else {
            return "update không thành công";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = impl.delete(ma);
        if (delete) {
            return "delete thành công";
        } else {
            return "delete không thành công";
        }
    }

    @Override
    public List<DongSP> getAllCbb() {
        return impl.getAllCBB();
    }
}
