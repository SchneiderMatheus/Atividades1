import java.util.Scanner;
public class minhamentedoida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        //System.out.println("digite um numero: ");
        //int numero = sc.nextInt();
        //System.out.println("digite outro numero");
        //int numero2 = sc.nextInt();

        while ((numero >= 0 && numero <=10) && (numero2 >=0 && numero2<=10)) {
            System.out.println("digite um numero: ");
            int numero = sc.nextInt();
            System.out.println("digite outro numero");
            int numero2 = sc.nextInt();
            int soma = numero +numero2;
            System.out.println(soma);
        }
    }
}
