/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Julian Perez
 */
public class Calculadora {
    private double primerNumero;
    private double segundoNumero;
    private String operador;
    // Constructor
    public Calculadora() {
        this.primerNumero = 0;
        this.segundoNumero = 0;
        this.operador = "";
    }
    
    public void setPrimerNumero(double numero) {
        this.primerNumero = numero;
    }
    public void setSegundoNumero(double numero) {
        this.segundoNumero = numero;
    }
    public void setOperador(String operador) {
        this.operador = operador;
    }
    // Lógica de cálculo
    public double calcular() {
        switch (operador) {
            case "+":
                return primerNumero + segundoNumero;
            case "-":
                return primerNumero - segundoNumero;
            case "*":
                return primerNumero * segundoNumero;
            case "/":
                if (segundoNumero != 0) {
                    return primerNumero / segundoNumero;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            case "√":
                if (primerNumero < 0) {
                    throw new ArithmeticException("Raíz de número negativo");
                }
                return Math.sqrt(primerNumero);
            case "^":
                return Math.pow(primerNumero, segundoNumero);
            case "Sen":
                return Math.sin(Math.toRadians(primerNumero));
            case "Cos":
                return Math.cos(Math.toRadians(primerNumero));
            case "Tan":
                return Math.tan(Math.toRadians(primerNumero));
            case "IVA":
                return primerNumero * (1 + (segundoNumero/100));
            default:
                throw new UnsupportedOperationException("Operador no soportado");
        }
    }
}
