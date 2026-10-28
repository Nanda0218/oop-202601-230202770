# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Saya melengkapi pemeriksaan bentrok, pengurutan jadwal, pengelompokan per kode aset, dan penghapusan peminjaman berdasarkan ID. Saya juga menulis tes sendiri untuk peminjaman yang waktunya bersebelahan.

## Keputusan desain
Waktu selesai yang sama dengan waktu mulai berikutnya tidak dianggap bentrok; interval diperlakukan setengah terbuka. Saya memakai `List` sebagai penyimpanan utama karena jadwal perlu diurutkan dan dipindai, lalu membentuk `Map` untuk hasil pengelompokan saat diminta. Detail keputusan ada di `docs/asumsi.md`.

## Kendala
Tidak ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi metode minggu 7 di `JadwalPeminjaman`, tes batas waktu, serta catatan ini.
- Prompt utama: “kerjakan minggu 07”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Perbandingan ketat pada awal dan akhir membuat interval yang bersebelahan tidak dianggap tumpang tindih.
