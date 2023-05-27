
package model;


public class ItemDoacao extends Doacao{
    private Alimento produto;
    private float quantidade;

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
        float calc_item;
        calc_item = this.getProduto().getCreditokg() * quantidade;
        return calc_item ;
    }
}
