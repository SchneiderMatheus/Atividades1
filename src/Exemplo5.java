import java.util.Random;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int contador = 0;



        while(true) {
            System.out.println("Digite o numero que voce acha que é: ");
            tentativa = sc.nextInt();
            contador ++;
            if (tentativa == numeroSecreto) {
                
                System.out.println("você acertou em "+contador +" tentativas");
                break;
            } else {
                
                System.out.println("Tente outra vez!");
                if (tentativa > numeroSecreto) {
                    
                    System.out.println("Seu numero é maior");
                } else{
                    
                    System.out.println("seu numero é menor");
                }
            }
        }
        sc.close();
    }
}
