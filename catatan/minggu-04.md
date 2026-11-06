# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya menerapkan overriding `hitungDenda(int)` pada ruang, laptop, dan alat laboratorium dengan pengali sesuai jenisnya dan tarif dari `Varian.aktif()`. Saya juga melengkapi dua overload `KatalogAset.cari(...)` untuk mencari nama tanpa membedakan kapitalisasi, dengan overload kedua memfilter berdasarkan jenis aset.

## Keputusan desain
Validasi hari negatif dan perhitungan tarif dipusatkan pada helper di `Aset`, sementara subclass memasok pengali 1, 2, atau 4. Perkalian dimulai sebagai `long` agar hasil tidak overflow pada operasi integer. Pencarian menurunkan huruf dengan `Locale.ROOT` agar hasil tidak dipengaruhi locale sistem.

## Kendala
Belum ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi hitung denda di `Aset` dan subclass, overload pencarian pada `KatalogAset`, serta draf catatan ini.
- Prompt utama: “Kerjakan minggu 04”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: belum ada; tinjau dan sesuaikan catatan ini dengan pemahaman saya sebelum mengumpulkan.
- Satu hal yang saya pahami lebih baik sekarang: dynamic binding memilih implementasi `hitungDenda` dari jenis objek aktual meskipun variabelnya bertipe `Aset`.
