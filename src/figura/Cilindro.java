/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author AgtLucas
 */
class Cilindro extends Figura3D {
    
    private Circulo circulo;
    private int altura;
    
    public Cilindro(Circulo circulo, int altura) {
        this.circulo = circulo;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    double CalcularVolume() {
        return Math.PI * (Math.pow(this.circulo.getRaio(), 2)) * this.altura;
    }

    @Override
    void desenhar() {
        System.out.println("Cilindro");
    }
    
}
