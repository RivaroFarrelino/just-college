package TugasPemlan.Praktikum2;

public class Buku {
    private String judul;
    private String penulis;
    private String tahunTerbit;
    private String kategori;
    private String sinopsis;

    Buku(){
        
    }

    Buku(String judul, String penulis, String tahunTerbit, String kategori, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }

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

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int hitungJumlahKata(){
        String[] jumlahKata = this.sinopsis.split(" ");
        return jumlahKata.length;
    }

    Buku copy(Buku bukuAwal){
        Buku bukuCopy = new Buku(bukuAwal.judul, bukuAwal.penulis, bukuAwal.tahunTerbit, bukuAwal.kategori, bukuAwal.sinopsis);
        return bukuCopy;
    }

    public int cariBuku (String judul, String bukuAwal[][]){
        int hasil = 0;
        for (int i = 0; i < 5; i++){
            if (bukuAwal[i][0].equalsIgnoreCase(judul)) {
                return hasil = i;
            }
        }
        return hasil;
    }
        
    void display(){
        System.out.println("Judul\t\t: " + this.judul);
        System.out.println("Penulis\t\t: " + this.penulis);
        System.out.println("Tahun Terbit\t: " + this.tahunTerbit);
        System.out.println("Kategori\t: " + this.kategori);
        System.out.println("Sinopsis\t: " + this.sinopsis);
        System.out.println("Jumlah kata\t: " + hitungJumlahKata());
        System.out.println();
    }   
}