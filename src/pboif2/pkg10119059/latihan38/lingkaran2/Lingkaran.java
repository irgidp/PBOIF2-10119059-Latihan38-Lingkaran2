/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan diameter, jari-jari lingkaran OO
 */
package pboif2.pkg10119059.latihan38.lingkaran2;

import java.util.Scanner;

/**
 *
 * @author Corazon
 */
public class Lingkaran {
    Scanner input = new Scanner(System.in);
    String konversi;
    double diameter;
    boolean kondisi = true;
    
    public double inputDiameter() {
        do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
            konversi = input.next();
                if(konversi.matches("[0-9]*")){
                    diameter = Integer.parseInt(konversi);
                    kondisi = true;
                }else{
                    System.err.println("Nilai Diameter Tidak Sesuai");
                    kondisi = false;
                }
    }while(!kondisi);
        return diameter;  
    }
    
    public double hitungJariJari(){
        return diameter/2;
   }
   
   public double hitungLuas(){
       return 3.14 * hitungJariJari() * hitungJariJari();
   }
   
   public double hitungKeliling(){
       return 2 *3.14 * hitungJariJari();
   }
}
