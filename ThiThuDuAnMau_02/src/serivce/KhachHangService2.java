/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serivce;

import java.util.ArrayList;
import java.util.List;
import viewmodel.KhachHangViewmodel2;

/**
 *
 * @author HieuIT
 */
public interface KhachHangService2 {

    List<KhachHangViewmodel2> getAll();

    String add(KhachHangViewmodel2 kh);

    String xoa(String ma);

    ArrayList<KhachHangViewmodel2> getOne(String ma);

    String sua(String ma, KhachHangViewmodel2 kh);
}
