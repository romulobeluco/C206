package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        zumbi.vida=100;
        zumbi.nome="Hulkada";

        zumbi2.nome="Pedro";
        zumbi2.vida=150;

        zumbi.mostraVida();
        zumbi2.mostraVida();
        zumbi.transfereVida(zumbi2,50);


    }
}