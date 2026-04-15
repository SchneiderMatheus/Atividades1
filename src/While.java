import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota=0;


        while (true) {
            System.out.println("Digite a nota");
            nota = sc.nextDouble();

            if (nota>=0 && nota <=10) {
                break;
            } else
                System.out.println("Nota invalída!");
        }

        sc.close();
    }
}
