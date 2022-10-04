
package model;

import java.util.ArrayList;

/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author VAIO
 */
public class Main {

    public static void main(String[] args) {
        Conexão conexão = new Conexão();
        conexão.conectBD();
        ArrayList<Pessoa> list = conexão.listaPessoa();

       Rede rede = new Rede(list.size());

      // Pessoa p1 = new Pessoa("rodrigo",17, "santos", "M", "musculação","romance","medio");
     //  Pessoa p2 = new Pessoa("lucas",34, "palmeiras", "F","pintura","romance","superior");

        for (int i=0;i< list.size();i++){
            rede.adicionarVertice(list.get(i));

        }





       rede.imprimir();


    }
    
}
