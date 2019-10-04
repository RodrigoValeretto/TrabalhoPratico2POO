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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //VERSÃO DO PROGRAMA COM CLASSE DATA
        Lista lista;
        // mudar o comando abaixo para lista = new ListaSequencial();
        // deverá gerar o mesmo efeito!
        lista = new ListaEncadeada();
        lista.inserir(new Data(10,10,2000));
        lista.inserir(new Data(15,3,2150));
        lista.inserir(new Data(17,8,600));
        lista.inserir(new Data(9,12,150));
        lista.inserir(new Data(8,8,8));
        lista.inserir(new Data(5,9,1000));
        lista.imprimir();
        lista.remover(new Data(9,12,150));
        lista.imprimir();
        
        
        //VERSÃO DO PROGRAMA COM CLASSE USUÁRIO
        Lista lista2;
        // mudar o comando abaixo para lista = new ListaSequencial();
        // deverá gerar o mesmo efeito!
        lista2 = new ListaEncadeada();
        lista2.inserir(new Usuario("Marcelo"));
        lista2.inserir(new Usuario("Joao"));
        lista2.inserir(new Usuario("Pedro"));
        lista2.inserir(new Usuario("Gustavo"));
        lista2.inserir(new Usuario("Larissa"));
        lista2.inserir(new Usuario("Flavia"));
        lista2.imprimir();
        lista2.remover(new Usuario("Gustavo"));
        lista2.imprimir();
    }
    
}
