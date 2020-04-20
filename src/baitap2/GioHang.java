/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class GioHang {
    IThanhToan thanhToan;
    ArrayList<HangHoa> dsHH;

    public GioHang() {
        dsHH = new ArrayList<>();
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void themHang(HangHoa h) {
        dsHH.add(h);
    }
    
    public double hinhThucTT() {
        int tong = 0;
        for (int i = 0; i < dsHH.size(); i++) {
            tong = (int) (tong + thanhToan.thanhToan(dsHH.get(i).getGia()));
        }
        return tong;
    }
   
    public void inDS() {
        for (int i = 0; i < dsHH.size(); i++) {
            dsHH.get(i).hienThiTT();
        }
    }
    
}
