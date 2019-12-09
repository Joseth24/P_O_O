/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.text.DecimalFormat;
import java.util.Scanner;



public class notas {
    public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("0.##");
        Scanner leer = new Scanner(System.in);
        Double [] lista = new Double[3];
        System.out.println("Promedios");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nota "+(i+1));
            lista[i] = leer.nextDouble();
          
        }
        Double promedio = (lista[0]+lista[1]+lista[2])/3;
        System.out.println("El promedio del alumno es: "+(df.format(promedio)));
    
        if (promedio>12) {
            System.out.println("El alumno esta aprobado");
        }else{
        
         System.out.println("El alumno esta desaprobado");
        }
    }
    
}
