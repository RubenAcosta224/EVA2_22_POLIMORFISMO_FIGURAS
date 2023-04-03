/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_polimorfismo_figuras;

/**
 *
 * @author invitado
 */
public class Circulo implements FIGURAS,MostrarDatos{
    private double radio;
    
    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*2*radio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio"+radio);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }

}
