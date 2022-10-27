/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.NhaSanXuat;

/**
 *
 * @author ASUS
 */
public interface NSXService {
    
    List<NhaSanXuat> getAll();
    
    String add(NhaSanXuat nsx);
    
    String update(NhaSanXuat nsx,String ma);
    
    String delete(String ma);
    
    List<NhaSanXuat> getAllCbb();
}
