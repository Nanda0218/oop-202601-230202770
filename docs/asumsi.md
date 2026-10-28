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
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## A-08: rumus denda progresif
- Pertanyaan: Bagaimana denda progresif meningkat seiring bertambahnya hari keterlambatan?
- Keputusan: Denda progresif adalah denda flat dikalikan `1 + (hari terlambat / 7)` dengan pembagian bilangan bulat. Faktor bertambah satu setiap tujuh hari.
- Alasan: Rumus ini sederhana, tidak pernah lebih murah dari flat, tidak menurun saat hari bertambah, dan membuat denda hari ke-30 lebih besar dari flat.
- Dampak ke kode: `DendaProgresif.hitung`.
- Tes yang membuktikan: `Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal`.
