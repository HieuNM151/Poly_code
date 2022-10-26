/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import service.HoaDonService;
import java.util.List;
import model.HoaDon;
import repository.HoaDonRepository;
import modelview.HoaDonCT;

/**
 *
 * @author ASUS
 */
public class HoaDonServiceImpl implements HoaDonService{

    private HoaDonRepository hdr = new HoaDonRepository();
    
    @Override
    public List<HoaDon> getALL() {
        return hdr.getALL();
    }

    @Override
    public String add(HoaDon hd) {
        Boolean add = hdr.add(hd);
        if (add) {
            return "add thành công";
        } else {
            return "add thất bại";
        }
    }

    @Override
    public String update(HoaDon hd, String ma) {
        Boolean update = hdr.update(hd, ma);
        if (update) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public List<HoaDonCT> getAllHoaDonCT(String ma) {
        return hdr.getALLHoaDonChiTiet(ma);
    }

    @Override
    public List<HoaDon> getAllThanhToan(int tinhTrang) {
        return hdr.getALLThanhToan(tinhTrang);
    }
    
}
