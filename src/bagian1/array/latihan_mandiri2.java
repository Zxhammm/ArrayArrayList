package bagian1.array;

public class latihan_mandiri2 {
    public static void main(String[] args) {
        String[] hari = {"sabtu", "senin", "selasa", "rabu", "kamis"};

        String terbanyak = hari[0];

        for (int i = 1; i < hari.length; i++) {
            if (hari[i].length() > terbanyak.length()) {
                terbanyak = hari[i];
            }
        }

        System.out.println("Kata dengan huruf terbanyak: " + terbanyak);
    }
}