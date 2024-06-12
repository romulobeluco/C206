package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        boolean flag = true;
        ArrayList<Aluno> alunos;

        String nome;
        int matricula=0;
        String curso=null;
        float media;

        while (flag) {

            System.out.println("Digite 1 se quer cadastrar aluno");
            System.out.println("Digite 2 se quer mostrar as informacoes dos alunos");
            System.out.println("Digite 3 se quer ordernar os alunos em ordem crescente em relacao a media");
            System.out.println("Digite 4 se quer a quantidade de alunos de cada curso");
            System.out.println("Digite 5 caso queira sair do programa");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o nome do Aluno: ");
                nome = sc.nextLine();
                boolean cursobool = true;
                boolean matriculabool = true;


                while (matriculabool) {
                    System.out.println("Digite a matricula do aluno: ");
                    matricula = sc.nextInt();
                    sc.nextLine();
                    if (matricula > 0) {
                        matriculabool = false;
                    } else {
                        throw new InfoInvalidaException("Valor negativo nao pode");
                    }

                }

                while (cursobool) {

                    System.out.println("Digite o curso do aluno: ");
                    curso = sc.nextLine();
                    if (curso.equals("Computação") || curso.equals("Software") || curso.equals("Telecomunicações")) {
                        cursobool = false;



                    } else {
                        throw new InfoInvalidaException("Não existe esse curso");
                    }

                }
                System.out.println("Digite a media: ");
                media=sc.nextFloat();
                Aluno aluno = new Aluno(nome,matricula,curso,media);
                arquivo.escrever(aluno);

            }
            if (op == 2) {
                alunos = arquivo.ler();

                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Matricula: " + alunos.get(i).getMatricula());
                    System.out.println("Curso: " + alunos.get(i).getCurso());
                    System.out.println("Media: "+alunos.get(i).getMedia());
                    System.out.println("---------------");

                }

            }
            if (op == 3) {
                alunos = arquivo.ler();
                Collections.sort(alunos);


                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Matricula: " + alunos.get(i).getMatricula());
                    System.out.println("Curso: " + alunos.get(i).getCurso());
                    System.out.println("Media: "+alunos.get(i).getMedia());
                    System.out.println("------------------------------------");
                }


            }
            if (op == 4) {
                int cont1, cont2, cont3;
                cont1 = 0;
                cont2 = 0;
                cont3 = 0;

                alunos = arquivo.ler();
                for (int i = 0; i < alunos.size(); i++) {
                    if (alunos.get(i).getCurso().equals("Computação")) {
                        cont1++;
                    } else if (alunos.get(i).getCurso().equals("Software")) {
                        cont2++;
                    } else if (alunos.get(i).getCurso().equals("Telecomunicações")) {
                        cont3++;
                    }
                }

                System.out.println(cont1 + " alunos de Computação");
                System.out.println(cont2 + " alunos de Software");
                System.out.println(cont3 + " alunos de Telecomunicações");
            }
            if (op == 5) {
                System.out.println("Saindo do programa....");
                flag = false;
            }
        }


    }


}