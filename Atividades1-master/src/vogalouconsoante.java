package src;
import java.util.Scanner;
public class vogalouconsoante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char letra= 'A';
        System.out.println("Digite a letra desejada: ");
        letra = sc.next().charAt(0);  // para efetuar a leitura de um char (letra)

       // if ((letra >=65 && letra<=90) || (letra>=97 && letra<=122)){
       //     System.out.println("Letra");
       // } else{
       //     System.out.println("caractere especial");
       // }

        switch (letra) {
            case 'A','a', 'E','e','I','i', 'O', 'o', 'U', 'u':
                System.out.println("É uma Vogal");
                break;
            case '0','1','2','3','4','5','6','7','8','9':    
                System.out.println("É um número");
        
            default:
                System.out.println("É uma consoante");
                break;
        }
        sc.close();
    }
    
}
