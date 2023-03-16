import java.lang.invoke.StringConcatFactory;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        /*
        //Executar no Terminal
        
        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");Juliana fami
        System.out.println("Minha altura é " + altura + "cm ");
        */

        //Criando objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobre nome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usoario
        System.out.println("Olá, me chamo " + nome + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
    }
} 