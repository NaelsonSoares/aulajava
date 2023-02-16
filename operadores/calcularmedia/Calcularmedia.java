package operadores.calcularmedia;

import java.util.Scanner;

public class Calcularmedia {
        public static void main(String[] args) {
            
            double nota1;
            double nota2;
            double nota3;
            double nota4;

            Scanner notas = new Scanner(System.in);

            System.out.println("Primeira nota: ");
            nota1 = notas.nextDouble();
            System.out.println("Segunda nota: ");
            nota2 = notas.nextDouble();
            System.out.println("Terceira nota: ");
            nota3 = notas.nextDouble();
            System.out.println("Quarta nota: ");
            nota4 = notas.nextDouble();
            
                double media;
    
                     media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println(media);

            
            int valor;

             Scanner teclado = new Scanner(System.in);

             System.out.println("Digite um valor: ");

             valor = teclado.nextInt( );


            System.out.println(valor / 2);
            System.out.println(valor % 2);

        }
}
