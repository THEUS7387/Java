import java.util.Scanner;

public class Programa_Calculo {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = sc.nextDouble();
        double soma = (n1+n2);
        double subtracao = (n1-n2);
        double divisao = (n1/n2);
        double multiplicacao = (n1*n2);
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        sc.close();
    }
}


