/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Consola.Menu;
import Consola.MenuCallback;
import Metodos.Biseccion;
import Metodos.NewtonRaphson;
import Metodos.ReglaFalsa;
import Metodos.Secante;
import java.awt.event.ActionEvent;

/**
 *
 * @author omars
 */
public class Metodos_Numericos_Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitulo("Proyecto de Metodos Numericos");

        menu.agregar("Metodo de Biseccion", new MenuCallback() {
            @Override
            public void ejecutar() {
                Biseccion metodo = new Biseccion();
                metodo.consola();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        menu.agregar("Metodo de Regla Falsa", new MenuCallback() {
            @Override
            public void ejecutar() {
                ReglaFalsa metodo = new ReglaFalsa();
                metodo.consola();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        menu.agregar("Metodo de Secante", new MenuCallback() {
            @Override
            public void ejecutar() {
                Secante metodo = new Secante();
                metodo.consola();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        menu.agregar("Metodo de Newton Raphson", new MenuCallback() {
            @Override
            public void ejecutar() {
                NewtonRaphson metodo = new NewtonRaphson();
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
