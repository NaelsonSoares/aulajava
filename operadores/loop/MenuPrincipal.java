package operadores.loop;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("----------------");
            System.out.println("Menu Principal");
            System.out.println("----------------");
            System.out.println("1 - Instituição");
            System.out.println("2 - Aluno");
            System.out.println("3 - Professor");
            System.out.println("4 - Cordenação");
            System.out.println("0 - Sair");

            System.out.println("Opção");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Instituição");
                    break;
                case 2:
                System.out.println("Aluno");
                    break;
                case 3:
                System.out.println("Professor");
                    break;
                case 4:
                System.out.println("Cordenação");
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        }while ( opcao != 0);
        
    }
    
}
