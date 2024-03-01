package org.example;

public class Zumbi {


    int vida;
    String nome;

    double mostraVida(){

        System.out.println("A vida do zumbi é "+this.vida);
        return vida;
    }
    void transfereVida(Zumbi zumbiAlvo,double quantia)
    {
        if(quantia>vida)
        {
            System.out.println("Não tem como tranferir a vida");
        }
        else
            System.out.println("A vida do zumbi "+zumbiAlvo.nome +" é "+this.vida);

    }

}
