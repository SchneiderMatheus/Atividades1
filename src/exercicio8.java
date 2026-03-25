package src;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double racao, gato1, gato2, racaomostrar;

        System.out.println("Informe quantos quilos tem o seu saco:  xD"); //xd
        racao = sc.nextDouble()*1000;

        System.out.println("informe a quantidade de ração (em gramas) dada ao gato 1: ");
        gato1 = sc.nextDouble();

        System.out.println("informe a quantidade de ração (em gramas) dada ao gato 2: ");
        gato2 = sc.nextDouble();

        racaomostrar = (racao -((gato1+gato2)*5))/1000;
        
        if (racaomostrar > 0) {
            System.out.println("Sua ração, depois de 5 dias terá: "+ racaomostrar + " quilos");
        } else {
            System.out.println("Sua ração terá acabado =(");
        }

        sc.close();
    }
}
