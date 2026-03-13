/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fadhil2314
 */
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double totalNilaiMutu = 0;
        int totalSKS = 0;
        
        System.out.println("Masukkan total mata kuliah yang diambil:");
        int totalMK = keyboard.nextInt();
        keyboard.nextLine();
        
        MataKuliah[] listMK = new MataKuliah[totalMK];

        for (int i = 0; i < totalMK; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = keyboard.nextLine();
            System.out.print("Nilai SKS: ");
            int sks = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Nilai Huruf (A, A-, B+, B, B-, C+, C, D, E): ");
            String nilaiHuruf = keyboard.nextLine().trim().toUpperCase();
            
            listMK[i] = new MataKuliah(sks, nilaiHuruf);
        }
        
        for (MataKuliah mk : listMK) {
            totalNilaiMutu += mk.getNilaiBobot();
            totalSKS += mk.getSKS();
        }
        
        double totalIPS = totalNilaiMutu / totalSKS;
        
        System.out.printf("Total Nilai Mutu  : %.2f%n", totalNilaiMutu);
        System.out.printf("Total SKS         : %d%n", totalSKS);
        System.out.printf("Total IPS         : %.2f%n", totalIPS);
    }
}
