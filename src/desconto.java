import java.util.Scanner;
public class desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorCompra = 0;
        boolean clienteVIP = true;
        double valorFinal= 0;
        double valorDesconto = 0;
        int percentual = 0;


        System.out.println("Informe o valor da sua compra:");
        valorCompra = sc.nextDouble();

        System.out.println("Você é cliente VIP? Digite true para sim e false para não");
        clienteVIP = sc.nextBoolean();


        if (clienteVIP == true && valorCompra>=200) {
            valorFinal = valorCompra - valorCompra*0.10;
            valorDesconto = valorCompra*0.10;
            percentual = 10;

        } else if (clienteVIP == true || valorCompra>= 200) {
            valorFinal = valorCompra - valorCompra*0.05;
            valorDesconto = valorCompra*0.05;
            percentual = 05;

            
        }else if (!clienteVIP && valorCompra<200) {
            valorFinal = valorCompra;
            valorDesconto = 0;
            percentual = 0;
        }
        System.out.println("Valor da Compra: R$ "+ valorCompra);
        System.out.println("Percentual de desconto aplicado: " +percentual +"%");
        System.out.println("Valor do Desconto: R$ "+valorDesconto);
        System.out.println("Valor final da compra: R$ "+valorFinal);

        sc.close();
    }
}
