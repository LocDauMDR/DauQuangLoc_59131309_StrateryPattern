/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class QLSV {

    ISoSanh qlSV;
    ArrayList<SinhVien> dsSV;

    public QLSV() {
        dsSV = new ArrayList<>();
    }
    
    public void setSoSanh(ISoSanh qlSV) {
        this.qlSV = qlSV;
    }
    
    public void add(SinhVien o) {
        dsSV.add(o);
    }
    
    public void sapXep() {
        int h = dsSV.size();
        SinhVien sv;
        
        for(int i = 0; i < h-1; i++) {
            for (int j = i + 1; j < h; j++) {
                if(qlSV.soSanh(dsSV.get(i), dsSV.get(j)) > 0) {
                    sv = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, sv);
                }
            }
        }
    }
    
    public void inDS(){
        for(SinhVien s: dsSV)
        {
            System.out.println(s.toString() + "\n");
        }
    }
    
}
