# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya melengkapi subclass `Ruang`, `Laptop`, dan `AlatLab` dengan data khusus, konstruktor, getter, validasi, dan `getJenis()`. Ketiganya tetap mewarisi kode, nama, status, dan kondisi dari `Aset` melalui pemanggilan `super`.

## Keputusan desain
Data bersama aset tetap berada di `Aset`; kapasitas hanya ada pada ruang, spesifikasi dan nomor inventaris hanya pada laptop, sedangkan laboratorium dan risiko hanya pada alat laboratorium. Field khusus dibuat `private final` karena ditetapkan oleh konstruktor.

Inheritance kurang tepat bila sistem perlu memberi beberapa kemampuan yang bisa digabungkan pada satu aset. Contohnya, fasilitas peminjaman yang mendukung pemesanan jadwal dan pelacakan perawatan lebih fleksibel dimodelkan sebagai komponen/layanan yang dapat dipakai berbagai jenis aset, daripada memaksa satu subclass mewarisi beberapa kelas.

## Kendala
Belum ada kendala khusus.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi subclass `Ruang`, `Laptop`, dan `AlatLab`, serta draf catatan ini.
- Prompt utama: “Kerjakan minggu 03”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: belum ada; tinjau dan sesuaikan catatan ini dengan pemahaman saya sebelum mengumpulkan.
- Satu hal yang saya pahami lebih baik sekarang: inheritance cocok untuk perilaku dan data yang benar-benar umum, sedangkan kemampuan yang dapat dipakai lintas jenis aset lebih cocok dipisahkan sebagai komponen.
