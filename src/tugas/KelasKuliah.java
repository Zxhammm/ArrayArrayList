package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    // Menampung banyak objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Jumlah mahasiswa
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    // Rata-rata nilai
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    // Jumlah mahasiswa lulus
    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Menampilkan semua data mahasiswa
    public void tampilkanSemua() {

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-12s %-20s %-10s %-15s\n",
                "NPM", "Nama", "Nilai", "Status");
        System.out.println("------------------------------------------------------------");

        for (Mahasiswa mhs : daftarMahasiswa) {

            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";

            System.out.printf("%-12s %-20s %-10.1f %-15s\n",
                    mhs.getNpm(),
                    mhs.getNama(),
                    mhs.getNilai(),
                    status);
        }

        System.out.println("------------------------------------------------------------");
    }
}