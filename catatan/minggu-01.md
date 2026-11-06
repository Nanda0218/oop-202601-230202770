# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya membuat tiga implementasi sapaan Aset-Pinjam yang menyertakan nama dan NIM. Versi prosedural memakai fungsi statis, versi OOP menyimpan data dalam field privat, dan versi fungsional mengembalikan lambda.

## Keputusan desain
Saya memakai kalimat sapaan yang sama di ketiga gaya agar hasilnya konsisten. Field pada `HelloOOP` dibuat `private final` karena nilainya ditetapkan saat objek dibuat dan tidak perlu diubah.

Untuk sistem peminjaman aset, gaya prosedural mudah diikuti untuk operasi kecil, tetapi data dan operasi bisa tersebar ketika sistem membesar. OOP mengelompokkan data aset dengan perilakunya, tetapi menambah struktur kelas yang perlu dikelola. Gaya fungsional memudahkan perilaku dibuat dan diteruskan sebagai nilai, tetapi lambda dapat lebih sulit dibaca bila logikanya panjang.

## Kendala
Belum ada kendala khusus. Data NIM dan nama mahasiswa sudah terisi pada `mahasiswa.properties`.

## Penggunaan AI
- Alat yang dipakai: Codex.
- Bagian yang dibantu AI: implementasi `sapa`, field dan konstruktor `HelloOOP`, lambda `HelloFungsional`, serta draf catatan ini.
- Prompt utama: “Kerjakan minggu 01”.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: belum ada; saya perlu meninjau dan menyesuaikan catatan ini dengan pemahaman saya sendiri sebelum mengumpulkan.
- Satu hal yang saya pahami lebih baik sekarang: tiga paradigma dapat menghasilkan perilaku sama dengan cara mengatur data dan fungsi yang berbeda.
