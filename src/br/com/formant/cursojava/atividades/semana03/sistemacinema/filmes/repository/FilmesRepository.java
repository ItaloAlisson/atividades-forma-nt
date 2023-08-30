package br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.repository;

import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.ClassificacaoEnum;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.Filmes;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.GeneroEnum;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.TipoTecnologia;

import java.util.ArrayList;
import java.util.List;

public class FilmesRepository {
    public static List<Filmes> listaFilmes = new ArrayList<>();

    public static void cadastrarFilme(int id, String titulo, GeneroEnum generoEnum, ClassificacaoEnum classificacaoEnum, int duracao, double valor, TipoTecnologia tipoTecnologia) {

        Filmes novoFilme = new Filmes(id, titulo, generoEnum, classificacaoEnum, duracao, valor, tipoTecnologia);
        listaFilmes.add(novoFilme);
    }

    public static String listarFilmes() {
        String filmes = "";
        if (listaFilmes.isEmpty()) {
            filmes = null;
        } else {
            for (Filmes lista : listaFilmes) {
                filmes = "ID :" + lista.id + " FILME :" + lista.titulo +
                        " " + lista.classificacao + " " + lista.genero + " DURAÇÃO :" +
                        lista.duracao + " MINUTOS " + lista.tipoTecnologia + " CUSTO INGRESSO :" + lista.valor + "R$";
            }
        }
        return filmes;
    }

    public static boolean excluirFilme(int idExcluir) {

        for (Filmes lista : listaFilmes) {
            if (lista.id == idExcluir) {
                listaFilmes.remove(lista);
                return true;
            }
        }
        return false;
    }
}

