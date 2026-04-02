package src;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao;

        double valorA = 30;
        double valorB = 0;

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("S -sair");
        System.out.println("digite a opção desejada: ");

        opcao = sc.next().charAt(0);

        switch (opcao) {
            case '1':
                double soma = valorA + valorB;
                System.out.println("Soma: " + soma);
                break;
            case '2':
                double subtracao = valorA - valorB;
                System.out.println("Subtração: " + subtracao);
                break;
            case '3':
                double multiplica = valorA * valorB;
                System.out.println("Multiplicação: " + multiplica);
                break;
            case '4':
                if (valorB != 0) {
                    double divisao = valorA / valorB;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Não é permitido divisão por 0");
                }
                break;
            case 'S':
                System.out.println("Saindo do programa");
                break;
            default:
                System.out.println("Valor Inválido");
        }
        sc.close();
    }

}
