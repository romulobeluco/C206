package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Cantina cantina = new Cantina();
cantina.nome="Cantina do Inatel";


Salgado coxinha = new Salgado();
coxinha.nome = "Coxinha";

cantina.addSalgado(coxinha);

Salgado esfirra = new Salgado();
esfirra.nome="Esfirra";

cantina.addSalgado(esfirra);

Salgado pastel = new Salgado();
 pastel.nome="Pastel";
cantina.addSalgado(pastel);

cantina.mostraInfo();


    }
}