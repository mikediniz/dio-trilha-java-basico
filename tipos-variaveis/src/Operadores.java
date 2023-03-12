import java.util.concurrent.RunnableScheduledFuture;

import javax.print.attribute.standard.NumberUp;
import javax.swing.JSpinner.NumberEditor;

public class Operadores {
    public static void main(String[] args) {
              
        //Exeplo 1
        /* 
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);*/

        //Exemplo 2
        /* 
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);*/

        //Exemplo 3
        /* 
        int numero = 5;

        //x repeticao
        //numero = numero +1;

        System.out.println(numero);
        System.out.println(numero ++);        
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(numero --);
        System.out.println(-- numero);*/

        //Exemplo 4
        /* 
        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);*/

        //Exemplo 5
        /*  
        int a, b;

        a = 6;
        b = 6;*/

        /* 
        String resultado = "";
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Flaso";

        System.out.println(resultado);*/

        //String resultado = a==b ? "verdadeiro" : "false";
        /* 
        int resultado = a==b ? 1 : 0;

        System.out.println(resultado);*/

        //Exemplo 6
        /* 
        String nomeUm = "Mike";
        String nomeDois = new String("Mike");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));//Quando estivermos usando objetos ou textos agente costuma usar o metodo equals (compara conteudos)

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {//só será imprimido se a condição for verdadeira
            System.out.println("A condição é verdadeira");
        }


        System.out.println("numUm é igual a numDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numUm é diferente de numDois " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numUm é maior que o numDois " + simNao);*/

        //Exemplo 7
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        if(condicao1 && (7 > 4)) {
            System.out.println("As duas são verdadeiras");
        }
        System.out.println("Fim");


    }
}
