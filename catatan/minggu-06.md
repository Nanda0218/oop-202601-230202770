# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat diagram kelas Mermaid dari model dan layanan inti yang ada, serta diagram urutan pengajuan dengan cabang sukses dan bentrok. Saya juga mendokumentasikan OCP, DIP, dan SRP berdasarkan kelas-kelas di repo.

## Keputusan desain
Diagram merepresentasikan kelas dan kontrak yang tersedia di kode. Diagram urutan menampilkan alur pengajuan yang didefinisikan oleh metode `JadwalPeminjaman`; implementasi `ajukan` sendiri dijadwalkan pada minggu 9.

## Kendala
Implementasi alur `ajukan` belum ada karena termasuk materi minggu 9, sehingga sequence diagram menggambarkan rancangan interaksi berdasarkan kontrak/metode yang tersedia.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: penyusunan `class-asetpinjam.mmd`, `sequence-pengajuan.mmd`, `solid.md`, dan catatan ini.
- Prompt utama: “kerjakan minggu 06”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Belum ada perubahan atau penolakan.
- Satu hal yang saya pahami lebih baik sekarang: Diagram kelas perlu mengikuti tipe dan relasi yang benar-benar ada di kode agar berguna untuk memahami struktur proyek.
