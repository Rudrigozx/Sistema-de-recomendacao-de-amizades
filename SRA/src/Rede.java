


import java.util.*;
import java.lang.Math;

/**Classe que representa a rede de conexões, responsavél pela operações
 *de recomendação de amizade
 * @author VAIO
 */
public class Rede implements IRede{

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
        this.mapa.add(p);
    }

    @Override
    public int getIndiceVertice(Pessoa p) {
        return this.mapa.indexOf(p);
    }

    @Override
    public void adicionarAresta(Pessoa v1, Pessoa v2) {
        this.adicionarAresta(getIndiceVertice(v1), getIndiceVertice(v2));
    }

    @Override
    public void adicionarAresta(int v1, int v2) {
       int peso = ponderar(mapa.get(v1), mapa.get(v2) );
        this.matriz[v1][v2] = peso;
        this.matriz[v2][v1] = peso ;
    }

    @Override
    public void imprimirMapa() {
        for(Pessoa p: this.mapa)
            System.out.println(getIndiceVertice(p) + " - " + p.getNome());
    }

    public List<Integer> listarAdjacencias(int v) {
        List<Integer> adjacentes = new ArrayList<Integer>(this.numeroVertices);
        for(int j=0; j<this.numeroVertices;j++)
            if(this.matriz[v][j]>0 && v!=j) {
                adjacentes.add(j);
            }
        return adjacentes;
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



    public List<String> listarAmizades(Pessoa p) {
        List<String> amigos = new ArrayList<String>(this.numeroVertices);
        for (int i = 0; i < this.numeroVertices; i++) {
            if (matriz[mapa.indexOf(p)][i] > 0){
                amigos.add(mapa.get(i).getNome());}
        }
        return amigos;
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







}
