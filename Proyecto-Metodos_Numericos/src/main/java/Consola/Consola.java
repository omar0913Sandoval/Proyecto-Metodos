/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import Funcion.Funcion;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author omars
 */
public class Consola {
    InputStream in;
    
    public Consola(){
        this.in = System.in;
    }
    
    /*Retorna un numero entero que se ingresa por la consola*/
    public int getEntero(){
        return this.getEntero("");
    }
    /*Retorna un numero entero que se ingresa por consola*/
    public int getEntero(String mensaje){
        return this.getEntero(mensaje,0);
    }
    /*Retorna un numero entero que se ingresara por consola*/
    public int getEntero(String mensaje, int defecto){
        mensaje = mensaje.equals("") ? mensaje: mensaje + "["+defecto+"]";
        int numero = (int) this.getNumero(mensaje, defecto);
        return numero;
    }
    /*Retoran  un numero que se ingresa por consola*/
    public double getNumero(){
        return this.getNumero("");
    }
    /*Retorna true o false al ingresar por consola SI o NO respectivamente*/
    public boolean getBoolean(String mensaje){
        boolean opcion;
        
        mensaje = mensaje.equals("") ? mensaje : mensaje + "SI/NO [NO]";
        String respuesta = this.getCadena(mensaje);
       
        if(respuesta.equalsIgnoreCase("SI")){
            opcion = true;
        } else {
            opcion = false;
        }
       return opcion;
    }
    /*Retorna un numero que se ingresa por consola*/
    public double getNumero(String mensaje){
        return this.getNumero(mensaje,0);
    }
    /*Retorna un numero que se ingresarar por consola*/
    public double getNumero(String mensaje, double defecto){
        double numero;
        
        try{
            Funcion funcion = new Funcion(this.getCadena(mensaje), false);
            numero = funcion.evaluar(true);
        }catch(Exception ex){
            if(defecto !=0){
                return defecto;
            } else {
                System.out.println("**Error: Valor Incorrecto, Intente Nuevamente**");
                System.out.println("");
                return this.getNumero(mensaje, defecto);
            }
        }
        return numero;       
    }
    /*Retorna una cadena que se ingresara por consola*/
    public String getCadena(){
        return this.getCadena("");
    }
    
    /*Retornar una cadena que se ingresara opor consola*/
    public String getCadena(String mensaje){
        String cadena = "";
        if(!"".equals(mensaje)){
            System.out.println(mensaje+": ");
        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            cadena = br.readLine();
        }catch(IOException ex){}
        
        return cadena;
    }
    /*Rerorna una matriz bidimensional del mimo ancho y alto*/
    public double[][] getMatriz(int ancho_largo){
        return this.getMatriz(ancho_largo,ancho_largo);
    }
    
    /*Retorna una Matriz bidimensional del mismo ancho y alto*/
    public double[][] getMatriz(int ancho, int alto){
        System.out.println("");
        double[][] matriz = new double[alto][ancho];
        
        for(int i=0; i<alto; i++){
            System.out.println("Ingresa datos para M["+i+"]:");
            for(int j=0; j<ancho; j++){
                System.out.println("M["+i+"]["+j+"]:");
                matriz[i][j] = this.getNumero();
            }
            System.out.println("");
        }
        return matriz;
    }
    /*Retorna una Matriz de coordenadas X,Y*/
    /* 2 Filas y N cantidad de Columnas
    */
    public double [][] getCoordenadas(int cantidad){
        System.out.println("");
        double[][] matriz = new double[2][cantidad];
        
        for(int i=0; i < cantidad; i++){
            System.out.println("Los Datos para I["+i+"]:");
            for(int j=0; j <2; j++){
                System.out.println("I["+i+"]["+((j == 0) ? "x" : "y")+"]:");
                matriz[j][i] = this.getNumero();
            }
            System.out.println("");
        }
        return matriz;
    }
    
    /*Limpia la Pantalla en netbeans y JCreator en Windows*/
    public void limpiarPantalla(){
        try{
            Robot robbie = new Robot(); //Construye un objeto Robot en el sistema de coordenadas de la pantalla principal.
            robbie.keyPress(17); //Presiona una tecla determinada
            robbie.keyPress(76);
            robbie.keyRelease(17);
            robbie.keyRelease(76);;
            
            Thread.sleep(100);
            
            //esto es para Jcreator
            robbie.keyPress(17);
            robbie.keyPress(16);
            robbie.keyPress(82);
            robbie.keyRelease(17);
            robbie.keyRelease(16);
            robbie.keyRelease(82);
            
            Thread.sleep(100);
        }catch(Exception ex){
        }
    }
}
