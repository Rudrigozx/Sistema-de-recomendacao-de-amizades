package model;

import java.util.ArrayList;

/**
 *
 * @author VAIO
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    private ArrayList interesses = new ArrayList<String>(); //<hobby, genero, formacao>;
    private String time;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String time, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList getInteresses() {
        return interesses;
    }

    public void setInteresses(ArrayList interesses) {
        this.interesses = interesses;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

