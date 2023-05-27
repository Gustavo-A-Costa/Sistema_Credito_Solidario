
package model;


public class Doacao  {
    private int codigoDoador;

    public int getCodigoDoador() {
        return codigoDoador;
    }
    private ItemDoacao[] itens = new ItemDoacao[1000];//falta tamanho do array

    public ItemDoacao[] getItens() {
        return itens;
    }
    
    public float calculoCreditoDoacao(){
        float calc_cred;
        if Doador == PessoaFisica {
            calc_cred = this.getItens().getCalc_item() * getCodigoDoador();
            return calc_cred ;
            
//          calc_item = this.getProduto().getCreditokg() * quantidade;
//          return calc_item ;
        
        }
            calc_cred = this.getItens().getCalc_item() * this.getPessoaJuridica(codigoDoador);
        
    }
}
