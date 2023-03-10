public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto;

        int numero = 5;

        final double VALOR_DE_PI = 3.14;

        numero = 10;
        System.out.println(salarioMinimo);
        System.out.println(numeroCurto);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);
        
    }
}
