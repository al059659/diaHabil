/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;

import java.util.Scanner;

/**
 *
 * @author reyap
 */
public class DiaHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número de la lista para escoger un día y determinar si es hábil o no.");
        System.out.println("(1) Lunes" + "\n(2) Martes" + "\n(3) Miércoles" + "\n(4) Jueves" + "\n(5) Viernes" + "\n(6) Sábado" + "\n(7) Domingo");
        
        Scanner read = new Scanner(System.in);
        int dia = read.nextInt();
        
        if (dia >= 1 && dia <=7) {
            switch (dia) {
                case 1:
                    System.out.println("El día seleccionado fue Lunes y es un día hábil.");
                    break;
                case 2:
                    System.out.println("El día seleccionado fue Martes y es un día hábil.");
                    break;
                case 3:
                    System.out.println("El día seleccionado fue Miércoles y es un día hábil.");
                    break;
                case 4:
                    System.out.println("El día seleccionado fue Jueves y es un día hábil.");
                    break;
                case 5:
                    System.out.println("El día seleccionado fue Viernes y es un día hábil.");
                    break;
                case 6:
                    System.out.println("El día seleccionado fue Sábado y es fin de semana.");
                    break;
                case 7:
                    System.out.println("El día seleccionado fue Domingo y es fin de semana.");
                    break;
            }
            
        } else {
            System.out.println("Por favor, ingrese un número de la lista para seleccionar un día.");
        }
    }
    
}
