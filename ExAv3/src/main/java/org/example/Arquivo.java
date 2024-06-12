package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {


    public void escrever(Produto produto) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linhaEscrever;

        try {

            os = new FileOutputStream("src/main/java/org/example/Produtos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("-----Produtos-----");
            bw.newLine();
            bw.write("Nome: " + produto.getNome());
            bw.write("Preco: " + produto.getPreco());
            bw.write("Tipo: " + produto.getTipo());

            bw.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo");
        }

    }


    public ArrayList<Produto> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        ArrayList<Produto> encontreiNoarquivo = new ArrayList<>();

        String linhaLer;

        try {
            is = new FileInputStream("src/main/java/org/example/Produto.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("-----Produtos-----")) {
                    Produto f1 = new Produto();
                    f1.setNome(br.readLine().substring(6));
                    f1.setPreco(Double.parseDouble(br.readLine().substring(7)));
                    f1.setTipo(br.readLine().substring(6));

                    encontreiNoarquivo.add(f1);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
        return encontreiNoarquivo;
    }

}
