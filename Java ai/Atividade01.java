import java.util.Scanner;

public class Atividade01 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = sc.nextDouble();
        double media = (n1+n2)/2;
        System.out.println(media);
        sc.close();
    }
}
