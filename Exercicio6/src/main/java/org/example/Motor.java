package org.example;

public class Motor {

    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo()
    {
        System.out.println("O kart tem "+this.cilindradas+" cilindradas");
        System.out.println("O kart tem velocidade maxima de "+this.velocidadeMaxima+"km/h");
    }

}
