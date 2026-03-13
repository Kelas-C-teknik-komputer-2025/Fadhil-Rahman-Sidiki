/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fadhil2314
 */
public class MataKuliah {
    int sks;
    String nilaiHuruf;
    double nilaiBobot;
    
    public MataKuliah(int sks, String nilaiHuruf) {
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
        this.nilaiBobot = konversiNilai(nilaiHuruf);
    }
    
    public int getSKS() {
        return sks;
    }
    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
    public double getNilaiBobot() {
        return nilaiBobot;
    }
    
    private double konversiNilai(String nilaiHuruf) {
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
}
