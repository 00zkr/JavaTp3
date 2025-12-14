package ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la hauteur du triangle : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int nbEtoiles = 2 * i - 1;
            int nbEspaces = n - i;
            for (int j = 0; j < nbEspaces; j++) System.out.print(" ");
            for (int j = 0; j < nbEtoiles; j++) System.out.print("*");
            System.out.println();
        }
    }
}

