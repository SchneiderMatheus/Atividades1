package src;

import java.util.Scanner;

public class exercicio5 {
        public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double a,b,c, delta, x1, x2;

        System.out.println("informe o valor de a: ");
        a = sc.nextDouble();

        System.out.println("infome o valor b: ");
        b = sc.nextDouble();

        System.out.println("informe o valor de c: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2)- (4*a*c);
        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;
       // if (delta < 0) {
         //   System.out.println("Sua ração, depois de 5 dias terá: "+ racaomostrar + " quilos");
        //} else {
           // System.out.println("Sua ração terá acabado =(");
        //}
        

        System.out.println("O valor de x1 " + x1);
        System.out.println("O valor de x2 " + x2);
        System.out.println("Os valores de x1 e x2 são respectivamente: "+ x1 + ", "+ x2);



        sc.close();
        
    }
}
    