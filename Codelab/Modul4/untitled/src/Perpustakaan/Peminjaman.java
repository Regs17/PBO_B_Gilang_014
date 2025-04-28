package Perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judulBuku);

    void kembalikanBuku(String judul);

    public interface peminjaman {
        void pinjamBuku(String judulBuku);

        void pinjamBuku(String judul, int durasiPeminjaman);
        void kembalikanBuku(String judul);
    }
}
