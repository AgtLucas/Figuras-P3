/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
public class Quadrado extends Figura2D {
    
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    double CalcularArea() {
        return (Math.pow(this.getLado(), 2));
    }

    @Override
    double CalcularPerimetro() {
        return this.getLado() * 4;
    }

    @Override
    void desenhar() {
        System.out.println("Quadrado");
    }
    
    
}
