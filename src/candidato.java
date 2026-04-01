import java.util.Scanner;

public class candidato {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean flagCalculo = true;
        boolean flagLogico = true;
        int contador = 4;

        System.out.println("resolva os problemas: ");
        System.out.println("5 + 2 * 3 =");
        int resultado = sc.nextInt();

        if (resultado != 11) {
            flagCalculo = false;
            contador --; // contador -- é a mesma coisa que: contador = contador -1;

        }

    
        
        System.out.println("4 + 10 /2 * 3 =");
        resultado = sc.nextInt();

        if (resultado != 19) {
            flagCalculo = false;
            contador --;
        }

        boolean resultado2;
        System.out.println("(10 > 5) && (3 < 1 || 8 > 2) = (true/false)");
        resultado2 = sc.nextBoolean();

        if (resultado2 != true) {
            flagLogico = false;
            contador --;
        }

        System.out.println("true || false && !(true) = (true/false)");
        resultado2 = sc.nextBoolean();


        if (resultado2 != false) {
            flagLogico = false;
            contador --;
        }        

        if (flagCalculo && flagLogico == true) {   

            System.out.println("Você foi aprovado no processo, você acertou " +contador +" questões");
            
        } else {
            System.out.println("Reprovado no processo, na prova de ");
            if (!flagCalculo) {
                System.out.println("calculo");
                
            }
            if (!flagLogico) {
                System.out.println("logica");

                System.out.println("voce acertou apenas "+contador +" questões");
            }
        }
        

        sc.close();
    }
}
