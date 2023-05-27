
package model;


public class ItemDoacao extends Doacao{
    private Alimento produto;
    private float quantidade;
    private float calc_item;
    
    public Alimento getProduto() {
        return produto;
    }

    public void setProduto(Alimento produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calculoItem() {
        calc_item = this.getProduto().getCreditokg() * quantidade;
        return calc_item ;
    }
    
        public float getCalc_item() {
        return calc_item;
    }
    
}
