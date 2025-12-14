package ex5;

import java.util.Scanner;

public class Main {

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = tmp;
            }
        }
    }

    public static void afficheMatrice(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n : ");
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = sc.nextInt();

        rotate90ClockwiseInPlace(A);
        afficheMatrice(A);
        sc.close();
    }
}
