/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author quang
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context tt = new context();
       
        tt.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + tt.tinhToan(75, 12));

        tt.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + tt.tinhToan(54, 78));
    }
    
}
