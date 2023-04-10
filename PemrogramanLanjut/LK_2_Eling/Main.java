package PemrogramanLanjut.LK_2_Eling;
/*
 * 1. Kelas Lingkaran
 * 2. Kelas Persegi panjang
 * 3. Kelas Main
 */

class Lingkaran{
    private double jariJari;
    final static private double phi = 3.14;

    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    double hitungLuas(){
        return phi * jariJari * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}

class PersegiPanjang{
    private double panjang, lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    double hitungLuas(){
        return panjang * lebar;
    }
}

public class Main {
    public static void main(String[] args) {
        Lingkaran objekLingkaranKepala = new Lingkaran(5);
        PersegiPanjang objekPersegiPanjangBadan = new PersegiPanjang(15, 10);
        PersegiPanjang objekPersegiPanjangTanganKiri = new PersegiPanjang(6, 2);
        PersegiPanjang objekPersegiPanjangTanganKanan = new PersegiPanjang(6, 2);
        Lingkaran objekLingkaranTelapakTanganKiri = new Lingkaran(1.5);
        Lingkaran objekLingkaranTelapakTanganKanan = new Lingkaran(1.5);
        PersegiPanjang objekPersegiPanjangKakiKiri = new PersegiPanjang(5, 15);
        PersegiPanjang objekPersegiPanjangKakiKanan = new PersegiPanjang(5, 15);
        Lingkaran objekLingkaranTelapakKakiKiri = new Lingkaran(5);
        Lingkaran objekLingkaranTelapakKakiKanan = new Lingkaran(5);

        // Hitung
        double luasRobot = objekLingkaranKepala.hitungLuas() 
        + objekPersegiPanjangBadan.hitungLuas() 
        + objekPersegiPanjangTanganKiri.hitungLuas()
        + objekPersegiPanjangTanganKanan.hitungLuas()
        + objekLingkaranTelapakTanganKiri.hitungLuas()
        + objekLingkaranTelapakTanganKanan.hitungLuas()
        + objekPersegiPanjangKakiKiri.hitungLuas()
        + objekPersegiPanjangKakiKanan.hitungLuas()
        + objekLingkaranTelapakKakiKiri.hitungLuas()
        + objekLingkaranTelapakKakiKanan.hitungLuas();

        double tinggiBadanRobot = objekLingkaranKepala.getJariJari()
        + objekPersegiPanjangBadan.getLebar()
        + objekPersegiPanjangKakiKiri.getLebar()
        + objekLingkaranTelapakKakiKiri.getJariJari();

        System.out.println("Luas Robot\t\t: " + luasRobot);
        System.out.println("Tinggi Badan Robot\t: " + tinggiBadanRobot);
    }
}
