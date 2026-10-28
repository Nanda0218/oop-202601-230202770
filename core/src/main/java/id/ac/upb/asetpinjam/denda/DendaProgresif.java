package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;
import java.math.BigInteger;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        long flat = aset.hitungDenda(hariTerlambat);
        BigInteger faktor = BigInteger.valueOf(1L + hariTerlambat / 7);
        BigInteger hasil = BigInteger.valueOf(flat).multiply(faktor);
        BigInteger batasLong = BigInteger.valueOf(Long.MAX_VALUE);
        return hasil.compareTo(batasLong) > 0 ? Long.MAX_VALUE : hasil.longValue();
    }
}
