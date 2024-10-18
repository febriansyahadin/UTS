/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Komputer {
    String merk;
    int kecProsesor;
    int sizeMemory;
    String jenisProsesor;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jenisProsesor = jenisProsesor;
    }
    
    
    public void tampilData(){
        System.out.println("Merk : " + merk);
        System.out.println("kecProsesor : "+ kecProsesor);
        System.out.println("size Memory : " + sizeMemory);
        System.out.println("jenis Prosesor : " + jenisProsesor);
    }
}
