import java.util.Scanner;

public class brinquedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean podeEntrar = false;
        double altura,idade;

        System.out.println("Qual a sua altura?");
        altura = sc.nextDouble();
        System.out.println("Qual a sua idade?");
        idade = sc.nextDouble();

        if (altura >= 1.40 && idade>= 10) {
            podeEntrar = true;
        }
        if (podeEntrar) {
            System.out.println("Entrada Permitida");
        }else{
            System.out.println("Entrada negada");
        }
        sc.close();

    }
}
