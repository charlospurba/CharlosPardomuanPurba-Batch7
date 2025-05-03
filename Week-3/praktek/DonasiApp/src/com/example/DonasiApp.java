package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DonasiApp {
    public static void main(String[] args) {
        ArrayList<Filantropi> filantropiList = new ArrayList<>();
        filantropiList.add(new Filantropi("A"));
        filantropiList.add(new Filantropi("B"));
        filantropiList.add(new Filantropi("C"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nFilantropi: ");
            for (int i = 0; i < filantropiList.size(); i++) {
                System.out.print(filantropiList.get(i));
                if (i < filantropiList.size() - 1)
                    System.out.print(" | ");
            }
            System.out.println();
            System.out.println("1. Donasi");
            System.out.println("2. Lihat Riwayat");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Masukkan harus angka (1-3)!");
                scanner.next(); // Bersihkan input salah
                continue;
            }
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (pilihan == 1) {
                System.out.print("Masukkan filantropi (A, B, C) atau hardcode (contoh: 'John,100'): ");
                String input = scanner.nextLine();
                if (input.contains(",")) {
                    try {
                        String[] bagian = input.split(",");
                        String donatur = bagian[0].trim();
                        double jumlah = Double.parseDouble(bagian[1].trim());
                        Filantropi f = filantropiList.get(0); // Default ke pertama untuk hardcode
                        f.tambahDonasi(donatur, jumlah);
                        System.out.println("Donasi berhasil ditambahkan!");
                    } catch (NumberFormatException e) {
                        System.out.println("Jumlah harus berupa angka!");
                    }
                } else {
                    Filantropi f = null;
                    for (Filantropi fil : filantropiList) {
                        if (fil.getNama().equals(input)) {
                            f = fil;
                            break;
                        }
                    }
                    if (f != null) {
                        System.out.print("Masukkan nama donatur: ");
                        String donatur = scanner.nextLine();
                        System.out.print("Masukkan jumlah: ");
                        if (scanner.hasNextDouble()) {
                            double jumlah = scanner.nextDouble();
                            scanner.nextLine(); // Konsumsi newline
                            f.tambahDonasi(donatur, jumlah);
                            System.out.println("Donasi berhasil ditambahkan!");
                        } else {
                            System.out.println("Jumlah harus berupa angka!");
                            scanner.next(); // Bersihkan input salah
                        }
                    } else {
                        System.out.println("Filantropi tidak ditemukan!");
                    }
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan filantropi (A, B, C) untuk melihat riwayat: ");
                String namaFil = scanner.nextLine();
                for (Filantropi fil : filantropiList) {
                    if (fil.getNama().equals(namaFil)) {
                        fil.tampilkanRiwayat();
                        break;
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Masukkan 1-3.");
            }
        }
        scanner.close();
    }
}