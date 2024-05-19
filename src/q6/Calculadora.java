/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author User
 */
abstract class Calculadora {
    public abstract double somar(double a, double b);
    public abstract double subtrair(double a, double b);
    public abstract double multiplicar(double a, double b);
    public abstract double dividir(double a, double b);
}

class CalculadoraCientifica extends Calculadora {
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero.");
            return Double.NaN; 
        }
    }

    
    public double calcularRaizQuadrada(double a) {
        return Math.sqrt(a);
    }

    
    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
