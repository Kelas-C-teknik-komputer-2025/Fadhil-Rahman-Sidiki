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
    private int sks;
    private String nilaiHuruf;
    private double nilaiBobot;
    
    public static double konversiNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A" -> {
                return 4.0;
            }
            case "A-" -> {
                return 3.7;
            }
            case "B+" -> {
                return 3.3;
            }
            case "B" -> {
                return 3.0;
            }
            case "B-" -> {
                return 2.7;
            }
            case "C+" -> {
                return 2.3;
            }
            case "C" -> {
                return 2.0;
            }
            case "D" -> {
                return 1.0;
            }
            case "E" -> {
                return 0.0;
            }
            default -> {
                return 0.0;
            }
        }
    }
    
    public MainProgram(int sks, String nilaiHuruf) {
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
        this.nilaiBobot = konversiNilai(nilaiHuruf);
    }
    
    public double ambilNilaiMutu() {
        return nilaiBobot * sks;
    }
    
    public int ambilSKS() {
        return sks;
    }
    public double ambilNilaiBobot() {
        return nilaiBobot;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double totalNilaiMutu = 0;
        int totalSKS = 0;
        
        System.out.println("Masukkan total mata kuliah yang diambil:");
        int totalMK = keyboard.nextInt();
        keyboard.nextLine();
        
        MainProgram[] listMK = new MainProgram[totalMK];

        for (int i = 0; i < totalMK; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = keyboard.nextLine();
            System.out.print("Nilai SKS: ");
            int sks = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Nilai Huruf (A, A-, B+, B, B-, C+, C, D, E): ");
            String nilaiHuruf = keyboard.nextLine().trim().toUpperCase();
            
            listMK[i] = new MainProgram(sks, nilaiHuruf);
        }
        
        for (MainProgram mk : listMK) {
            totalNilaiMutu += mk.ambilNilaiMutu();
            totalSKS += mk.ambilSKS();
        }
        
        double totalIPS = totalNilaiMutu / totalSKS;
        
        System.out.printf("Total Nilai Mutu  : %.2f%n", totalNilaiMutu);
        System.out.printf("Total SKS         : %d%n", totalSKS);
        System.out.printf("Total IPS         : %.2f%n", totalIPS);
    }
}