/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import service.NSXService;
import java.util.List;
import model.NhaSanXuat;
import repository.NhaSXRepository;

/**
 *
 * @author ASUS
 */
public class NSXServiceImpl implements NSXService {

    private NhaSXRepository impl = new NhaSXRepository();

    @Override
    public List<NhaSanXuat> getAll() {
        return impl.getALL();
    }

    @Override
    public String add(NhaSanXuat nsx) {
        boolean add = impl.add(nsx);
        if (add) {
            return "add thành công";
        } else {
            return "add không thành công";
        }
    }

    @Override
    public String update(NhaSanXuat nsx, String ma) {
        boolean update = impl.update(nsx, ma);
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
    public List<NhaSanXuat> getAllCbb() {
        return impl.getAllCBB();
    }

}
