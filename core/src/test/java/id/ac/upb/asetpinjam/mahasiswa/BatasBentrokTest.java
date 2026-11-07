package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Peminjaman;
import id.ac.upb.asetpinjam.model.Ruang;
import id.ac.upb.asetpinjam.model.Peminjam;
import org.junit.jupiter.api.Test;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Keputusan batas waktu: rentang dianggap setengah terbuka [mulai, selesai), sehingga
 * peminjaman yang mulai tepat saat peminjaman sebelumnya selesai tidak bentrok.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulaiTidakBentrok() {
        JadwalPeminjaman jadwal = new JadwalPeminjaman(1);
        Peminjam peminjam = new Peminjam("P1", "Pemohon");
        Ruang ruang = new Ruang("R-1", "Ruang 1", 20);
        jadwal.tambah(pinjam("1", peminjam, ruang, 9, 11));
        Peminjaman berikutnya = pinjam("2", peminjam, ruang, 11, 13);

        assertThat(jadwal.bentrok(berikutnya)).isFalse();
    }
}
