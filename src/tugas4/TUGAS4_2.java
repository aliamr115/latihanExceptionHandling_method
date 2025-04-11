/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TUGAS4_2 {
    public double luas_persegipanjang (int panjang, int lebar){
    int total = panjang * lebar;
    return total;
}

public double luas_segitiga (int alas, int tinggi){
    int total = (alas*tinggi)/2;
    return total;
}

public double luas_lingkaran (int diameter){
    int jari_jari = diameter / 2;
    double total = Math.PI*Math.pow(jari_jari, 2);
    return total;
}

    public static void main(String[] args) {
        TUGAS4_2 count = new TUGAS4_2();
        try {
            double total = 0;
            String jenis = "";
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan :\n"
                    + "1.Luas persegi panjang\n"
                    + "2.Luas segitiga\n"
                    + "3.Luas lingkaran"));
            
            if (pilihan == 1) {
                int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
                int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
                total = count.luas_persegipanjang(panjang, lebar);
                jenis = "Persegi Panjang";
            } else if (pilihan == 2) {
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas"));
                int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi"));
                total = count.luas_segitiga(alas, tinggi);
                jenis = "Segitiga";
            } else if (pilihan == 3) {
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Diameter"));
                total = count.luas_lingkaran(diameter);
                jenis = "Lingkaran";
            } else {
                JOptionPane.showMessageDialog(null, "Input-an tidak valid!");
            }
            
            JOptionPane.showMessageDialog(null, "Luas" + jenis + "=" + total);
            System.out.println("Luas" + jenis + "=" + total);
        } catch (Exception e) {
            
        JOptionPane.showMessageDialog(null,"Input-an tidak valid!");
            System.out.println("Input-an tidak valid!");
        }
    }   
}

