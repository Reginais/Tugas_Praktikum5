package tugaspertemuan5;

/**
 *
 * @author regina
 */

import mahasiswa.Mahasiswa;
import java.util.Scanner;

public class TugasPertemuan5 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("NPM              :  ");
            String npm = input.nextLine();
            System.out.print("Nama Mahasiswa   :  ");
            String nama = input.nextLine();
            System.out.print("Nilai Kehadiran  :  ");
            int hadir = input.nextInt();
            System.out.print("Nilai Tugas      :  ");
            int tugas = input.nextInt();
            System.out.print("Nilai UTS        :  ");
            int uts = input.nextInt();
            System.out.print("Nilai UAS        :  ");
            int uas = input.nextInt();
            
            Mahasiswa mhs = new Mahasiswa(npm, nama, hadir, tugas, uts, uas);
            
            int nilaiAkhir = mhs.hitungNilaiAkhir();
            String[] hasil = mhs.GradedanKeterangan();
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("NPM Mahasiswa    :  " + mhs.getNpm());
            System.out.println("Nama Mahasiswa   :  " + mhs.getNama());
            System.out.println("Nilai Rata-rata  :  " + nilaiAkhir);
            System.out.println("Grade            :  " + hasil[0]);
            System.out.println("Keterangan       :  " + hasil[1]);
        }
    }
}
