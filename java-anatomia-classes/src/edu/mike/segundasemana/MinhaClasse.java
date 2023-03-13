package edu.mike.segundasemana;
public class MinhaClasse {

    public static void main (String [] args) {

        //System.out.print("Olá turma, sejam Bem-Vindos!");
        String primeiroNome = "Mike";
        String segundoNome = "Diniz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
         System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}