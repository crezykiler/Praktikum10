import java.util.Scanner;

public class Survey17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] survey = new int[10][6];
        
        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
                while (survey[i][j] < 1 || survey[i][j] > 5) {
                    System.out.print("Nilai harus antara 1-5, masukkan ulang: ");
                    survey[i][j] = input.nextInt();
                }
            }
        }

        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            int rataRata = total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRata);
        }

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            int rataRata = total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        int rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);

        input.close();
    }
}
