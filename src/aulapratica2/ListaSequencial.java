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
public class ListaSequencial extends Lista{
    private IElemento[] data;
    
    public ListaSequencial(int tam)
    {
        this.data = new IElemento[tam];
        
        for(int i = 0; i < tam; i++)
        {
            this.data[i] = null;
        }
    }
    
    @Override
    public void inserir(IElemento elem) throws ArrayIndexOutOfBoundsException
    {
        if(this.tamanho < data.length)
        {
            this.data[this.tamanho] = elem;
            this.tamanho++;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Tamanho maior que o suportado");
        }
    }
    
    @Override
    public void remover(IElemento elem) throws NullPointerException
    {
        if(this.tamanho == 0)
        {
            throw new NullPointerException("\nLista vazia!\n");
        }
        
        int i = 0;
        while(!this.data[i].equals(elem) && i < this.tamanho)
        {
            i++;
        }
        
        if(this.data[i].equals(elem))
        {
            while(i < this.tamanho-1)
            {
                this.data[i] = this.data[i+1];
                i++;
            }
        }
        
        this.tamanho--;
    }

    @Override
    public void imprimir() {
        for(int i = 0; i < this.tamanho; i++)
            System.out.print(this.data[i] + " ");
        
        System.out.println("");
    }
}
