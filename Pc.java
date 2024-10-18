/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Pc extends Komputer{
    int ukuranMonitor;

public Pc(){
    
}

    public Pc(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        super(merk, kecProsesor, sizeMemory, jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }



    public void tampilPc(){
    super.tampilData();
        System.out.println("Ukuran Monitor " + ukuranMonitor);
    }
    
}
