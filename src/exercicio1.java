
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, soma, media;//variaveis do programa 
		
		//n1 = 6.75;
		//n2 = 7.55;
		//n3 = 5.25;
		//soma = n1+n2+n3;
		//media = soma/3;
		
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		n3 = sc.nextDouble();
		
		soma = n1+n2+n3;
		media = soma/3;
		
		System.out.println("Sua média �: "+media);
		
		sc.close();
	}

}
