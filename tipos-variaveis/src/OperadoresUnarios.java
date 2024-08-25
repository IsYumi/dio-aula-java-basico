public class OperadoresUnarios {
    
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        //System.out.println(- numero); // - numero faz print -5

        System.out.println(numero);

        numero = numero * -1; // para tornar o valor positivo

        System.out.println(numero);


        // x repetição

        int numero2 = 9;
        numero2 = numero2 + 2; // Ele soma +2 para o numero2 que é 9. Retornando 11
        // para fazer numero2 = numero2 + 1; vc pode deixar numero ++; que é a mesma coisa

        System.out.println(numero2);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);
    }
}
