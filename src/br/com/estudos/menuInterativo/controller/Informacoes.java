package br.com.IntegracaoSankhya.estudos.doal.menuInterativo.controller;

import br.com.IntegracaoSankhya.estudos.doal.menuInterativo.model.DadosAluno;
import br.com.IntegracaoSankhya.estudos.doal.menuInterativo.model.DadosPessoais;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Informacoes {
    private List<DadosPessoais> contatos;

    public Informacoes() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarAluno(String nome, char sexo, String endereco, int ra) {
        DadosAluno aluno = new DadosAluno(nome, sexo, endereco, ra);
        this.contatos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void atualizarContato() {
        Scanner scanner = new Scanner(System.in);
        listarContatos();

        System.out.print("Digite o índice do contato que deseja atualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < contatos.size()) {
            DadosPessoais contato = contatos.get(indice);
            System.out.println("Digite os novos dados para o contato:");

            System.out.print("Nome: ");
            contato.setNome(scanner.nextLine());

            System.out.print("Sexo (M/F): ");
            contato.setSexo(scanner.next().charAt(0));

            System.out.print("Endereço: ");
            scanner.nextLine();
            contato.setEndereço(scanner.nextLine());

            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Índice de contato inválido!");
        }
    }

    public void removerContato() {
        Scanner scanner = new Scanner(System.in);
        listarContatos();

        System.out.print("Digite o índice do contato que deseja remover: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Índice de contato inválido!");
        }
    }

    public void listarContatos() {
        System.out.println("\nLista de Contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(i + ": " + contatos.get(i));
        }
    }

    public void listarPorParteNome(String parteNome) {
        boolean encontrado = false;
        for (DadosPessoais contato : contatos) {
            if (contato.getNome().contains(parteNome)) {
                System.out.println(contato);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com essa parte do nome.");
        }
    }

}
