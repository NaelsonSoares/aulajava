package operadores.decisao;

public class Caseswitch {
    public static void main(String[] args) {
        int numero = 2;
        switch (numero) {
            case 1:
                System.out.println("o numéro é: 1");
                break;
            case 2:
                System.out.println("o numéro é: 2");
                break;
            default: 
            System.out.println("o numéro é: inválido");
        }
    }
}
