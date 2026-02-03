import java.util.Scanner;

public class Media_Aritmetica_de_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();

        System.out.println("Digite outro numero");
        double n2 = sc.nextDouble();

        System.out.println("Digite outro numero");
        double n3 = sc.nextDouble();
        
        double media = (n1+n2+n3)/3;
        System.out.println("Media é: "+media);
        sc.close();
    }
}
