package mahasiswa;

/**
 *
 * @author regina
 */

public class Mahasiswa {
    private String npm;
    private String nama;
    private int nilaiKehadiran;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;
    
    public Mahasiswa(String npm, String nama, int nilaiKehadiran, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public int hitungNilaiAkhir() {
        return (int) ((0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS));
    }

    public String[] GradedanKeterangan() {
        int nilaiAkhir = hitungNilaiAkhir();
        String grade = null;
        String keterangan = null;
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        }
        
        return new String[]{grade, keterangan};
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }
}
