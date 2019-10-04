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
public class ListaEncadeada extends Lista {
    private No topo;
    
    public ListaEncadeada()
    {
        this.tamanho = 0;
        this.topo = null;
    }
    
    @Override
    public void inserir(IElemento elem)
    {
        if(this.topo == null)
        {
            this.topo = new No(elem, null);
            this.tamanho++;
            return;
        }
        
        No aux = this.topo;
        
        while(aux.getNext() != null)
            aux = aux.getNext();
        
        No novo = new No(elem, null);
        aux.setNext(novo);
        
        this.tamanho++;
    }
    
    @Override
    public void remover(IElemento elem) throws NullPointerException
    {
        if(this.topo == null)
            throw new NullPointerException("Lista vazia");
        
        if(this.topo.getNext() == null)
        {
            this.topo = null;
            this.tamanho--;
            return;
        }
        
        No aux = this.topo;
        while(!aux.getNext().getElemento().equals(elem) && aux.getNext() != null)
            aux = aux.getNext();
        
        if(aux.getNext() == null)
            throw new NullPointerException("\nElemento não encontrado na lista!\n");
        
        aux.setNext(aux.getNext().getNext());
        
        this.tamanho--;
    }

    @Override
    public void imprimir() {
        No aux = this.topo;
        while(aux != null)
        {
            System.out.print(aux.getElemento() + " ");
            aux = aux.getNext();
        }
        System.out.println("");
    }
}
