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
public class PBOIF210119060Latihan49OOBiayaEmasKawin {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Emas objEmas = new Emas(15.7, 570000);
        
        System.out.println("Hendi membeli emas Kawin dengan total berat= "+ ""+objEmas.getBeliEmas()+" gram");
        System.out.printf("Harga Emas 1 gram perbulan oktober         = Rp. %.0f\n",objEmas.getHarga());
        System.out.printf("Total yang harus dibayar oleh Hendi        = "+ "Rp. %.0f\n",objEmas.hitungTotalBayar(objEmas.getBeliEmas(), objEmas.getHarga()));
        
    }
    
}
