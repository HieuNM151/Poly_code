/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Khachhang;

/**
 *
 * @author ASUS
 */
public interface KhachHangService {
    
    List<Khachhang> getAll();
    
    String add(Khachhang kh);
    
    String update(Khachhang kh,String ma);
    
    String delete(String ma);
}

