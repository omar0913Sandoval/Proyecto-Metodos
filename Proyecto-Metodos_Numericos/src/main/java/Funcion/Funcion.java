/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcion;

import de.congrace.exp4j.*;
/**
 *
 * @author omars
 */
public class Funcion {
    
    protected ExpressionBuilder parser; 

    public Funcion(){
    }
   
    public Funcion(String funcion, boolean reporte){
        if(reporte){
           System.out.println("");
           System.out.println("Funcion:"+funcion);
        }
       this.parser = new ExpressionBuilder(funcion);
    }
   
    public Funcion(String funcion){
       System.out.println("");
       System.out.println("Funcion:"+funcion);
       
       this.parser = new ExpressionBuilder(funcion);
    }
   
    public double evaluar(double valor){
        double resultado = 0;
        try{
           resultado = this.evaluar(valor,false);
        }catch(UnknownFunctionException | UnparsableExpressionException ex){}
        return resultado;
    }
   
    public double evaluar(double x, double y){
        double resultado = 0;
        try{
           resultado = this.evaluar(x,y,false);
        }catch(UnknownFunctionException | UnparsableExpressionException ex){}
        return resultado;
    }
   
    public double evaluar(){
        double resultado = 0;
        try{
            resultado = this.evaluar(false);
        }catch(UnknownFunctionException | UnparsableExpressionException ex){}
        return resultado;
    }
   
    public double evaluar(double x, double y, boolean error) throws UnknownFunctionException, UnparsableExpressionException{
        double resultado = 0;
        Calculable calc = this.parser.withVariable("x", x).withVariable("y", y).build();
        resultado = calc.calculate();//Calcula el resultado de la expresion
        
        return resultado;
    }
   
    public double evaluar(double valor, boolean error) throws UnknownFunctionException, UnparsableExpressionException{
        double resultado = 0;
        Calculable calc = this.parser.withVariable("x", valor).build(); 
        resultado = calc.calculate(); //Calcula el resultado de la Expresion
       
        return resultado;
    }
   
    public double evaluar(boolean error) throws UnknownFunctionException, UnparsableExpressionException{
        return this.evaluar(0,error);
    }
}
