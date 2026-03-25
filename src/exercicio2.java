import java.util.Scanner;
import java.lang.Math;
public class exercicio2 {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        double raio, perimetro, area;
         System.out.println("Informe o raio: ");
         raio = sc.nextDouble();

         area = Math.PI * Math.pow(raio,2);

         perimetro = 2 * Math.PI * raio;

         System.out.println("Esse é o valor da area: " + area);

         System.out.println("Esse é seu perimetro: " + perimetro);

         sc.close();


    }
}
