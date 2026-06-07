/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // === SOAL 1: Method kembalikanBuku ===
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) { // Menggunakan equalsIgnoreCase agar lebih fleksibel huruf besar/kecilnya
                if (b.isDipinjam()) {
                    b.setDipinjam(false); // Ubah status jadi tidak dipinjam
                    System.out.println("Buku " + judul + " berhasil dikembalikan.");
                } else {
                    System.out.println("Buku " + judul + " sebenarnya tidak sedang dipinjam.");
                }
                return; // Keluar dari method karena buku sudah ketemu
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan di perpustakaan.");
    }

    // === SOAL 3: Method cariPenulis ===
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada buku karya " + penulis + " di perpustakaan ini.");
        }
    }
}