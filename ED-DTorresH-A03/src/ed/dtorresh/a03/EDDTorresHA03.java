/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dtorresh.a03;

/**
 *
 * @author DianaAlessa
 */
public class EDDTorresHA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Secuencial OS = new Secuencial ();
        OS.setV(OS.randomV(100));
        OS.showV();
        OS.showF(OS.fetch(5));
        
    }
}