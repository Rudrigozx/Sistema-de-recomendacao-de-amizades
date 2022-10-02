
package model;

import java.util.List;

/**
 *
 * @author VAIO
 */
public interface IRede {
    void adicionarVertice(String v);

    int getIndiceVertice(String v);

    void adicionarAresta(String v1, String v2);

    void adicionarAresta(int v1, int v2);

    void imprimirMapa();

    List<Integer> listarAdjacencias(int v);

    void imprimir();

    int getNumeroVertices();
}
