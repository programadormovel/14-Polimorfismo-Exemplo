/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public abstract class ImpressoraProduto {
    
    protected Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public abstract void imprimeProduto();

    protected boolean valida() {
        if (produto != null && produto.getDescricao() != null) {
            return true;
        } else {
            System.out.println("Nenhuma pessoa configurada");
            return false;
        }
    }
}
