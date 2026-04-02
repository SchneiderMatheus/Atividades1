import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("digite um o numero do dia que gostaria: ");
        dia = sc.nextInt();

        switch (dia) {
            case 0 :
             System.out.println("Dia 0, Domingo");
             break;
            case 1:
                System.out.println("Dia 1, Segunda-Feira");
             break;
            case 2: 
                System.out.println("Dia 2, terça-Feira");
             break;
            case 3: 
                System.out.println("Dia 3, Quarta-Feira");
             break;
             case 4: 
                System.out.println("Dia 4, Quinta-Feira");
             break;
             case 5: 
                System.out.println("Dia 5, Sexta-Feira");
             break;
             case 6: 
                System.out.println("Dia 6, Sábado");
             break;
            default:
                 System.out.println("Dia  inválido");
             break;
        }
        sc.close();
    }
}