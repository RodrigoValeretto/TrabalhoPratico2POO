/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica2;

/**
 *
 * @author rodrigo
 */
public abstract class Lista implements Imprimivel{
    protected int tamanho;
    
    public int tamanho()
    {
        return this.tamanho;
    }
    
    public void inserir(IElemento elem)
    {
        tamanho++;
    }
    
    public void remover(IElemento elem)
    {
        tamanho--;
    }
}
