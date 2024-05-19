import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa =new ArrayList<>();
        Scanner scanner =new Scanner(System.in);

        System.out.println("Masukkan nama-nama mahasiswa (ketik 'selesai' untuk berhenti");

        int i = 1;
        while (true) {
            try {
                System.out.println("Masukkan nama mahasiswa ke-" + i + ":");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("selesai")){
                    break;
                } else if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama Tidak Boleh Kosong");
                } else {
                    mahasiswa.add(input);
                    i++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error" + e.getMessage());
            }
        }

        System.out.println("\nDaftar Nama Mahasiswa:");
        for (int j = 0; j < mahasiswa.size(); j++){
            System.out.println("Nama ke-" +(j+i) + ":" + mahasiswa.get(i));
        }
    }
}