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
public class No {
    private IElemento elemento;
    private No next;

    public No()
    {
        this.elemento = null;
        this.next = null;
    }
    
    public No(IElemento elemento, No next)
    {
        this.elemento = elemento;
        this.next = next;
    }
    
    public IElemento getElemento() {
        return elemento;
    }

    public void setElemento(IElemento elemento) {
        this.elemento = elemento;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
