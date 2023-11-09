public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Existem 4 tipos primitivos de dados em Java:
         * inteiros (int, byte, short, long); 
         * ponto flutuante (float e double); 
         * caracteres (char); 
         * lógicos (boolean).
         *  
         */

        int   numeroA = 10;
        byte  numeroB = 20;
        short numeroC = 30;
        long  numeroD = 40;

        //  O prefixo 'final' antes do tipo da variavel indica que o valor nao pode ser modificado
        final String titulo = "Variaveis e Tipos em Java";

        
        System.out.println("\n"+titulo);
        System.out.println("\nTipos inteiros");

        System.out.println("Numero A: " + numeroA);
        System.out.println("Numero B: " + numeroB);
        System.out.println("Numero C: " + numeroC);
        System.out.println("Numero D: " + numeroD);
        
        System.out.println("\nTipos inteiros: int, byte, short, long ");
        System.out.println("INT: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        System.out.println("\nTipos de ponto flutuante - float e double");

        float n1 = 7.8f;
        double n2 = 9.90;

        System.out.println("N1: "+ n1);
        System.out.println("N2: "+ n2);
        System.out.println("Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        System.out.println("\nTipos Caracter");

        char caracter = 'H';
        System.out.println("Caracter: " + caracter);

        System.out.println("\nTipo logico - boolean");
        boolean decisao = true;
        System.out.println("Decisao: " + decisao);

        System.out.println("\nOperacoes");
        int v1 = 100;
        int v2 = 250;

        int r1 = v1 + v2;
        int r2 = v2 - v1;
        int r3 = v2 * v1;
        int r4 = v2 / v1;
        int r5 = v2 % v1;

        System.out.println("Somar.....: " + v1 + " + "+ v2 + " = "+ r1);
        System.out.println("Subtrair..: " + v2 + " - "+ v1 + " = "+ r2);
        System.out.println("Multilicar: " + v2 + " * "+ v1 + " = "+ r3);
        System.out.println("Dividir...: " + v2 + " / "+ v1 + " = "+ r4);
        System.out.println("Mod.......: " + v2 + " % "+ v1 + " = "+ r5);

    }
}
