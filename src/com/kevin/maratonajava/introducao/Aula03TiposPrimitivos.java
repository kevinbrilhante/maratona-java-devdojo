package com.kevin.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String name = "Kevin";
        String address = "Rua Fictícia 123";
        float salary = 2620;
        String data = "01/01/2026";

        System.out.println("Eu "+name+", morando no endereço "+address+
                " confirmo que recebi o salário de "+salary+" na data "+data);
    }
}
