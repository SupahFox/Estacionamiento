/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author usuLab
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Estacionamiento {
    
    //CLASES
    private static Auto auto = new Auto();
    private static Chofer chofer = new Chofer();
    private static Piso piso = new Piso();
    
    //ARRAYLIST
    private static ArrayList<Auto> autos = new ArrayList();
    private static ArrayList<Piso> pisos = new ArrayList();
    private static ArrayList<Chofer> ch = new ArrayList();
    
    //ARRAYS, SCANNER Y CONTADOR DE PISOS
    private static boolean lugares[] = new boolean[13];
    private static Scanner sc = new Scanner(System.in);
    private static int pisocount = 1;
    
    //FECHA
    private static Date fecha = Calendar.getInstance().getTime();
    private static DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static String fechade = formato.format(fecha);
    
    
    public static void main(String[] args) {
    int verde = 0;
    do{
        System.out.println("Bienvenido al piso 1 del estacionamiento. Presione el boton verde para registrarse y retire su ticket");
        System.out.println("Presione 1 para oprimir el botón");
        verde = sc.nextInt();
        
        if(verde == 1){
            System.out.println("Registro:");
            registro();
        }else if (verde != 1){
            System.out.println("Opción inválida");
        }
    }while(verde != 1);
    }
    
    public static void registro(){
        String op;
        do{
        
        sc.nextLine();
        System.out.println("Ingrese su nombre");
        chofer.setNombre(sc.nextLine());
        
        System.out.println("Ingrese su apellido");
        chofer.setApellido(sc.nextLine());
        
        System.out.println("Ingrese su cedula");
        chofer.setCedula(sc.nextInt());
        
        System.out.println("Ingrese su sexo");
        chofer.setSexo(sc.next().charAt(0));
        
        System.out.println("/////");
        chofer.mostrarChofer();
        
        sc.nextLine();
        System.out.println("Es correcto? (si / no)");
        
        op = sc.nextLine();
        ch.add(chofer);
        }while(!"si".equals(op));
        
    if("si".equals(op)){
            //System.out.println("Fuiste dado de alta! Bienvenido " + emp.getNombre() + " " + emp.getApellido() + "!");
            System.out.println("Correcto. Pasemos a validar el auto");
            
            auto();
    }
    }
    
    public static void auto(){
        String op;
    do{
        System.out.println("Ingrese la marca");
        auto.setMarca(sc.nextLine());
        
        System.out.println("Ingrese el modelo");
        auto.setModelo(sc.nextLine());
        
        System.out.println("Ingrese el color");
        auto.setColor(sc.nextLine());
        
        System.out.println("Ingrese la matricula");
        auto.setMatricula(sc.nextInt());
        
        System.out.println("Ingrese la fecha de entrada");
        auto.setFecha(sc.nextLine());
        
        System.out.println("Resumen de datos ingresados (hasta ahora)");
        chofer.mostrarChofer();
        System.out.println("/////");
        auto.mostrarAuto();
        System.out.println("/////");
        
        System.out.println("Es correcto? (si / no)");
        
        op = sc.nextLine();
        autos.add(auto);
        
        piso();
        }while(!"si".equals(op));
    }
    
    public static void piso(){
    String op = null;
    int op1 = 0;
        int tamaniolugares = 0;
        tamaniolugares = lugares.length;
        int lugar = 0;
        

    do{
       
       if(pisocount <= 5 && pisocount > 0){
           
        piso.setEntrada(fechade);
        
        System.out.println("Actualmente usted se encuentra en el piso " + pisocount);
        System.out.println("Fecha de entrada: " + piso.getEntrada());
        System.out.println("Los " + tamaniolugares + " lugares de el piso " + pisocount + " se encuentran disponibles");
        System.out.println("Seleccione su lugar");
        
        lugar = sc.nextInt();
        
        for(int i = 0; i < lugares.length; i++){
            if(lugar == i){
                lugares[i] = true;
            }
        }
        if(lugares[lugar] == true){
        piso.setEstacionado(true);
        System.out.println("Perfecto, te has estacionado en el número " + lugar + "!");
        System.out.println("Estacionado? : " + piso.getEstacionado());
        
        System.out.println("Deseas salir del lugar seleccionado? (Presiona 1 para salir)");
        op1 = sc.nextInt();
        if(op1 == 1){
            lugares[lugar] = false;
            System.out.println("Saliste del número " + lugar);
            System.out.println("/////");
            System.out.println("Deseas subir de piso?");
        }
        
        
 System.out.println("----------------------------------------------------- \n"
                    + "Presione 1 para subir de piso\n"
                    + "Presione 2 para salir \n"
                    + "----------------------------------------------------- ");
            System.out.print("[|]:");
            op1 = sc.nextInt();
            switch (op1) {
                default:
                    System.out.println("¡No existe la opción " + '"' + op1 + '"' + "!");
                    break;
                case 1:
                    piso.setSalida(fechade);
                    piso.setEstacionado(false);
                    System.out.println("Fecha de salida: " + piso.getSalida());
                    System.out.println("Estacionado? : " + piso.getEstacionado());
                    pisocount++;
                    piso();
                    break;
                case 2:
                    System.out.println("Deseas salir? Oprime 1 para salir o escribe cualquier número para continuar");
                    System.out.print("[|]:");
                    op1 = sc.nextInt();
                    if (op1 == 1) {
                        System.out.println("Powered by TomiokaDev 2017 - 2021");
                        System.out.println("https://github.com/TomiokaDev");
                        System.exit(0);
                    } else {
                    }
                    break;
            }
        }
        
       }
       
       if(pisocount >5){
          System.out.println("Actualmente usted no puede subir más pisos");
          
           System.out.println("Seleccione el piso al que quiere bajar");
           
       
 System.out.println("----------------------------------------------------- \n"
                    + "Presione cualquier numero menor al 6 para bajar de piso\n"
                    + "Presione 0 para salir \n"
                    + "----------------------------------------------------- ");
            System.out.print("[|]:");
            pisocount = sc.nextInt();
            
                 if(pisocount <= 5 && pisocount > 0){
                 piso();
                 }
                 
            switch (op1) {
                default:
                    System.out.println("¡No existe la opción " + '"' + op1 + '"' + "!");
                    break;
                case 0:
                    System.out.println("Deseas salir? Oprime 1 para salir o escribe cualquier número para continuar");
                    System.out.print("[|]:");
                    op1 = sc.nextInt();
                    if (op1 == 1) {
                        System.out.println("Powered by TomiokaDev 2017 - 2021");
                        System.out.println("https://github.com/TomiokaDev");
                        System.exit(0);
                    } else {
                    }
                    break;
            }
            
        }
       
    }while(!"si".equals(op));
    }
    
    }
