package br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model;

import java.util.Scanner;

public class Filmes {
    public int id;
    public String titulo;
    public GeneroEnum genero;
    public ClassificacaoEnum classificacao;
    public int duracao;
    public double valor;

    public TipoTecnologia tipoTecnologia;

    public static Scanner scan = new Scanner(System.in);

    @Override
    public String toString() {
        return "Filmes{" + "id=" + id + ", titulo='" + titulo + '\'' + ", genero=" + genero + ", classificacao=" + classificacao + ", duracao=" + duracao + ", valor=" + valor + ", tipoTecnologia=" + tipoTecnologia + '}';
    }

    public Filmes(int id, String titulo, GeneroEnum genero, ClassificacaoEnum classificacao, int duracao, double valor, TipoTecnologia tipoTecnologia) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.valor = valor;
        this.tipoTecnologia = tipoTecnologia;
    }
}
