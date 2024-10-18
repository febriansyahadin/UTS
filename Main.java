/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author zanet
 */
public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("MacBook", "Li-on", "Lenovo", 3, 16, "intel i5");
        System.out.println("Data Mac:");
        mac.tampilMac();
        
        // Membuat objek Windows
        Windows windows = new Windows("windows", "Li-on", "Asus", 25, 46, "Amd ryzen" );
        System.out.println("Data Windows:");
        windows.tampilWindows();
        
        // Membuat objek PC
        Pc pc = new Pc(24, "Asus g2", 10, 1024, "asus");
        System.out.println("Data PC:");
        pc.tampilPc();
        System.out.println("------------------------");

    }
}
