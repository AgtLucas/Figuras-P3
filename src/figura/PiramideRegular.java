/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
class PiramideRegular extends Figura3D {

    private Triangulo triangulo;
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    double CalcularVolume() {
        return 0.3334 * (Math.pow(triangulo.getBase(), 2) * this.getAltura());
    }

    @Override
    void desenhar() {
        System.out.println();
    }
    
}
