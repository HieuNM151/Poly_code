/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.MauSac;

/**
 *
 * @author ASUS
 */
public interface MauSacSerivce {
    
    List<MauSac> getAll();
    
    String add(MauSac ms);
    
    String update(MauSac ms,String ma);
    
    String delete(String ma);
    
    List<MauSac> getAllCbb();
}
