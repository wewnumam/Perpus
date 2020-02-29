-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Feb 2020 pada 06.37
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pwpb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `kode` varchar(32) NOT NULL,
  `judul` varchar(128) NOT NULL,
  `tahun` varchar(4) NOT NULL,
  `pengarang` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kode`, `judul`, `tahun`, `pengarang`) VALUES
('001', 'Buku Kosong', '2020', 'Manusia Biasa'),
('002', 'Buku Baru', '2021', 'Manusia Tidak Biasa'),
('003', 'Menjadi Anti-Suntrut', '2020', 'Kustun'),
('004', 'Santuy Segala Kondisi', '2020', 'Orang Santuy');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kamar`
--

CREATE TABLE `kamar` (
  `no` int(11) NOT NULL,
  `kamar` varchar(10) NOT NULL,
  `tipe` varchar(10) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `nama` varchar(32) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `tarif` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kamar`
--

INSERT INTO `kamar` (`no`, `kamar`, `tipe`, `jenis`, `nama`, `no_telp`, `check_in`, `check_out`, `tarif`) VALUES
(1, '001', 'single', 'VIP', 'R.M. Wuntul', '08123456789', '2020-02-01', '2020-02-13', 10000000),
(2, '002', 'double', 'REGULAR', 'Rocky Tristadika', '08987654321', '2020-02-01', '2020-02-29', 17000000),
(3, '003', 'single', 'VVIP', 'H. Haji', '08888888888', '2020-02-01', '2020-02-29', 24000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `idMobil` varchar(10) NOT NULL,
  `merek` varchar(20) DEFAULT NULL,
  `kapasitas` int(10) DEFAULT NULL,
  `harga` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`idMobil`, `merek`, `kapasitas`, `harga`) VALUES
('M001', 'Ferrari', 2, 1000),
('M002', 'Aston Martin', 2, 1500),
('M003', 'McLaren', 2, 2000),
('M004', 'Corvette', 2, 2500),
('M005', 'Lamborghini', 2, 3000),
('M006', 'Mercedez', 2, 3500),
('M007', 'Mustang', 2, 4000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idPelanggan` varchar(10) NOT NULL,
  `namaPelanggan` varchar(30) DEFAULT NULL,
  `alamatPelanggan` varchar(100) DEFAULT NULL,
  `noTelp` int(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`idPelanggan`, `namaPelanggan`, `alamatPelanggan`, `noTelp`) VALUES
('P001', 'A', 'Mojo', 12345),
('P002', 'B', 'Semanggi', 23456),
('P003', 'C', 'Mojosongo', 34567),
('P004', 'D', 'Kartosuro', 45678),
('P005', 'E', 'Ngemplak', 56789),
('P006', 'F', 'Sawahan', 67890),
('P007', 'G', 'Sumber', 67890);

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id` int(11) NOT NULL,
  `nis` varchar(9) NOT NULL,
  `nama` varchar(128) NOT NULL,
  `kode` varchar(32) NOT NULL,
  `judul` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`id`, `nis`, `nama`, `kode`, `judul`) VALUES
(1, '18.007694', 'Nur Cahyani Putr', '001', 'Buku Kosong'),
(2, '777777777', 'pStar7', '002', 'Buku Baru');

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `id` int(11) NOT NULL,
  `nis` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jk` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` (`id`, `nis`, `nama`, `jurusan`, `alamat`, `jk`) VALUES
(12, '18.007694', 'Nur Cahyani Putri', 'Rekayasa Perangkat Keras', 'Kampung Durian Runtuh', 'Laki-Laki'),
(13, '18.007694', 'Muhammad Ahmad Cahyo Tristadika Hidayah Pinandita ', 'Solo - Semarang', 'Bogor', 'Laki-Laki'),
(14, '6666666', 'ngantuk', 'pengen', 'pulang', 'sleeping'),
(17, '999999999', 'Name Saye Ahmat dari Tadike Sehat', 'Die bise pantun macem saye!!', 'Marvelous! Marvelous!', 'Laki-Laki'),
(19, '111111111', 'Assamulaikum wr. wb.', 'Kemarin saya ketemu alay', 'Trus dia pesen Ayaaam Goyeeeng', 'Dah lah.'),
(21, '777777777', 'pStar7', 'Berburu Ubur-Ubur', 'Goovy Goober', 'Aku Wumbo '),
(22, '888888888', 'cebong angkasa', 'teknik terbang', 'kartusuro', 'leki-laki');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idTransaksi` varchar(10) DEFAULT NULL,
  `idMobil` varchar(10) DEFAULT NULL,
  `idPelanggan` varchar(10) DEFAULT NULL,
  `tglRental` date DEFAULT NULL,
  `lamaRental` int(10) DEFAULT NULL,
  `totalHarga` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`idTransaksi`, `idMobil`, `idPelanggan`, `tglRental`, `lamaRental`, `totalHarga`) VALUES
('T001', 'M001', 'P001', '0000-00-00', 1, 1000),
('T002', 'M002', 'P002', '0000-00-00', 2, 1500),
('T003', 'M003', 'P003', '0000-00-00', 3, 2000),
('T004', 'M004', 'P004', '0000-00-00', 4, 2500),
('T005', 'M005', 'P005', '0000-00-00', 5, 3000),
('T006', 'M006', 'P006', '0000-00-00', 6, 3500),
('T007', 'M007', 'P007', '0000-00-00', 7, 4000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(48) NOT NULL,
  `password` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'bukan admin', 'bukanadmin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`no`);

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`idMobil`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `idMobil` (`idMobil`),
  ADD KEY `idPelanggan` (`idPelanggan`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kamar`
--
ALTER TABLE `kamar`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `siswa`
--
ALTER TABLE `siswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idMobil`) REFERENCES `mobil` (`idMobil`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idPelanggan`) REFERENCES `pelanggan` (`idPelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
