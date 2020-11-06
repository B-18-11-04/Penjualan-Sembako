
package penjualan;

import java.util.Scanner;

/**
 *
 * @author bhasa
 */
public class Penjualan {


    public static void main(String[] args) {
        //nilai mutlak//
        Scanner keyboard = new Scanner(System.in);
        String[] Barang = {"Beras", "Kecap", "Gula Rose", "Garam"};
        String pembeli, barang;
        int[] harga = {80000, 10000, 25000, 15000};
        int jumlah, totalharga, nominal, kembalian, kurang;
        
        System.out.println("-Daftar Sembako Dan Harganya-");
        
        for (int a = 0; a < Barang.length; a++)
        System.out.println(Barang[a]+" Harganya adalah "+ harga[a]);
        System.out.println("--------------------------------------");
         //input user//
        System.out.print("Nama Pembeli : ");
        pembeli = keyboard.nextLine();
        
        System.out.print("Nama Barang : ");
        barang = keyboard.nextLine();
        
        if (barang.equalsIgnoreCase("Beras")){
            
            System.out.print("Jumlah Barang : ");
            jumlah = keyboard.nextInt();
            
            totalharga = jumlah*harga[0];
            System.out.println("Total Harga : "+totalharga);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            nominal = keyboard.nextInt();
                if (nominal >= totalharga){
                kembalian = nominal-totalharga;
                System.out.println("Kembalian : Rp."+kembalian);
                }else if (nominal < totalharga){
                    kurang = totalharga-nominal;
                System.out.println("Maaf Nominal Anda Kurang : Rp."+kurang);
                }
        }else if (barang.equalsIgnoreCase("kecap")){
            System.out.print("Jumlah Barang : Rp.");
            jumlah = keyboard.nextInt();
            
            totalharga = jumlah*harga[1];
            System.out.println("Total Harga : "+totalharga);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            nominal = keyboard.nextInt();
                if (nominal >= totalharga){
                kembalian = nominal-totalharga;
                System.out.println("Kembalian : Rp."+kembalian);
                }else if (nominal < totalharga){
                kurang = totalharga-nominal;
                System.out.println("Maaf Nominal Anda Kurang : Rp."+kurang);
                }
        }else if (barang.equalsIgnoreCase("Gula Rose")){
            System.out.print("Jumlah Barang : ");
            jumlah = keyboard.nextInt();
            
            totalharga = jumlah*harga[2];
            System.out.println("Total Harga : "+totalharga);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            nominal = keyboard.nextInt();
                if (nominal >= totalharga){
                kembalian = nominal-totalharga;
                System.out.println("Kembalian : Rp."+kembalian);
                }else if (nominal < totalharga){
                kurang = totalharga-nominal;
                System.out.println("Maaf Nominal Anda Kurang : Rp."+kurang);
                }
        }else if (barang.equalsIgnoreCase("Garam")){
            System.out.print("Jumlah Barang : ");
            jumlah = keyboard.nextInt();
            
            totalharga = jumlah*harga[3];
            System.out.println("Total Harga : "+totalharga);
            System.out.print("Nominal Yang Dibayarkan : Rp.");
            nominal = keyboard.nextInt();
                if (nominal >= totalharga){
                kembalian = nominal-totalharga;
                System.out.println("Kembalian : Rp."+kembalian);
                }else if (nominal < totalharga){
                kurang = totalharga-nominal;
                System.out.println("Maaf Nominal Anda Kurang : Rp."+kurang);
                }
        }else{
            System.out.println("<<< Barang Tidak Tersedia >>>");
       }
    }
}