package src;
import java.util.Scanner;

public class mediacomplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, soma, media;//variaveis do programa 
		
		
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
        if (n1<0 || n1>10) 
            System.exit(0);
        
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
        if (n2<0 || n2>10) 
            System.exit(0);
		System.out.println("Digite a nota 3: ");
		n3 = sc.nextDouble();
        if (n3<0 || n3>10) 
            System.exit(0);
        System.out.println("Digite a nota 4: ");
        n4 = sc.nextDouble();
        if (n4<0 || n4>10) 
            System.exit(0);

		
		soma = n1+n2+n3+n4;
		media = soma/4;
		
		System.out.println("Sua média é: "+media);
        if (media==10) {
            System.out.println("Você está aprovado com louvor");
        } else if( media >=8) { 
            System.out.println("Você está aprovado com mérito");
        } else if( media >=6) { 
            System.out.println("Você está aprovado com destaque");
        } else  { 
            System.out.println("Você está reprovado");
        }
		sc.close();
	}

}