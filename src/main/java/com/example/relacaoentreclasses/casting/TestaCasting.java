package com.example.relacaoentreclasses.casting;

public class TestaCasting {
    public static void main(String[] args) {

        Object[] objetos = new Object[100];
        String s = "certificacao";
        objetos[0] = s;

        String recuperada = (String) objetos[0];

        System.out.println(recuperada);

        Veiculo v = new Carro();
        Moto m = (Moto) v;

    }

}
