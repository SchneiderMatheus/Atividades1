import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double salario_brut, gratificacao, imposto, salario_liq;

        System.out.println("Digite seu salário: ");
        salario_brut = sc.nextDouble();

        gratificacao = salario_brut*0.05;
        imposto = salario_brut*0.07;
        salario_liq = salario_brut + gratificacao - imposto;

        System.out.println(salario_liq);
        
        sc.close();
    }
}
