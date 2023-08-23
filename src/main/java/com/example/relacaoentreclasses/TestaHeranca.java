package com.example.relacaoentreclasses;

public class TestaHeranca {

    public static void main(String[] args) {
        Filha y = new Filha();
        y.x = 15;
        y.y();

       W.metodo();
       Z.metodo();

       Z z = new Z();
       z.metodo();

       W w = new W();
       w.metodo();

       Gato g = new Gato();
       g.corDosOlhos = "mel";
       System.out.println(g.toString());
       System.out.println(g);
       System.out.println("Estou com um " + g);


    }


}
