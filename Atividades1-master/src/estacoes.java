package src;
import java.util.Scanner;
public class estacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("digite um o numero do mes do ano que gostaria: ");
        mes = sc.nextInt();

        switch (mes) {
            case 12, 1, 2 :
             System.out.println(mes+"º mês é Verão");
             break;
            case 3,4,5:
             System.out.println(mes+"º mês é Outono");
             break;
            case 6,7,8: 
             System.out.println(mes+"º mês é Inverno");
             break;
            case 9,10,11: 
             System.out.println(mes+"º mês é Primavera");
             break;
            default:
                 System.out.println("Mês inválido");
             break;
        }
        sc.close();
    }
}
