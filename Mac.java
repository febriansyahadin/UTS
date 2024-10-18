/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Mac extends Laptop{
    String security;
    
    public Mac(){
        
    }

    public Mac(String security, String jenisBaterai, String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        super(jenisBaterai, merk, kecProsesor, sizeMemory, jenisProsesor);
        this.security = security;
    }
    
   public void tampilMac(){
       super.tampilLaptop();
       System.out.println("Fitur security " + security);
   }
}
