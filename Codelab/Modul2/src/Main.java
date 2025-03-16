// Kelas Utama (Main) yang akanmenjalankan program.
public class Main {
    public static void main(String[] args) {
        //Membuat objek hewan1 dan hewan2 dengan nama, jenis, dan suara
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof");

        //Memanggil metode tampilkan Info() untuk menampilkan informasi hewan1
        hewan1.tampilkanInfo();
        //Memanggil metode tampilkan Info() untuk menampilkan informasi hewan2
        hewan2.tampilkanInfo();
    }
}

//Restu Gilang Saputra_202410370110014_2B