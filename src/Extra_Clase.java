/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rachell Mora Reyes
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Extra_Clase {

    static ArrayList<String> datosCliente = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sistema = new Scanner(System.in);

        String nuevocliente;
        System.out.println("Ingrese los datos del cliente a inscribir: (Nombre, Apellido, email, telefomo, direccion)  .");
        for (int j = 0; j < 5; j++) {
            nuevocliente = sistema.next();
            sistema.nextLine();
            datosCliente.add(nuevocliente);

        }//fin for.
        System.out.println("Se registro a " + datosCliente.get(0) + " exitosamente.");
        
        System.out.println("Se registro a " + datosCliente + " exitosamente.");
    }//fin de main

}// fin de codigo

