/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Laptop extends Komputer{
    String jenisBaterai;
    
    public Laptop(){
        
    }

    public Laptop(String jenisBaterai, String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        super(merk, kecProsesor, sizeMemory, jenisProsesor);
        this.jenisBaterai = jenisBaterai;
    }
    
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("jenis Baterai " + jenisBaterai);
    }
}
