package src;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite seu peso em KG: ");
        peso = sc.nextDouble();

        System.out.println("digite sua altura em metros: ");
        altura = sc.nextDouble();

        imc = peso/Math.pow(altura, 2);

        if (imc < 16) {
            System.out.println("Seu IMC é: "+ imc + ". Magreza Grave");
        } 
        
        if (imc > 17 && imc < 25 ) {
            System.out.println("Seu IMC é: "+ imc + ". Saúdavel");
        } 

       if (imc > 30 ) {
            System.out.println("Seu IMC é: "+ imc + ". Obesidade");

            // try
            

    }
    sc.close();
}
}
