package src;
import java.util.Scanner;

public class mediaif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, soma, media;//variaveis do programa 
		
		
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		n3 = sc.nextDouble();
        System.out.println("Digite a nota 4: ");
        n4 = sc.nextDouble();

		
		soma = n1+n2+n3+n4;
		media = soma/4;
		
		System.out.println("Sua média é: "+media);
        if (media>=6) {
            System.out.println("Você está aprovado");
        } else{
            System.out.println("Você está reprovado");
        }
		
		sc.close();
	}

}