package tugaspbo;

import java.util.Scanner;

public class TugasPBO {
    public static void main(String[] args) {
        System.out.println("Pilih Operator Anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Pengurangan");
        System.out.println("4. Pembagian");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();

        System.out.println();
        System.out.print("masukkan bilangan 1 : ");
        int bilangan1 = input.nextInt();
        System.out.print("masukkan bilangan 2 : ");
        int bilangan2 = input.nextInt();

        System.out.println();
        if (pilihan == 1){
            int hasil = bilangan1 + bilangan2;
            System.out.println("Hasil Penjumlahan " + bilangan1 + " DAN " + bilangan2 + " : "+hasil);
        }else if (pilihan == 2){
            int hasil = bilangan1 * bilangan2;
            System.out.println("Hasil Perkalian " + bilangan1 + " DAN " + bilangan2 + " : "+hasil);
        }else if (pilihan == 3){
            int hasil = bilangan1 - bilangan2;
            System.out.println("Hasil Pengurangan " + bilangan1 + " DAN " + bilangan2 + " : "+hasil);
        }else if (pilihan == 4){
            int hasil = bilangan1 / bilangan2;
            System.out.println("Hasil Pembagian " + bilangan1 + " DAN " + bilangan2 + " : "+hasil);
        }
    }
}
