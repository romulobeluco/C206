package org.example;

public class Kart {

    String nome;

Piloto piloto;
Motor motor;
    public Kart() {
        motor=new Motor();
    }

    void pular()
    {
        System.out.println("Kart da "+ this.nome +" pulando");
    }
    void soltarTurbo()
    {
        System.out.println("Kart da "+this.nome+" soltando turbo");
    }
    void fazerDrift()
    {
        System.out.println("Kart da "+this.nome+" fazendo drift");
    }

}
