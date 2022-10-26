/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SanPham;
import model.ChiTietSP;

/**
 *
 * @author ASUS
 */
public interface SanPhamService {
    
    List<SanPham> getAllSP();
    
    String add(SanPham sp);
    
    String update(SanPham sp,String ma);
    
    String delete(String ma);
    
    List<SanPham> getAllCbb();
}
