package com.example.dualseriousgame;

public class Resposta {
    private String value;
    private boolean respostaCorrecte;

    public Resposta(String valor){
        this.respostaCorrecte = false;
        this.value = valor;
    }

    public Resposta(String valor, boolean boo) {
        this.respostaCorrecte = boo;
        this.value = valor;
    }

    public String getValue() {
        return value;
    }

    public boolean getRespostaCorrecte() {
        return respostaCorrecte;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setRespostaCorrecte(boolean boo){
        this.respostaCorrecte = boo;
    }
}
