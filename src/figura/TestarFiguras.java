/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.ArrayList;

/**
 *
 * @author AgtLucas
 */
public class TestarFiguras {
 
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        fabricarFiguras(figuras);
        for (Figura figura:figuras) {
            figura.desenhar();
            if (figura instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println("  + Foi invocado calcularArea() e retornou " + figura2D.calcularArea());
                System.out.println("  + Foi invocado calcularPerimetro() e retornou " + figura2D.calcularPerimetro());
            } else {
                Figura3D figura3D = (Figura3D) figura;
                System.out.println("  + Foi invocado calcularVolume() e retornou " + figura3D.calcularVolume());
            }
        }
    
    }
    
    private static void fabricarFiguras(ArrayList figuras) {
        figuras.add(new Quadrado(3));
        figuras.add(new Triangulo(6, 4));
        figuras.add(new Circulo());
        figuras.add(new Cubo(new Quadrado(4)));
        figuras.add(new PiramideRegular(new Triangulo(12,8), 15));
        figuras.add(new Cilindro(new Circulo(), 13));
    }
    
}
