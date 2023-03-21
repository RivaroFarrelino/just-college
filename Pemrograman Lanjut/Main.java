package TugasMateri4;

class Civitas{
    protected String nama;
    protected String jenisKelamin;
    protected String tglLahir;
    Mahasiswa mahasiswa;


    Civitas(String nama, String jenisKelamin, String tglLahir){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tglLahir = tglLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

}

class Dosen extends Civitas{
    private String NIDN;
    private String mataKuliah;
    private String gelarAkademik;
    private Mahasiswa mahasiswa;
    
    Dosen(String nama, String jenisKelamin, String tglLahir, String NIDN, String mataKuliah, String gelarAkademik) {
        super(nama, jenisKelamin, tglLahir); // memanggil constructor, method, atau atribut di superclass
        this.NIDN = NIDN;
        this.mataKuliah = mataKuliah;
        this.gelarAkademik = gelarAkademik;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    void mengajar(){
        System.out.println("\nDosen mengajar mahasiswa mata kuliah " + this.mataKuliah);
    }

    void memberiNilai(){
        System.out.println("Dosen bernama " + this.nama + " memberi nilai ke mahasiswa yang bernama "+ mahasiswa.nama + " pada mata kuliah " + this.mataKuliah);
    }

    void infoDosen(){
        System.out.println("\nNama dosen\t: " + this.nama + ", " + this.gelarAkademik);
        System.out.println("Jenis kelamin\t: " + this.jenisKelamin);
        System.out.println("Tanggal Lahir\t: " + this.tglLahir);
        System.out.println("NIDN\t\t: " + this.NIDN);
        System.out.println("Mata kuliah\t: " + this.mataKuliah);
    }
}

class Mahasiswa extends Civitas{
    private String NIM;
    private String prodi;
    private int angkatan;
    private double IPK;
    private Dosen dosen;
    
    Mahasiswa(String nama, String jenisKelamin, String tglLahir, String NIM, String prodi, int angkatan, double IPK) {
        super(nama, jenisKelamin, tglLahir);
        this.NIM = NIM;
        this.prodi = prodi;
        this.angkatan = angkatan;
        this.IPK = IPK;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    void mendapatNilaiIPK(){
        System.out.println("Mahasiswa bernama " + this.nama + " mendapat IPK " + this.IPK + " oleh dosen bernama " + dosen.nama);
    }

    void gabungOrganisasi(){
        System.out.println("Mahasiswa bernama " + this.nama + " bergabung dengan organisasi");
    }

    void infoMahasiswa(){
        System.out.println("\nNama mahasiswa\t: " + this.nama);
        System.out.println("Jenis kelamin\t: " + this.jenisKelamin);
        System.out.println("Tanggal Lahir\t: " + this.tglLahir);
        System.out.println("NIM\t\t: " + this.NIM);
        System.out.println("Prodi\t\t: " + this.prodi);
        System.out.println("Angkatan\t: " + this.angkatan);

    }

}

class Tendik extends Civitas{
    private String unitKerja;
    private String jabatan;

    Tendik(String nama, String jenisKelamin, String tglLahir, String unitKerja, String jabatan) {
        super(nama, jenisKelamin, tglLahir);
        this.unitKerja = unitKerja;
        this.jabatan = jabatan;
    }

    void administrasi(){
        System.out.println(this.nama + " (tendik) mengatur administrasi kepegawaian");
    }

    void menjagaKeamanan(){
        System.out.println(this.nama + " (tendik) menjaga keamanan lingkungan kampus");
    }

    void mendukungKegiatanKampus(){
        System.out.println("Tendik turut serta mendukung kegiatan kampus");
    }

    void infoTendik(){
        System.out.println("\nNama tendik\t: " + this.nama);
        System.out.println("Jenis kelamin\t: " + this.jenisKelamin);
        System.out.println("Tanggal Lahir\t: " + this.tglLahir);
        System.out.println("Unit Kerja\t: " + this.unitKerja);
        System.out.println("Jabatan\t\t: " + this.jabatan);
    }
}

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Abdul Muntahar", "Laki-laki", "31 April 1970", "13450", "Pemrograman Lanjut", "S.Kom");
        dosen1.infoDosen();

        Mahasiswa mahasiswa1 = new Mahasiswa("Rivaro", "Laki-laki", "30 Februari 1630", "225150707111076", "Teknologi Informasi", 2022, 3.99);
        mahasiswa1.infoMahasiswa();

        Tendik tendik1 = new Tendik("Melisa", "Perempuan", "30 Februari 1945", "Keuangan", "Administrasi");
        tendik1.infoTendik();

        dosen1.mengajar();
        dosen1.setMahasiswa(mahasiswa1);
        dosen1.memberiNilai();
        System.out.println();

        mahasiswa1.setDosen(dosen1);
        mahasiswa1.mendapatNilaiIPK();
        mahasiswa1.gabungOrganisasi();
        System.out.println();

        tendik1.administrasi();
        tendik1.mendukungKegiatanKampus();

        Dosen dosen2 = new Dosen("Isyana Sarasvati", "Perempuan", "2 Mei 1993", "14045", "Sistem Basis Data", "S.Kom");
        dosen2.infoDosen();

        Mahasiswa mahasiswa2 = new Mahasiswa("Ucup", "Laki-laki", "31 Juni 2001", "225150707111077", "Teknologi Informasi", 2022, 3.25);
        mahasiswa2.infoMahasiswa();

        Tendik tendik2 = new Tendik("Fathia Izzati", "Perempuan", "26 September 1994", "Keamanan", "Head Security");
        tendik2.infoTendik();

        dosen2.mengajar();
        dosen2.setMahasiswa(mahasiswa2);
        dosen2.memberiNilai();
        System.out.println();

        mahasiswa2.setDosen(dosen2);
        mahasiswa2.mendapatNilaiIPK();
        mahasiswa2.gabungOrganisasi();
        System.out.println();

        tendik2.menjagaKeamanan();
        tendik2.mendukungKegiatanKampus();

    }
}
