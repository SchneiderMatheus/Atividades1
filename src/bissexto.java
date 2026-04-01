
import java.util.Scanner;

public class bissexto {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		
		System.out.println("Digite o ano que deseja saber: ");
		ano = sc.nextInt();
        
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("O ano "+ano+" é bissexto");            
        }
        else{
            System.out.println("O ano "+ano+" não é bissexto");
        } 
            
		sc.close();
	}
}
