package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        boolean flag = true;
        ArrayList<Produto> produtos;

        String nome;
        double preco = 0;
        String tipo;

        while (flag) {

            System.out.println("Digite 1 se quer cadastrar produtos");
            System.out.println("Digite 2 se quer mostrar as informacoes dos produtos");
            System.out.println("Digite 3 se quer ordernar os produtos em ordem decrescente em relacao ao preco");
            System.out.println("Digite 4 se quer a quantidade de produtos de um determinado tipo");
            System.out.println("Digite 5 caso queira sair do programa");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o nome do Produto: ");
                nome = sc.nextLine();
                boolean tipobool = true;
                boolean precobool = true;


                while (precobool) {
                    System.out.println("Digite o preco do produto: ");
                    preco = sc.nextDouble();
                    sc.nextLine();
                    if (preco > 0) {
                        precobool = false;
                    } else {
                        throw new InfoInvalidaException("Valor negativo nao pode");
                    }

                }

                while (tipobool) {

                    System.out.println("Digite o tipo do produto: ");
                    tipo = sc.nextLine();
                    if (tipo.equals("Comida") || tipo.equals("Higiene") || tipo.equals("Decoração")) {
                        tipobool = false;
                        Produto produto = new Produto(nome, preco, tipo);
                        arquivo.escrever(produto);

                    } else {
                        throw new InfoInvalidaException("Não existe esse tipo de produto");
                    }

                }


            }
            if (op == 2) {
                produtos = arquivo.ler();

                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println("Nome: " + produtos.get(i).getNome());
                    System.out.println("Preco: " + produtos.get(i).getPreco());
                    System.out.println("Tipo: " + produtos.get(i).getTipo());
                    System.out.println("---------------");

                }

            }
            if (op == 3) {
                produtos = arquivo.ler();
                Collections.sort(produtos);


                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println("Nome: " + produtos.get(i).getNome());
                    System.out.println("Tipo: " + produtos.get(i).getTipo());
                    System.out.println("Preco: " + produtos.get(i).getPreco());
                    System.out.println("------------------------------------");
                }


            }
            if (op == 4) {
                int cont1, cont2, cont3;
                cont1 = 0;
                cont2 = 0;
                cont3 = 0;

                produtos = arquivo.ler();
                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).getTipo().equals("Comida")) {
                        cont1++;
                    } else if (produtos.get(i).getTipo().equals("Higiene")) {
                        cont2++;
                    } else if (produtos.get(i).getTipo().equals("Decoração")) {
                        cont3++;
                    }
                }

                System.out.println(cont1 + " produtos de Comida");
                System.out.println(cont2 + " produtos de Higiene");
                System.out.println(cont3 + " produtos de Decoração");
            }
            if (op == 5) {
                System.out.println("Saindo do programa....");
                flag = false;
            }
        }


    }


}
