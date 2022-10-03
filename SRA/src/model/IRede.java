
package model;

import java.util.List;

/**Interface responsavel por todos os métodos que a classe: Rede, pode 
 * fazer 
 * @author VAIO
 */
public interface IRede {
    


    void adicionarVertice(Pessoa p);

    int getIndiceVertice(Pessoa p);

    void adicionarAresta(Pessoa p1, Pessoa p2);



    void imprimirMapa();

    List<Integer> listarAdjacencias(int v);

    void imprimir();
            
    int getNumeroVertices();
    
    int ponderar(Pessoa p1, Pessoa p2);
    
    int gerarPontuacao(Pessoa p1, Pessoa p2);
}
