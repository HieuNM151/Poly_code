/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import java.util.Map;
import model.ChiTietSP;
import modelview.ChiTietSanPham;

/**
 *
 * @author ASUS
 */
public interface ChiTietSpService {

    List<ChiTietSanPham> getAllChiTietSanPham();

    List<ChiTietSanPham> searchMa(List<ChiTietSanPham> list, String ma);

    List<ChiTietSP> getALL();

    String add(ChiTietSP DongSP);

    String update(ChiTietSP DongSP, String ma);

    String delete(String ma);
    
    void update(Map<ChiTietSanPham, Integer> ctsp);

}
