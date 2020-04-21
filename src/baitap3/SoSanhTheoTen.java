/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author quang
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        String s1 = o1.getHoTen();
        String s2 = o2.getHoTen();
        if (s1.compareTo(s2)>0) return 1;
        else if (s1.compareTo(s2)==0) return 0;
        else return -1;
    }
    
}
