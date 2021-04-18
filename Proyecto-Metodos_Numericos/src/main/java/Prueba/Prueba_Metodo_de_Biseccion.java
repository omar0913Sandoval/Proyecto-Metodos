/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Consola.Menu;
import Consola.MenuCallback;
import Funcion.Funcion;
import Metodos.Biseccion;
import java.awt.event.ActionEvent;

/**
 *
 * @author omars
 */
public class Prueba_Metodo_de_Biseccion {

    public static void main(String[] args) {
        final Biseccion metodo = new Biseccion();
      
        Menu menu = new Menu();
        menu.setTitulo("Biseccion");

        Menu submenu = new Menu();
        submenu.agregar("Aproximar la primera raiz positiva para: x^2-5*x+6", new MenuCallback() {
            @Override
            public void ejecutar() {

                Funcion funcion = new Funcion("x^2-5*x+6");
                metodo.evaluar(funcion, 1, 2.5, 0.01);

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        submenu.agregar("Aproximar la raiz para: x^2+x-2", new MenuCallback() {
            @Override
            public void ejecutar() {

                Funcion funcion = new Funcion("x^2+x-2");
                metodo.evaluar(funcion, 0.5, 1.5, 0.01);

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        submenu.agregar("Aproximar la primera raiz positiva para: exp(-x)- (log(x)/log(exp(1)))", new MenuCallback() {
           @Override
            public void ejecutar() {

                Funcion funcion = new Funcion("exp(-x)- (log(x)/log(exp(1)))");
                metodo.evaluar(funcion, 1, 2, 0.0001);

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        submenu.agregar("Aproximar las raices para: x^3-7*(x^2)+14*x-6", new MenuCallback() {
            @Override
            public void ejecutar() {

                Funcion funcion = new Funcion("x^3-7*(x^2)+14*x-6");
                System.out.println("Raiz 1:");
                metodo.evaluar(funcion, 0, 1, 0.001);
                System.out.println("");
                System.out.println("Raiz 2:");
                metodo.evaluar(funcion, 2.5, 3.2, 0.001);
                System.out.println("");
                System.out.println("Raiz 3:");
                metodo.evaluar(funcion, 3.2, 3.8, 0.001);

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        menu.agregar("Ejercicios", submenu);
        menu.agregar("Ingresar Funcion", new MenuCallback() {
            @Override
            public void ejecutar() {  
                metodo.consola();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        menu.mostrar();
    }
}
