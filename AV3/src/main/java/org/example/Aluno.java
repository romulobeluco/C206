package org.example;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int matricula;
    private String curso;
    private float media;

    public Aluno(String nome, int matricula, String curso, float media) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }
    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        if (this.media < o.media) {
            return -1;
        } else if (this.media > o.media) {
            return 1;
        } else {
            return 0;
        }
    }
}
