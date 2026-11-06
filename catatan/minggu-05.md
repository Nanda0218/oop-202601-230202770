# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya menjadikan `Aset` kelas abstrak, melengkapi `bisaDipinjam()`, dan menetapkan `hitungDenda(int)` sebagai operasi abstrak yang diimplementasikan tiap jenis aset. Saya juga mengimplementasikan strategi denda flat dan progresif.

## Keputusan desain
Denda progresif dihitung sebagai denda flat ditambah `denda flat × hari terlambat / 30` (pembagian bilangan bulat). Dengan rumus ini jumlahnya tidak kurang dari flat, tidak menurun ketika hari bertambah, dan pada hari ke-30 menjadi dua kali denda flat. Keputusan ini juga dicatat di `docs/asumsi.md`.

## Kendala
Belum ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi abstraksi dan `bisaDipinjam()` pada `Aset`, strategi `DendaFlat` dan `DendaProgresif`, serta draf catatan dan asumsi progresif.
- Prompt utama: “Kerjakan minggu 05”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: belum ada; tinjau dan sesuaikan catatan ini dengan pemahaman saya sebelum mengumpulkan.
- Satu hal yang saya pahami lebih baik sekarang: kelas abstrak dapat menyediakan state dan perilaku bersama sekaligus mewajibkan subclass memberi implementasi perilaku yang berbeda.
