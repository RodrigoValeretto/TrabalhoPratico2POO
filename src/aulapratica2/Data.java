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
public class Data implements IElemento{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean equals(IElemento e)
    {
        if(e instanceof Data)
        {
            if(this.dia == ((Data) e).dia && this.mes == ((Data) e).mes && this.ano == ((Data) e).ano)
                return true;
        }
        
        return false;
    }
    
    public String toString()
    {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
