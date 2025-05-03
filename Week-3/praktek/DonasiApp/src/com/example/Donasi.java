package com.example;

public class Donasi extends User {
    private double jumlah;

    public Donasi(String namaDonatur, double jumlah) {
        super(namaDonatur);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Donatur: " + nama + ", Jumlah: " + jumlah;
    }
}