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
public class context{

    Tinh tinhToan;

    public context() {
    }
    
    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinhToan(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
