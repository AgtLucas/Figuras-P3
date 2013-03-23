/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
class Cubo extends Figura3D {
    
    private Quadrado face;
    
    public Cubo(Quadrado quadrado) {
        this.face = quadrado;
    }
    
    @Override
    double CalcularVolume() {
        return (Math.pow(this.face.CalcularPerimetro()/4, 3));
    }

    @Override
    void desenhar() {
        System.out.println("Cubo");
    }
    
}
