package ex4;

public class Main {

    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int longueur = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != longueur) return false;
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] result = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double s = 0;
            for (int j = 0; j < t[i].length; j++) {
                s += t[i][j];
            }
            result[i] = s;
        }
        return result;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;
        double[][] res = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] t1 = { {1, 2, 3}, {4, 5, 6} };
        double[][] t2 = { {7, 8, 9}, {10, 11, 12} };

        System.out.println("Tableau t1:");
        affiche(t1);

        System.out.println("\nTableau t2:");
        affiche(t2);

        System.out.println("\nVérification régularité t1: " + regulier(t1));
        System.out.println("Somme des lignes de t1:");
        double[] sLignes = sommeLignes(t1);
        for (double s : sLignes) System.out.print(s + " ");
        System.out.println();

        System.out.println("\nSomme de t1 et t2:");
        double[][] s = somme(t1, t2);
        if (s != null) affiche(s);
        else System.out.println("Tableaux incompatibles pour la somme.");
    }
}
