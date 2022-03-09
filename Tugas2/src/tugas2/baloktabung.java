/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class baloktabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, ulang;
        double panjang, lebar, tinggi, jarijari;
        
        do{
            System.out.print(
            "Perhitungan Luas dan Volume\n" +
            "1. Hitung Balok\n" +
            "2. Hitung Tabung\n"+
            "0. Exit\n" +
            "Pilih : "
            );
            
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.print("Input Panjang :");
                    panjang = input.nextInt();
                    System.out.print("Input Lebar : ");
                    lebar = input.nextInt();
                    System.out.print("Input Tinggi : ");
                    tinggi = input.nextInt();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    System.out.println(
                        "\nLuas Persegi Panjang       : " +balok.luas() +
                        "\nKeliling Persegi Panjang   : " +balok.keliling()+
                        "\nVolume Balok               : " +balok.volume()+
                        "\nLuas Permukaan Balok       : " +balok.LuasPermukaan()
                    );
                break;
                case 2:

                    System.out.print("\nInput Tinggi   : ");
                    tinggi = input.nextInt();
                    System.out.print("\nInput jari-jari: ");
                    jarijari = input.nextInt();
                    Tabung tabung = new Tabung(jarijari, tinggi);
                    
                    System.out.println("\nLuas Lingkaran      =" + tabung.luas());
                    System.out.println("\nKeliling Lingkaran  =" + tabung.keliling());
                    System.out.println("\nVolume Tabung       =" + tabung.volume());  
                    System.out.println("\nLuas Permukaan Tabung=" + tabung.LuasPermukaan());
                    
                break;
                case 3:
                return;
            }
            
            System.out.print("Kembali ke menu? (Ya : 1 || Tidak : 0)=");
            ulang = input.nextInt();
            System.out.println("\n");
        }while(ulang == 1);
    }
}
