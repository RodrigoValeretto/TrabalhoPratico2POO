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
public class Usuario implements IElemento{
    private String nome;

    public Usuario(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        this.nome = s;
    }
    
    @Override
    public boolean equals(IElemento e) {
        if(e instanceof Usuario)
        {
            if(this.nome.compareTo(((Usuario) e).nome) == 0)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public String toString()
    {
        return this.nome;
    }
}
