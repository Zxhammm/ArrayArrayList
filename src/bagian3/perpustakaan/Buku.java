/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.perpustakaan;

public class Buku {
    // Atribut lama + atribut baru (tahunTerbit)
    private String judul;
    private String penulis;
    private int tahunTerbit; // Tambahan Soal 2
    private boolean dipinjam;

    // Constructor diperbarui untuk menerima tahunTerbit (Soal 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // Tambahan Soal 2
        this.dipinjam = false; 
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Getter untuk tahunTerbit (Soal 2)
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Method info diperbarui untuk menampilkan tahun terbit (Soal 2)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}