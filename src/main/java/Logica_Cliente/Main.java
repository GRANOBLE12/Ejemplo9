/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Paciente;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre="";
        String Cedula="";
        String Direccion="";
        int cantidad=0;
        
        Paciente objpaciente=new Paciente();
        Scanner scan = new Scanner (System.in);
                
        ArrayList < Paciente> listapacientes= new ArrayList<>();
        System.out.println("Cuantos pacientes desea ingresar");
        cantidad=scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite el nombre del empleado");
            Nombre=scan.nextLine();
            
            System.out.println("Digite el numero de cedula del empleado");
            Cedula=scan.nextLine();
            
            System.out.println("Digite la direccion del empleado");
            Direccion=scan.nextLine();
            
            objpaciente=new Paciente(Nombre, Cedula, Direccion);
            listapacientes.add(objpaciente);
        }
        for(int i = 0; i < listapacientes.size(); i++){
            System.out.println("El nombre del paciente es: "+"\t"+listapacientes.get(i).getNombre()+"\n"
            +"La cedula del paciente es: "+"\t"+listapacientes.get(i).getCedula()+"\n"
            +"La direccion del paciente es: "+"\t"+listapacientes.get(i).getDireccion());
            System.out.println("");
        }
            
    }
    
}
