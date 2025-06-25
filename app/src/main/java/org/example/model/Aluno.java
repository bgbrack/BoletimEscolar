package org.example.model;

import java.util.*;

public class Aluno {
    private final List<Float> notas;
    private String nome;

    public Aluno(String nome, List<Float> notas) {
        if(Objects.isNull(notas)) {
            this.notas = new ArrayList<>();
        }
        else {
            this.notas = notas;
        }
        this.nome = nome;
    }
    public Aluno(String nome) {
        this.notas = new ArrayList<>();
        this.nome = nome;
    }

    public void addNota(Float ...notas) {
        this.notas.addAll(Arrays.asList(notas));
    }

    public List<Float> getNotas() {
        return Collections.unmodifiableList(this.notas);
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
