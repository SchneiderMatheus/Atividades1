import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado1,lado2,lado3;
        boolean formaTriangulo=false;

        System.out.println("informe o lado 1: ");
        lado1 = sc.nextDouble();
        System.out.println("informe o lado 2: ");
        lado2 = sc.nextDouble();
        System.out.println("informe o lado 3: ");
        lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            formaTriangulo = true;
            
        } 

        if (formaTriangulo) {
            System.out.println("Forma um triangulo");
        } else {
            System.out.println("Não forma triangulo");
        }
    sc.close();    
    }
}
