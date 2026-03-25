package src;

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double numeroReal=0;
        int parteInteira, arredondamento;

        double parteFrac;

        System.out.println("Informe o numero: ");
        numeroReal = sc.nextDouble();

        parteInteira = (int)numeroReal;

        parteFrac = numeroReal - parteInteira;

        arredondamento = (int)Math.rint(numeroReal);

        System.out.println("numero real: "+ numeroReal);
        System.out.println("Fracionada: "+ parteFrac);
        System.out.println("Parte Inteira: "+parteInteira);
        System.out.println("Arredondamento é: "+ arredondamento);


        sc.close();
        
    }
}
