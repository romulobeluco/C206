package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Zumbi zumbi1= new Zumbi();
Zumbi zumbi2= new Zumbi();

zumbi1.nome="João";
zumbi2.nome="Pedro";

zumbi1.vida=50;
zumbi2.vida=100;

zumbi1=zumbi2;

        System.out.println(zumbi1.vida);
        System.out.println(zumbi1.nome);


    }
}