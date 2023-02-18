package operadores.incremento;

public class Increment {
    public static void main(String[] args) {

        int num1, num2;

        num1 = 6;
        num2 = 6;

        System.out.println(num1+(" sem alteração")); 
        System.out.println(num2+(" sem alteração"));

        //System.out.println(num1++); //instrução antes do incrmento não recebe o incremento
        //System.out.println(++num2); //instrução depois do incrmento  recebe o incremento

        // Operadors de aritmético, atribuição e Relacionais.
        System.out.println((num1 < num2) +(" menor que")); 
        System.out.println((num2 > num1) +(" maior que"));
        System.out.println((num1 <= num2) +(" menor ou igual")); 
        System.out.println((num2 >= num1) +(" maior ou igual"));
        System.out.println((num1 == num2) +(" é igual")); 
        System.out.println((num2 != num1) +(" é diferente"));

        //num1 += 6;
        //num2 -= 6;

        //System.out.println(num1+(" Atribuição Aditiva")); 
       // System.out.println(num2+(" Atribuição Sbtrativa"));
        
        // num1 *= 6;
        // num2 /= 6;

        // System.out.println(num1+(" Atribuição de Multiplicação ")); 
        // System.out.println(num2+(" Atribuição de Divisão"));

        //  num1 %= 6;
        //  num2 = 6;

        //  System.out.println(num1+(" Atribuição de Módulo ou Resto da Divisão")); 
        //  System.out.println(num2+(" sem alteração"));
    }
}
