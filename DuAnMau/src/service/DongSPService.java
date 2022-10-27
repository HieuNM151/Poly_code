/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.DongSP;

/**
 *
 * @author ASUS
 */
public interface DongSPService {
    List<DongSP> getAll();
    
    String add(DongSP DongSP);
    
    String update(DongSP DongSP,String ma);
    
    String delete(String ma);
    
    List<DongSP> getAllCbb();
}
