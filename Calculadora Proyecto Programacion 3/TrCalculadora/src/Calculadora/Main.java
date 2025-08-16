/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import javax.swing.SwingUtilities;

/**
 *
 * @author Julian Perez
 */
public class Main {
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazCalculadora calculadora = new InterfazCalculadora();
            calculadora.setVisible(true);
        });
    }
}
