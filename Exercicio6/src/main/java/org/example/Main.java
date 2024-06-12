package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

Kart kart1= new Kart();
Kart kart2=new Kart();

Piloto piloto1=new Piloto();
Piloto piloto2 = new Piloto();


kart1.piloto=piloto1;
kart2.piloto=piloto2;

kart1.nome="Ferrari";
kart2.nome="Mercedes";

kart1.motor.cilindradas="50";
kart2.motor.cilindradas="100";

kart1.motor.velocidadeMaxima=100;
kart2.motor.velocidadeMaxima=150;

kart1.pular();
kart2.soltarTurbo();
kart1.fazerDrift();

kart1.motor.mostraInfo();
kart2.motor.mostraInfo();

piloto1.nome="Pedro";
 piloto2.nome="Ana";

 piloto1.soltaSuperPoder();

    }
}