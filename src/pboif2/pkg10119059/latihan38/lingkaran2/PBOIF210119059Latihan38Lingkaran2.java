/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan diameter, jari-jari lingkaran OO
 */
package pboif2.pkg10119059.latihan38.lingkaran2;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan38Lingkaran2 {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.println("===== Perhitungan Lingkaran ======");
        lingkaran.inputDiameter();
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-Jari Lingkaran = "+ lingkaran.hitungJariJari() +" cm");
        System.out.println("Luas Lingkaran      = "+ lingkaran.hitungLuas() + " cm");
        System.out.println("Keliling Lingkaran  = "+ lingkaran.hitungKeliling()+" cm");
    }
}
