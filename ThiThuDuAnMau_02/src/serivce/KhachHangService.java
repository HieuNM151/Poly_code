/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serivce;

import java.util.List;
import viewmodel.KhachHangViewModel;

/**
 *
 * @author HieuIT
 */
public interface KhachHangService {

    List<KhachHangViewModel> getAll();

    String them(KhachHangViewModel kh);

    String xoa(String ma);
    
    String update(String ma, KhachHangViewModel kh);
    
    List<KhachHangViewModel> getOne(String ma);
}
