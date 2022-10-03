
package model;

/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author VAIO
 */
public class Main {

    public static void main(String[] args) {
       Rede rede = new Rede(2);

       Pessoa p1 = new Pessoa("rodrigo",18, "santos", "M");
       Pessoa p2 = new Pessoa("lucas",18, "santos", "M");

       rede.adicionarVertice(p1);
       rede.adicionarVertice(p2);

       rede.adicionarAresta(p1,p2);

       rede.imprimir();
    }
    
}
