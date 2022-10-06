
package model;

import java.util.*;
import java.lang.Math;
import java.util.Collections;

/**Classe que representa a rede de conexões, responsavél pela operações
 *de recomendação de amizade
 * @author VAIO
 */
public class Rede implements IRede{
    private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
    private int[][] matriz;
    private List<Pessoa> mapa;
    private int numeroVertices;

    public Rede(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.mapa = new ArrayList<Pessoa>(numeroVertices);
        this.matriz = new int[numeroVertices][numeroVertices];
        for(int i=0; i<numeroVertices; i++) {
            this.matriz[i][i] = 0;
        }
    }

    @Override
    public void adicionarVertice(Pessoa p) {
        this.vertices.add(new Vertice(p));
        this.mapa.add(p);
    }

    @Override
    public int getIndiceVertice(Pessoa p) {
        return this.mapa.indexOf(p);
    }





    @Override
    public void adicionarAresta(Vertice v1, Vertice v2) {

        int peso = ponderar(v1.getPessoa(),v2.getPessoa());

        Aresta a = new Aresta(peso, v1 , v2);
        int i = mapa.indexOf(v1.getPessoa());

        int j = mapa.indexOf(v2.getPessoa());

        this.arestas.add(a);
        int k = this.arestas.size();


        //adiciona aresta na lista de arestas incidentes em cada vertice
        this.vertices.get(i).addIncidentes(this.arestas.get(k-1));
        this.vertices.get(j).addIncidentes(this.arestas.get(k-1));
        this.matriz[getIndiceVertice(v1.getPessoa())][getIndiceVertice(v2.getPessoa())] =  peso;
        this.matriz[getIndiceVertice(v2.getPessoa())][getIndiceVertice(v1.getPessoa())] =  peso;
    }

    @Override
    public void imprimirMapa() {
        for(Pessoa p: this.mapa)
            System.out.println(getIndiceVertice(p) + " - " + p.getNome());
    }
    public void imprimirVertices() {
        for(Vertice v: this.getVertices())
            System.out.println(getVertices().indexOf(v)+ " - " + v.getPessoa().getNome());
    }
    @Override
    public List<Integer> listarAdjacencias(int v) {
        List<Integer> adjacentes = new ArrayList<Integer>(this.numeroVertices);
        for(int j=0; j<this.numeroVertices;j++)
            if(v!=j) {
                adjacentes.add(j);
            }
        return adjacentes;
    }
    public List<String> listarAmizades(Pessoa p) {
        List<String> amigos = new ArrayList<String>(this.numeroVertices);
        for (int i = 0; i < this.numeroVertices; i++) {
            if (matriz[mapa.indexOf(p)][i] > 0){
                amigos.add(mapa.get(i).getNome());}
        }
        return amigos;
    }



    @Override
    public void imprimir() {

        for(int i=0; i < this.numeroVertices; i++ ) {

            for(int j=0; j < this.numeroVertices; j++) {
                System.out.print(this.matriz[i][j] + "\t");

            }
            System.out.println("");
        }
        System.out.println("");
    }


    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public List<Pessoa> getMapa() {
        return mapa;
    }

    public void setMapa(List<Pessoa> mapa) {
        this.mapa = mapa;
    }

    @Override
    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    @Override
    public int ponderar(Pessoa p1, Pessoa p2) {
       int k = 50;
       double y = gerarPontuacao(p1,p2);
       double x = k * (1/y);
       return (int) Math.round(x);

    }

    @Override
    public double gerarPontuacao(Pessoa p1, Pessoa p2) {
       double pontuar = 0.0;

       int x= Math.abs(p1.getIdade() - p2.getIdade());

        if(x<10){
            pontuar=1.0;
        }
        if(x>=10 && x<=20){
            pontuar=2.0;
        }
        if(x>20){
            pontuar=3.0;
        }
       if(!Objects.equals(p1.getSexo(), p2.getSexo())) {
           pontuar += 1.0;
       }

       if(!Objects.equals(p1.getTime(), p2.getTime())) {
            pontuar += 1.0;
       }

       if(!Objects.equals(p1.getInteresses().get(0), p2.getInteresses().get(0))) {
            pontuar += 1.0;
       }

       if(!Objects.equals(p1.getInteresses().get(1), p2.getInteresses().get(1))) {
            pontuar += 1.0;
       }

       if(!Objects.equals(p1.getInteresses().get(2), p2.getInteresses().get(2))) {
            pontuar += 1.0;
       }

        return pontuar;
    }
    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public Aresta acharAresta(Vertice vet1, Vertice vet2){
        for(int i=0; i<this.arestas.size();i++){
            if( ((this.arestas.get(i).getOrigem().getPessoa().equals(vet1.getPessoa())) &&
                    (this.arestas.get(i).getDestino().getPessoa().equals(vet2.getPessoa()))) ||
                    ((this.arestas.get(i).getOrigem().getPessoa().equals(vet2.getPessoa())) &&
                            (this.arestas.get(i).getDestino().getPessoa().equals(vet1.getPessoa()))) ){
                return this.arestas.get(i);
            }
        }
        return null;
    }
    public void limparVerticesPai(){
        for(int i=0; i<this.getVertices().size() ;i++)
            this.getVertices().get(i).setPai(null);
    }
    //DIJKSTRA
    //metodo que retorna o caminho menos custoso entre dois vertices a partid do algoritmo de Dijkstra
    public ArrayList<Vertice> encontrarMenorCaminhoDijkstra(Vertice v1,Vertice v2) {


        ArrayList<Vertice> menorCaminho = new ArrayList<Vertice>();

        Vertice verticeCaminho;

        Vertice atual;

        Vertice vizinho;

        Aresta ligacao;

        ArrayList<Vertice> naoVisitados = new ArrayList<Vertice>();

        menorCaminho.add(v1);


        for (int i = 0; i < this.getVertices().size(); i++) {

            if (this.getVertices().get(i).getPessoa().getNome().equals(v1.getPessoa().getNome()))
                this.getVertices().get(i).setDistancia(0);

            naoVisitados.add(this.getVertices().get(i));
        }

        Collections.sort(naoVisitados);


        while (!naoVisitados.isEmpty()) {

            atual = naoVisitados.get(0);



            for (int i = 0; i < atual.getVizinhos().size(); i++) {

                vizinho = atual.getVizinhos().get(i);


                if (!vizinho.isVisitado()) {

                    ligacao = this.acharAresta(atual,vizinho);

                    if (vizinho.getDistancia() < (atual.getDistancia() + ligacao.getPeso())) {

                        vizinho.setDistancia(atual.getDistancia() + ligacao.getPeso());


                        vizinho.setPai(atual);

                        if (vizinho == v2) {
                            menorCaminho.clear();
                            verticeCaminho = vizinho;
                            menorCaminho.add(vizinho);
                            while (verticeCaminho.getPai() != null) {
                                menorCaminho.add(verticeCaminho.getPai());
                                verticeCaminho = verticeCaminho.getPai();

                            }

                                Collections.sort(menorCaminho);


                        }
                    }
                }

            }

            atual.setVisitado(true);
            naoVisitados.remove(atual);

            System.out.println("antes");
            for (Vertice v : naoVisitados)
                System.out.println(naoVisitados);
            Collections.sort(naoVisitados);
            System.out.println("depois");
            for (Vertice v : naoVisitados)
                System.out.println(naoVisitados);


        }
        this.limparVerticesPai();
        return menorCaminho;
    }

}
