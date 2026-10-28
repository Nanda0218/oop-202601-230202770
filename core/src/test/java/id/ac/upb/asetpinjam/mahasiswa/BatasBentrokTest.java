package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.TestSupport;
import org.junit.jupiter.api.Test;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Rentang waktu bersebelahan dianggap tidak bentrok (interval setengah terbuka).
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulai() {
        var peminjam = TestSupport.peminjam("P1");
        var aset = TestSupport.ruang("R-1");
        JadwalPeminjaman jadwal = new JadwalPeminjaman(1);
        jadwal.tambah(pinjam("1", peminjam, aset, 9, 11));

        var berikutnya = pinjam("2", peminjam, aset, 11, 13);

        assertThat(jadwal.bentrok(berikutnya)).isFalse();
    }
}
