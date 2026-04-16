import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somatorio = 0;
        double nota;
        double media;
        int contador = 0;

        while(true){
            System.out.println("digite uma nota:");
            nota = sc.nextDouble();

            if (nota>=0) {
                somatorio += nota; //mesma coisa que somatorio = somatorio + nota;
                contador++;
            }else {
                media = somatorio / contador;
                System.out.println("No de notas digitas: "+contador);
                System.out.println("Media das notas: "+media);
                
                break;
            }
        }
        
    sc.close();
    }
}
