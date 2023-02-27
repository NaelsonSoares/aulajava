package operadores.decisao;

import java.util.Scanner;

public class Decidir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

         System.out.println("Primeira nota: ");
            nota1 = input.nextDouble();
        System.out.println("Segunda nota: ");
            nota2 = input.nextDouble();
        System.out.println("Terceira nota: ");
            nota3 = input.nextDouble();
        System.out.println("Quarta nota: ");
            nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
        System.out.println(("media = ") + media);
        System.out.println("Aprovado");
        } else
            if (media >= 5) {
            System.out.println(("media = ") + media);
            System.out.println("Prova final");
        } else {
            System.out.println(("media = ") + media);
            System.out.println("Reprovado");

        }
    }
}
