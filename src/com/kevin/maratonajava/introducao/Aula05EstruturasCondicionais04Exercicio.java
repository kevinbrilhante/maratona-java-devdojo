package com.kevin.maratonajava.introducao;

// Dado uma determinada tabela de impostos, calcule o imposto a ser pago

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double salarioAnual = 60000;
        boolean condicao1 = (salarioAnual >= 0 && salarioAnual <= 34712);
        boolean condicao2 = (salarioAnual > 34712 && salarioAnual <= 68507);
        boolean condicao3 = (salarioAnual > 68508);

        if (condicao1) {
            System.out.println("Sua alíquota corresponde a: 9.70%");
        } else if (condicao2) {
            System.out.println("Sua alíquota corresponde a: 37.35%");
        } else {
            System.out.println("Sua alíquota corresponde a: 49.50%");
        }
    }
}
