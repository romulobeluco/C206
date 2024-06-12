package org.example;

import java.io.*;
import java.util.ArrayList;
public class Arquivo {

    public void escrever(Aluno aluno) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linhaEscrever;

        try {

            os = new FileOutputStream("src/main/java/org/example/Alunos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.newLine();
            bw.write("-----Alunos-----");
            bw.newLine();
            bw.write("Nome: " + aluno.getNome());
            bw.newLine();
            bw.write("Matricula: " + aluno.getMatricula());
            bw.newLine();
            bw.write("Curso: " + aluno.getCurso());
            bw.newLine();
            bw.write("Média: "+aluno.getMedia());

            bw.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo");
        }

    }
    public ArrayList<Aluno> ler() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("src/main/java/org/example/Alunos.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            String linhaLer;
            String nome = null;
            int matricula = 0;
            String curso = null;
            float media = 0;

            while ((linhaLer = br.readLine()) != null) {
                if (linhaLer.startsWith("Nome: ")) {
                    nome = linhaLer.substring(6);
                } else if (linhaLer.startsWith("Matricula: ")) {
                    matricula = Integer.parseInt(linhaLer.substring(11));
                } else if (linhaLer.startsWith("Curso: ")) {
                    curso = linhaLer.substring(7);
                } else if (linhaLer.startsWith("Média: ")) {
                    media = Float.parseFloat(linhaLer.substring(7));
                    alunos.add(new Aluno(nome, matricula, curso, media));
                }
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }

        return alunos;
    }



}
