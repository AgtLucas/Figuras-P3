/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
public class Triangulo extends Figura2D {
    
    private int base;
    private int altura;
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        double hyp = (Math.hypot(this.base, this.altura) * 2);
        return hyp + this.base;
    }

    @Override
    void desenhar() {
        System.out.println("Triangulo");
    }
    
}
