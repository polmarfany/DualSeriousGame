package com.example.dualseriousgame;

public class Preguntador {
    public class pregunta {
        boolean correct;
        String valor;

        public pregunta(String valor){
            this.correct = false;
            this.valor = valor;
        }

        public pregunta(String valor, boolean boo) {
            this.correct = boo;
            this.valor = valor;
        }

        public boolean getCorrect(){
            return this.correct;
        }

        public String getValor(){
            return this.valor;
        }
    }

    public boolean mesclador(){

        boolean encert = false;

        return encert;
    }
}
