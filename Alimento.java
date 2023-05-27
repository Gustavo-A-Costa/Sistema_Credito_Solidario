
package model;


public class Alimento extends ItemDoacao {
    private String tipo;
    private float creditokg;

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCreditokg() {
        return creditokg;
    }

    public void setCreditokg(float creditokg) {
        this.creditokg = creditokg;
    }
    
}
