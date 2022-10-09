


import java.util.List;

/**Interface responsavel por todos os métodos que a classe: Rede, pode 
 * fazer 
 * @author VAIO
 */
public interface IRede {
    


    void adicionarVertice(Pessoa p);

    int getIndiceVertice(Pessoa p);

    public List<String> listarAmizades(Pessoa p);
    void adicionarAresta(Pessoa v1, Pessoa v2);

    void adicionarAresta(int v1, int v2);

    void imprimirMapa();

    List<Integer> listarAdjacencias(int v);

    void imprimir();
            
    int getNumeroVertices();
    
    int ponderar(Pessoa p1, Pessoa p2);
    
    double gerarPontuacao(Pessoa p1, Pessoa p2);
}
