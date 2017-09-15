/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01ejercicio01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class P01ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese numero1:");  //multiplicando
        double num1=input.nextDouble();
        System.out.println("cantidad de veces");  //multiplicador
        double num2=input.nextDouble();
        double num3=0;                          //producto acumulado
        for (int i = 1; i < num2+1; i++) {  //bucle acumulador
            num3+=num1;
        }
        System.out.println(num3);
    }
    
}
