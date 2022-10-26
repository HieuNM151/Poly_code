/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.MauSacSerivce;
import java.util.List;
import model.MauSac;
import repository.MauSacSPRepository;

/**
 *
 * @author ASUS
 */
public class MauSacServiceImpl implements MauSacSerivce {

    private MauSacSPRepository impl = new MauSacSPRepository();

    @Override
    public List<MauSac> getAll() {
        return impl.getALL();
    }

    @Override
    public String add(MauSac ms) {
        boolean add = impl.add(ms);
        if (add) {
            return "Add thành công";
        } else {
            return "Add thất bại";
        }
    }

    @Override
    public String update(MauSac ms, String ma) {
        boolean add = impl.update(ms, ma);
        if (add) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public String delete(String ma) {
        boolean add = impl.delete(ma);
        if (add) {
            return "delete thành công";
        } else {
            return "delete thất bại";
        }
    }

    @Override
    public List<MauSac> getAllCbb() {
        return impl.getAllCBB();
    }

}
