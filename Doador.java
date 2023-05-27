
package model;


public abstract class Doador {
    protected String nome;
    protected int codigoDoador;

    public int getCodigoDoador() {
        return codigoDoador;
    }

    public void setCodigoDoador(int codigoDoador) {
        this.codigoDoador = codigoDoador;
    }
    protected Doacao[] doacoes = new Doacao[100];//falta tamanho do array
    
    public void incluirDoacao(){
        
    }
    public void calculoCredito(){
        return /* calculo de credito */ ;
    }
    
}
