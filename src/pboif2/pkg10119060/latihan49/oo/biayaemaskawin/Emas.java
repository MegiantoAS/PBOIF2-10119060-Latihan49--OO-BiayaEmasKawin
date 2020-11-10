/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan49.oo.biayaemaskawin;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program EmasKawin
 */
public class Emas {
    private double beliEmas;
    private double harga;
    
    public Emas(double beliEmas, double harga){
        this.beliEmas = beliEmas;
        this.harga = harga;
    }
    
    public double getBeliEmas(){
        return beliEmas;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public double hitungTotalBayar(double parBeliEmas, double parHarga){
        return parBeliEmas * parHarga;
    }
}
