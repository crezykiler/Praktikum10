import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int baris, kolom, menu;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Pilih menu:");
            System.out.println("1: Input data Penonton");
            System.out.println("2: Tampilkan daftar penonton");
            System.out.println("3: Exit");
            System.out.print("Pilihan: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak tersedia. Silakan coba lagi.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi ini sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        sc.close();
    }
}
