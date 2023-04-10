package TugasPemlan.Praktikum1;

class Buku{
    private String judul;
    private String penulis;
    private String tahunTerbit;
    private String kategori;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
        
    void display(){
        System.out.println("Judul\t\t: " + this.judul);
        System.out.println("Penulis\t\t: " + this.penulis);
        System.out.println("Tahun Terbit\t: " + this.tahunTerbit);
        System.out.println("Kategori\t: " + this.kategori);
        System.out.println();
    }

    
}
