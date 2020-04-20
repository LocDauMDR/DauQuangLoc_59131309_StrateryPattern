/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author quang
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa h1 = new HangHoa("Xiaomi Note 8", 900000, "RGB");
        HangHoa h2 = new HangHoa("OPPO Reno", 7000000, "Xanh");
        HangHoa h3 = new HangHoa("iPhone SE", 8000000, "Đỏ");
        HangHoa h4 = new HangHoa("Nokia 1280", 400000, "Đen");
        
        GioHang online = new GioHang();
        GioHang cod = new GioHang();
        
        online.setThanhToan(new ThanhToanOnline());
        online.themHang(h1);
        online.themHang(h2);
        System.out.println("======= ONLINE =======");
        online.inDS();
        System.out.println("So tien: " + online.hinhThucTT());
        
        
        cod.setThanhToan(new ThanhToanCOD());
        cod.themHang(h3);
        cod.themHang(h4);
        System.out.println("======= COD =======");
        cod.inDS();
        System.out.println("So tien: " + cod.hinhThucTT());
        
    }
    
}
