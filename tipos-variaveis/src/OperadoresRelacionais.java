

public class OperadoresRelacionais {
    
    public static void main(String[] args) {

            String nomeUm = "Isabel";
            String nomeDois = "Isabel";
 

            System.out.println(nomeUm == nomeDois);


            int numero1 = 1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;

            if (numero1 < numero2){
                System.out.println("A nossa condição é verdadeira.");
            }

            System.out.println("Numero um é igual a numero dois? " + simNao);

            simNao = numero1 != numero2;

            System.out.println("Numero um é diferente do numero dois? " + simNao);

            simNao = numero1 > numero2;
            
            System.out.println("Numero um é maior que numero dois? " + simNao);
    }
}
