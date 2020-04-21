/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author quang
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");
        SinhVien sv1 = new SinhVien("Nguyễn Nam Long", d.parse("23-5-1999"), 8);
        SinhVien sv2 = new SinhVien("Trần Hoài Nam", d.parse("12-7-1999"), 10);
        SinhVien sv3 = new SinhVien("Hoàng Văn Luận", d.parse("4-9-1999"),7);
        SinhVien sv4 = new SinhVien("Vũ Ngọc Ánh", d.parse("14-10-1999"),9);
        
        QLSV dssv = new QLSV();
        
        dssv.add(sv1);
        dssv.add(sv2);
        dssv.add(sv3);
        dssv.add(sv4);
        
        System.out.println("==== SAP XEP THEO TEN ====");
        dssv.setSoSanh(new SoSanhTheoTen());
        dssv.sapXep();
        dssv.inDS();
        
        System.out.println("==== SAP XEP THEO DIEM ====");
        dssv.setSoSanh(new SoSanhTheoDiem());
        dssv.sapXep();
        dssv.inDS();
    }   
    
    
}
