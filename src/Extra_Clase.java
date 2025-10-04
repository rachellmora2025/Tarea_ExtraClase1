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

    static Scanner sistema = new Scanner(System.in);
    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<String> apellidos = new ArrayList<>();
    static ArrayList<String> emails = new ArrayList<>();
    static ArrayList<Integer> telefonos = new ArrayList<>();
    static ArrayList<String> direcciones = new ArrayList<>();

    static ArrayList<String> datosCliente = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("===BIENVENIDO AL SISTEMA===");
        System.out.println("INGRESE LA CANTIDAD DE USUARIOS A REGISTRAR");
        int cant = sistema.nextInt();
        sistema.nextLine();
        for (int i = 0; i < cant; i++) {
            System.out.println("=== REGISTRO " + (i + 1) + " ===");

            System.out.print("Nombre: ");
            String nombre = sistema.nextLine();

            System.out.print("Apellido: ");
            String apellido = sistema.nextLine();

            System.out.print("Email: ");
            String email = sistema.nextLine();

            System.out.print("Telefono: ");
            int telefono = sistema.nextInt();
            sistema.nextLine();
            System.out.print("Direccion: ");
            String direccion = sistema.nextLine();

            nombres.add(nombre);
            apellidos.add(apellido);
            emails.add(email);
            telefonos.add(telefono);
            direcciones.add(direccion);

        }
        System.out.println("====RESUMEN DEL REGISTRO===");
        for (int i = 0; i < cant; i++) {
            System.out.println("===Usuario " + (i + 1) + "===");
            System.out.println("Nombre: " + nombres.get(i) + " " + apellidos.get(i));
            System.out.println("Email: " + emails.get(i));
            System.out.println("Telefono: " + telefonos.get(i));
            System.out.println("Direccion: " + direcciones.get(i));
        }
    }//fin de main

}// fin de codigo 

