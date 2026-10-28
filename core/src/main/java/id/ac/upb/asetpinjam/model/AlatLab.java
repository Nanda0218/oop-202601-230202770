package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 3: alat laboratorium. Laboratorium tidak boleh kosong; risiko tidak boleh null. */
public class AlatLab extends Aset {

    private final String laboratorium;
    private final TingkatRisiko tingkatRisiko;

    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
        if (laboratorium == null || laboratorium.isBlank()) {
            throw new IllegalArgumentException("Nama laboratorium tidak boleh kosong");
        }
        if (tingkatRisiko == null) {
            throw new IllegalArgumentException("Tingkat risiko tidak boleh null");
        }
        this.laboratorium = laboratorium;
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        validasiHariTerlambat(hariTerlambat);
        return (long) hariTerlambat * Varian.aktif().dendaPerHari * 4;
    }
}
