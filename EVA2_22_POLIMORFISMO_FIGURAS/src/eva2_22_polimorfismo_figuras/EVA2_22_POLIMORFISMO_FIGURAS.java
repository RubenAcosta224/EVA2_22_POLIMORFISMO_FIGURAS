/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int[] datos=new int[10];
//        Circulo[] circulos=new Circulo[10];
//        
//        for (int i = 0; i < circulos.length; i++) {
//            circulos[i]=new Circulo(5);
//        
//            circulos[i].imprimirDatos();
//        }
        
        FIGURAS[] figuras;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Figuras capturar");
        
        int cant=input.nextInt();
        figuras=new FIGURAS[cant];
        
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Quieres un circulo (1 o un triangulo (2 ???");
            int figu=input.nextInt();
            
            if(figu==1){
                Circulo circu=new Circulo();
                System.out.println("Introduce radio");
                
                circu.setRadio(input.nextDouble());
                figuras[i]=circu;
            }else{
                Triangulo trian=new Triangulo();
                
                trian.setAltura(input.nextDouble());
                trian.setBase(input.nextDouble());
                figuras[i]=trian;
            }
        }
        
        
        for (int i = 0; i < figuras.length; i++) {
            
            if(figuras[i] instanceof Circulo){
                System.out.println("Círculo: "+i);
//////////////////////////////////////////////////////////////casting
                Circulo circu=(Circulo)figuras[i];
                circu.imprimirDatos();
                
//                System.out.println("Area: "+figuras[i].calcularArea());
//                System.out.println("Perimetro: "+figuras[i].calcularPerimetro());
            }else{
                System.out.println("Triángulo: "+i);
//////////////////////////////////////////////////////////////casting
                Triangulo trian=(Triangulo)figuras[i];
                trian.imprimirDatos();
//                System.out.println("Area: "+figuras[i].calcularArea());
//                System.out.println("Perimetro: "+figuras[i].calcularPerimetro());
            }
            

        }

    }
    
}
