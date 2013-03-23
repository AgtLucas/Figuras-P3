/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
public class Circulo extends Figura2D {
    
    private int raio = 10;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    double CalcularArea() {
        return (Math.pow(this.raio, 2) * Math.PI);
    }

    @Override
    double CalcularPerimetro() {
        return this.raio * (2 * Math.PI);
    }

    @Override
    void desenhar() {
        System.out.println("Circulo");
    }
    
}
