import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double numero, quadrado, raizQuadrada, cubo, raizCubo;
        System.out.println("digite o numero: ");
        numero = sc.nextDouble();


        if (numero <= 0) {
            System.out.println("aí nao da paizão");
        } else {
            quadrado = Math.pow(numero,2);
            raizQuadrada = Math.sqrt(numero);
            cubo = Math.pow(numero,3);
            raizCubo = Math.cbrt(numero);

            System.out.println("numero ao quadrado: "+quadrado);
            System.out.println("numero ao cubo: "+cubo);
            System.out.println("numero na Raiz quadrada: "+raizQuadrada);
            System.out.println("numero na Raiz Cúbica: "+raizCubo);
            // System.out.printf("numero na Raiz Cúbica: %.2f",raizCubo)   printar delimitando as casas decimais

        }
        sc.close();
    }  
}
