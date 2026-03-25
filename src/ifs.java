package src;
import java.util.Scanner;
public class ifs {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade=0;
        int min= 18;
        int max = 25;
        String estadoCivil;

        System.out.println("Qual a sua idade? ");
        idade= sc.nextInt();

       System.out.println("Qual o seu Estado Civil? ");
        estadoCivil = sc.next();


        if (idade>= min && idade <=max && estadoCivil.equalsIgnoreCase("solteiro"))  {
            System.out.println("Você pode prestar o concurso");
        }

        sc.close();

    }
}
