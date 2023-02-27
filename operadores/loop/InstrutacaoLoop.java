package operadores.loop;

public class InstrutacaoLoop {
    public static void main(String[] args) {
        
        int numero = 1;
        int numero2 = 6;
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
        do {
            System.out.println(numero2);
            numero2++;           
        } while (numero2 <= 5);
    }
}
