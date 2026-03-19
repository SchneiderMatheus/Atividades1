import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
       
        double degrau, altura, numDegraus;

        System.out.println("Digite a altura do seu degrau em metros: ");
        degrau = sc.nextDouble();

        System.out.println("Informe quantos metros terá vossa escada: ");
        altura = sc.nextDouble();

        numDegraus = altura/degrau;

        System.out.println("A quantidade de degraus que voce precisará fazer para atingir seu incrível objetivo é: "+ numDegraus);

        sc.close();
    }
}
