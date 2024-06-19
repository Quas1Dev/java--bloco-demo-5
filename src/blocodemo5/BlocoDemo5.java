package blocodemo5;

public class BlocoDemo5 {

    public static void main(String[] args) {
        // Instruções do bloco do método main.
        {
            // Bloco autônomo.
            System.out.println("O valor de n1 é " + n1); // Não Compila.
        }
        
        int n1 = 2;
    }
    
}
