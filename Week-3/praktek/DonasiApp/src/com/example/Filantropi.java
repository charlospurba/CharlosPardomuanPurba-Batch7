package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Filantropi extends User {
    private Map<String, ArrayList<Donasi>> riwayatDonasi;

    public Filantropi(String nama) {
        super(nama);
        this.riwayatDonasi = new HashMap<>();
    }

    public void tambahDonasi(String namaDonatur, double jumlah) {
        Donasi donasi = new Donasi(namaDonatur, jumlah);
        riwayatDonasi.computeIfAbsent(namaDonatur, k -> new ArrayList<>()).add(donasi);
    }

    public void tampilkanRiwayat() {
        System.out.println("Riwayat Donasi untuk " + nama + ":");
        for (Map.Entry<String, ArrayList<Donasi>> entry : riwayatDonasi.entrySet()) {
            for (Donasi d : entry.getValue()) {
                System.out.println(d);
            }
        }
    }

    @Override
    public String toString() {
        return nama;
    }
}