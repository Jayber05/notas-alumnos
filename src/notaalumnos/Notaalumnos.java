/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notaalumnos;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Notaalumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double[] nota = new double[15];
         Scanner entrada= new Scanner(System.in);
        
        System.out.println("digita 15 notas");
        for (int i = 0; i < 15; i++) {
        nota[i]=entrada.nextDouble();
        
        }
        notas z=new notas(nota);
         z.setnotaM();
        z.getnotaM();
       z.setPorcentaje();
       z.getporcentaje();
       z.setpromedio();
       z.getpromedio();
       z.setposicion();
       z.getposicion();
        
    }
    
}
