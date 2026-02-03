import java.util.Scanner;

public class Trabalho_Fisica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da força (F):");
        double forca = sc.nextDouble();

        System.out.println("Digite a distância percorrida (D):");
        double distancia = sc.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é: " + trabalho);

        sc.close();
    }
}

