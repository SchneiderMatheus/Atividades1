import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "123456";
        String tentativa = "";
        int contador = 0;


        do {
            contador++;
            System.out.println("Digite sua senha: ");
            tentativa = sc.next();
            if (tentativa.equals(senha)) {
                System.out.println("Login efetuado!");
                break;
            }else {
                System.out.println("Falha no login!");
            }
            if (contador==3) {

                System.out.println("Voce excedeu o número de tentativas");
                break;
                
            }

        }while(true);
    
    
    
    
    
    sc.close();
    }
}
