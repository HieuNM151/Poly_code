/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon;
import modelview.HoaDonCT;

/**
 *
 * @author ASUS
 */
public interface HoaDonService {
    
    List<HoaDonCT> getAllHoaDonCT(String ma);
    
    List<HoaDon> getALL();
    
    String add(HoaDon hd);
    
    String update(HoaDon hd, String ma);
    
    List<HoaDon> getAllThanhToan(int tinhTrang);
    
}
