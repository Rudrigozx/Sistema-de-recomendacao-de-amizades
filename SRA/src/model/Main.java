
package model;

/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author VAIO
 */
public class Main {

    public static void main(String[] args) {
       Rede rede = new Rede(2);

       Pessoa p1 = new Pessoa("rodrigo",17, "santos", "M", "musculação","romance","medio");
       Pessoa p2 = new Pessoa("lucas",34, "palmeiras", "F","pintura","romance","superior");

       rede.adicionarVertice(p1);
       rede.adicionarVertice(p2);

       rede.adicionarAresta(p1,p2);

       rede.imprimir();
        System.out.println(rede.ponderar(p1,p2));
        System.out.println(rede.gerarPontuacao(p1,p2));

    }
    
}
