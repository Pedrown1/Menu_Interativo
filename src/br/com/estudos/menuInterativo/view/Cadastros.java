package br.com.estudos.menuInterativo.view;

import br.com.estudos.menuInterativo.controller.Informacoes;

import java.util.Scanner;

public class Cadastros {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("\n➡️ Cadastros: \n");
        Informacoes info = new Informacoes();
        exibirMenu(info);
        System.out.println();
    }

    public static void exibirMenu(Informacoes info) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------------------------");
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar um aluno");
            System.out.println("2. Atualizar um contato");
            System.out.println("3. Listar todos");
            System.out.println("4. Lista por parte do nome");
            System.out.println("5. Remover um usuário");
            System.out.println("6. Fechar / Sair do programa");
            System.out.print("\nDigite o número da opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAluno(info);
                    break;
                case 2:
                    info.atualizarContato();
                    break;
                case 3:
                    info.listarContatos();
                    break;
                case 4:
                    listarPorParteNome(info);
                    break;
                case 5:
                    info.removerContato();
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);
    }

    public static void adicionarAluno(Informacoes info) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionar Aluno:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Endereço: ");
        scanner.nextLine();
        String endereco = scanner.nextLine();
        System.out.print("RA: ");
        int ra = scanner.nextInt();

        info.adicionarAluno(nome, sexo, endereco, ra);
    }

    public static void listarPorParteNome(Informacoes info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a parte do nome que deseja pesquisar: ");
        String parteNome = scanner.nextLine();
        info.listarPorParteNome(parteNome);
    }
}
