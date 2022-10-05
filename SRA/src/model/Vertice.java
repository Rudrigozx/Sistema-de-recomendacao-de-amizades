package model;

import java.util.ArrayList;

public class Vertice implements Comparable<Vertice> {
    private Pessoa pessoa;
    private int distancia = 0;
    private Vertice pai;
    private ArrayList<Aresta> incidentes = new ArrayList<Aresta>();
    private ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();
    private boolean visitado = false;




    public Vertice(Pessoa p){
        this.setPessoa(p);
    }



    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ArrayList<Aresta> getIncidentes() {
        return incidentes;
    }

    public void addIncidentes(Aresta incide) {
        this.incidentes.add(incide);

        //adicionando vizinhos a lista
        if ( (incide.getOrigem().getPessoa().equals(this.getPessoa())) &&
                (!this.isVizinho(incide.getDestino())) ){

            this.addVizinhos(incide.getDestino());

        }else if ( (incide.getDestino().getPessoa().equals(this.getPessoa())) &&
                (!this.isVizinho(incide.getOrigem())) ){

            this.addVizinhos(incide.getOrigem());
        }
    }

    public void addVizinhos(Vertice vizinho) {
        this.vizinhos.add(vizinho);
    }

    public ArrayList<Vertice> getVizinhos() {
        return vizinhos;
    }

    public boolean isVizinho(Vertice vizinho){
        int i;

        for (i=0; i<this.vizinhos.size() ; i++)
            if (this.vizinhos.get(i).getPessoa().equals(vizinho.getPessoa()))
                return true;

        return false;
    }


    @Override
    public int compareTo(Vertice vertice) {

        if(this.getDistancia() < vertice.getDistancia())
            return -1;
        else if(this.getDistancia() == vertice.getDistancia())
            return 0;

        return 1;
    }

    @Override
    public String toString() {
        String s = " ";
        s+= this.getPessoa();
        return s;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}