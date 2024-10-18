/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Windows extends Laptop{
    String fitur;
    
    public Windows(){
        
    }

    public Windows(String fitur, String jenisBaterai, String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        super(jenisBaterai, merk, kecProsesor, sizeMemory, jenisProsesor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur tambahan :" +fitur );
        
    }
}
