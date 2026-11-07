# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya memperbarui class diagram agar paket, field, method, tipe, visibility, dan relasi mengikuti kode yang ada. Saya juga membuat sequence diagram pengajuan dengan fragmen `alt` untuk jalur sukses dan bentrok, serta menandai bagian `ajukan()` yang belum diimplementasikan.

## Keputusan desain
Saya memilih SRP pada `KatalogAset` dan OCP pada hierarki `Aset` sebagai prinsip SOLID yang paling terlihat pada implementasi berjalan. Saya mencatat DIP pada `AturanDenda` dan `LayananDenda`, tetapi memberi batasan karena implementasi layanan masih TODO. Sequence diagram menggambarkan kontrak alur yang dituju dan menandai status TODO supaya tidak menyatakan alur itu sudah berfungsi.

## Kendala
Diagram awal menempatkan `DapatDipinjam` di paket yang salah dan sequence diagram berpotensi terbaca sebagai alur aktif. Saya membandingkan diagram dengan deklarasi Java lalu menambahkan catatan batas implementasi.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: pembaruan `docs/uml/class-minggu-06.puml`, `docs/uml/sequence-pengajuan-minggu-06.puml`, `docs/uml/solid.md`, dan catatan ini.
- Prompt utama: “Kerjakan Minggu 06”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: (tinjau dan isi bila ada; pastikan catatan ini sesuai pekerjaan dan pemahaman saya sebelum dikumpulkan).
- Satu hal yang saya pahami lebih baik sekarang: diagram sequence harus membedakan kontrak perilaku yang direncanakan dengan perilaku yang benar-benar sudah diimplementasikan.
