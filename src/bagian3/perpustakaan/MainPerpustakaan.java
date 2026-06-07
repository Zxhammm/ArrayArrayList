/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku (ditambah tahun terbit sesuai Soal 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("buku ips", "pak guru", 2026)); // Tambahan buku untuk tes cari penulis

        // 1. Tampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // 2. Uji coba pinjam buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        // 3. Uji coba kembalikan buku (Soal 1)
        System.out.println("--- SOAL 1 (Kembalikan Buku) ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // 4. Uji coba cari penulis (Soal 3)
        System.out.println("--- SOAL 3 (Cari Penulis) ---");
        perpus.cariPenulis("Pramoedya");
        perpus.cariPenulis("Tere"); // Tes jika penulis tidak ada
    }
}