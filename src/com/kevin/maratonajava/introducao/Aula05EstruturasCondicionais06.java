package com.kevin.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Fim de semana");
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Dia útil");
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Dia útil");
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Dia útil");
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Dia útil");
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Dia útil");
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Fim de semana");
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
