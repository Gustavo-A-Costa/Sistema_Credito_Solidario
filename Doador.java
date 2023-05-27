
package model;


public abstract class Doador extends Doacao {
    protected String nome;
    protected int codigoDoador;
    protected Doacao[] doacoes = new Doacao[1000];//falta tamanho do array

    public int getCodigoDoador() {
        return codigoDoador;
    }

    public void setCodigoDoador(int codigoDoador) {
        this.codigoDoador = codigoDoador;
    }
    
    
    public void incluirDoacao(){
        
    }
    public void calculoCredito(){
        return /* calculo de credito */ ;
    }
    
}
