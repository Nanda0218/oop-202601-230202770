# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: Tidak. Rentang waktu diperlakukan setengah terbuka `[mulai, selesai)`, sehingga waktu selesai tidak termasuk ke dalam peminjaman.
- Alasan: Dua peminjaman dapat dilakukan berurutan tanpa jeda dan tidak memakai aset pada waktu yang sama.
- Dampak ke kode: `JadwalPeminjaman.bentrok` membandingkan rentang dengan syarat mulai sebelum selesai rentang lain pada kedua sisi.
- Tes yang membuktikan: `mahasiswa.BatasBentrokTest.selesaiSamaDenganMulaiTidakBentrok`.

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## A-08: rumus denda progresif
- Pertanyaan: Bagaimana denda progresif bertambah berdasarkan lama keterlambatan?
- Keputusan: Denda = denda flat + (denda flat x jumlah hari terlambat / 30), dengan pembagian bilangan bulat.
- Alasan: Rumus ini tidak lebih murah daripada denda flat, tidak menurun saat hari bertambah, dan menjadi dua kali denda flat pada hari ke-30.
- Dampak ke kode: `DendaProgresif.hitung`.
- Tes yang membuktikan: `Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal`.
