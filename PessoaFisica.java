
package model;


public class PessoaFisica extends Doador {
    
    private final float ALIQUOTA_PF = 0.03f;    

    public float getALIQUOTA_PF() {
        return ALIQUOTA_PF;
    }

    public void imprimeDados(){
        System.out.println("Creditos: ");
        
    }
    @Override
    public void calculoCredito(){
        return ;
    }
    
}
