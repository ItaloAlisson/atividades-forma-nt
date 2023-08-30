package br.com.formant.cursojava.atividades.semana03.sistemacinema;

import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.ClassificacaoEnum;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.GeneroEnum;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model.TipoTecnologia;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model.TipoUsuario;

import java.util.Scanner;

import static br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.repository.FilmesRepository.*;
import static br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model.Usuario.criptografarSenha;
import static br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.repository.UsuarioRepository.cadastrarUsuario;
import static br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.repository.UsuarioRepository.loginUsuario;


public class MenuInicial {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menuInicial();
    }


    public static void menuInicial() {
        System.out.println("BEM VINDO");
        System.out.println("DIGITE 1 PARA FAZER LOGIN");
        System.out.println("DIGITE 2 PARA SE CADASTRAR");
        int escolha = scan.nextInt();
        if (escolha == 1) {
            System.out.println("DIGITE SEU NOME DE USUÁRIO ");
            String nomeUsuario = scan.next();
            System.out.println("DIGITE SUA SENHA");
            String senhaUsuario = scan.next();
            senhaUsuario = criptografarSenha(senhaUsuario);
            if (loginUsuario(nomeUsuario, senhaUsuario)) {
                System.out.println();
            } else {
                System.out.println("LOGIN INVÁLIDO");
                menuInicial();
            }
        } else if (escolha == 2) {
            System.out.println("DIGITE SEU NOME : ");
            String nome = scan.next();

            System.out.println("SE FOR FUNCIONÁRIO DIGITE 1");
            System.out.println("SE FOR CLIENTE DIGITE 2 :");

            String tipo = scan.next();
            TipoUsuario tipoUsuario = TipoUsuario.tipoUsuarioPorNumero(tipo);

            System.out.println("DIGITE SUA IDADE : ");
            int idade = scan.nextInt();

            System.out.println("DIGITE UM NOME DE USUÁRIO :");
            String username = scan.next();

            System.out.println("DIGITE UMA SENHA DE SOMENTE LETRAS : ");
            String senha = scan.next();
            String senhaCriptografada = criptografarSenha(senha);

            cadastrarUsuario(nome, tipoUsuario, idade, username, senhaCriptografada);
            System.out.println("USUÁRIO CADASTRADO COM SUCESSO");

            if (tipoUsuario.equals(TipoUsuario.FUNCIONARIO)) {
                menuFuncionario();
            } else if (tipoUsuario.equals(TipoUsuario.CLIENTE)) {
                menuCliente();
            } else {
                System.out.println("TIPO INVÁLIDO");
            }

        } else {
            System.out.println("NÚMERO INVÁLIDO");
        }
    }

    public static void menuFuncionario() {
        System.out.println();
        System.out.println("MENU FUNCIONÁRIO");
        System.out.println("DIGITE 1 PARA CADASTRAR NOVOS FILMES");
        System.out.println("DIGITE 2 PARA EXCLUIR FILMES ");
        System.out.println("DIGITE 3 PARA LISTAR OS FILMES ");
        System.out.println("DIGITE 4 PARA FAZER LOGOUT ");
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:


                System.out.println("DIGITE O ID DO FILME: ");
                int id = scan.nextInt();

                System.out.println("DIGITE O TÍTULO DO FILME: ");
                String titulo = scan.next();

                System.out.println("ESCOLHA O GENERO DO FILME: ");
                System.out.println("DIGITE 1 PARA ROMANCE");
                System.out.println("DIGITE 2 PARA AVENTURA");
                System.out.println("DIGITE 3 PARA COMÉDIA");
                System.out.println("DIGITE 4 PARA SUSPENSE");
                String genero = scan.next();
                GeneroEnum generoEnum = GeneroEnum.GeneroPorNumero(genero);

                System.out.println("ESCOLHA A CLASSIFICAÇÃO INDICATIVA DO FILME: ");
                System.out.println("DIGITE 0 PARA lIVRE");
                System.out.println("DIGITE 10 PARA ESTA CLASSIFICAÇÃO");
                System.out.println("DIGITE 12 PARA ESTA CLASSIFICAÇÃO");
                System.out.println("DIGITE 16 PARA ESTA CLASSIFICAÇÃO");
                System.out.println("DIGITE 18 PARA ESTA CLASSIFICAÇÃO");
                int classificacao = scan.nextInt();
                ClassificacaoEnum classificacaoEnum = ClassificacaoEnum.ClassificacaoPorNumero(classificacao);

                System.out.println("DIGITE A DURAÇÃO EM MINUTOS DO FILME: ");
                int duracao = scan.nextInt();

                System.out.println("DIGITE O VALOR DO INGRESSO: ");
                double valor = scan.nextDouble();

                System.out.println("ESCOLHA A TECNOLOGIA DO FILME: ");
                System.out.println("DIGITE 1 PARA 2D ");
                System.out.println("DIGITE 2 PARA 3D");
                int tecnologia = scan.nextInt();
                TipoTecnologia tipoTecnologia = TipoTecnologia.tipoPorNumero(tecnologia);

                cadastrarFilme(id, titulo, generoEnum, classificacaoEnum, duracao, valor, tipoTecnologia);
                System.out.println("FILME CADASTRADO COM SUCESSO");

                menuFuncionario();
                break;
            case 2:
                if (listarFilmes() == null) {
                    System.out.println("NENHUM FILME DISPONÍVEL");
                    menuFuncionario();
                } else {
                    System.out.println("FILMES DISPONÍVEIS : ");
                    System.out.println(listarFilmes());
                    System.out.println("DIGITE O ID DO FILME QUE QUER DELETAR : ");
                    int idExcluir = scan.nextInt();
                    if (!excluirFilme(idExcluir)) {
                        System.out.println("ID INVÁLIDO OU INGRESSOS JÁ COMPRADOS");
                        menuFuncionario();
                    } else {
                        excluirFilme(idExcluir);
                        System.out.println("FILME REMOVIDO COM SUCESSO");
                        menuFuncionario();
                    }
                }
                break;
            case 3:
                if (listarFilmes() == null) {
                    System.out.println("NENHUM FILME DISPONÍVEL");
                    menuFuncionario();
                } else {
                    System.out.println("FILMES DISPONÍVEIS");
                    System.out.println(listarFilmes());
                    menuFuncionario();
                }
                break;
            case 4:
                menuInicial();
                break;
            default:
                System.out.println("NÚMERO INVÁLIDO");
                menuFuncionario();
        }
    }

    public static void menuCliente() {
        System.out.println();
        System.out.println("MENU CLIENTE");
        System.out.println("DIGITE 1 PARA LISTAR OS FILMES EM CARTAZ ");
        System.out.println("DIGITE 2 PARA FAZER LOGOUT ");
        int escolha = scan.nextInt();

        switch (escolha) {

            case 1:
                System.out.println(listarFilmes());
                menuCliente();
                break;
            case 2:
                menuInicial();
                break;

            default:
                System.out.println("NÚMERO INVÁLIDO");
                menuCliente();
        }

    }
}

