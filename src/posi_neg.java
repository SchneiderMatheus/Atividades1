
import java.util.Scanner;
public class posi_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;


        System.out.println("Digite um valor inteiro: ");
        valor = sc.nextInt();

        if (valor>0) {
            System.out.println("seu valor é positivo");
            
        } else if (valor<0) {
            System.out.println("seu valor é negativo");
        } else {
            System.out.println("seu valor é 0");
        }  

        sc.close();
        
    }
}
