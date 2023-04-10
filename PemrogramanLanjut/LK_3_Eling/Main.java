package PemrogramanLanjut.LK_3_Eling;

import java.util.ArrayList;

class Mobil{
    private String jenisKendaraan;
    private String noPol;
    ArrayList<Penumpang> daftarPenumpang = new ArrayList<Penumpang>();

    Mobil(String jenisKendaraan, String noPol){
        this.jenisKendaraan = jenisKendaraan;
        this.noPol = noPol;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    void menaikkanPenumpang(Penumpang penumpang){
        System.out.println("Penumpang dengan nama " + penumpang.getNama() + " tujuan " + penumpang.getTujuan() + " naik ke " + this.jenisKendaraan + " dengan nopol " + this.noPol);
        daftarPenumpang.add(penumpang);
    }

    void menurunkanPenumpang(Penumpang penumpang){
        System.out.println("Penumpang dengan nama " + penumpang.getNama() + " sudah sampai tujuan " + penumpang.getTujuan() + " dengan " + this.jenisKendaraan + " nopol " + this.noPol);
        daftarPenumpang.remove(penumpang);
    }
}

class Orang{
    private String nama;

    Orang(){

    }

    Orang(String nama){
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Angkot extends Mobil{
    private DriverAngkot driverAngkot;

    Angkot(String jenisKendaraan, String noPol){
        super(jenisKendaraan, noPol);
    }
    
    public void setDriverAngkot(DriverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
    }

    public DriverAngkot getDriverAngkot() {
        return driverAngkot;
    }
}

class Bus extends Mobil{  
    DriverBus driverBus;

    Bus(String jenisKendaraan, String noPol){
        super(jenisKendaraan, noPol);
    }

    public void setDriverBus(DriverBus driverBus) {
        this.driverBus = driverBus;
    }

    public DriverBus getDriverBus() {
        return driverBus;
    }
}

class DriverBus extends Orang{
    private Bus bus;
    boolean simB = true;

    DriverBus(){

    }
    
    DriverBus(String nama){
        super(nama);
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Bus getBus() {
        return bus;
    }

    void isNarikBus(Boolean isNarikBus){
        if(isNarikBus == true){
            System.out.println("Driver bus bernama " + getNama() + " sedang narik bus");
        } else{
            System.out.println("Driver bus bernama " + getNama() + " tidak sedang narik bus");
        }
    }
}

class DriverAngkot extends Orang{
    private Angkot angkot;
    boolean simA = true;

    DriverAngkot(String nama){
        super(nama);
    }

    public void setAngkot(Angkot angkot) {
        this.angkot = angkot;
    }

    public Angkot getAngkot() {
        return angkot;
    }
    
    void isNarikAngkot(boolean isNarikAngkot){
        if(isNarikAngkot == true){
            System.out.println("Driver angkot bernama " + getNama() + " sedang narik angkot");
        } else{
            System.out.println("Driver angkot bernama " + getNama() + " tidak sedang narik angkot");
        }
    }
}

class Penumpang extends Orang{
    private String tujuan;

    Penumpang(String nama){
        super(nama);
    }

    Penumpang(String nama, String tujuan){
        super(nama);
        this.tujuan = tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    void Naik(Mobil mobil, Penumpang penumpang){
        mobil.menaikkanPenumpang(penumpang);
    }

    void Turun(Mobil mobil, Penumpang penumpang){
        mobil.menurunkanPenumpang(penumpang);
    }
}

public class Main {
    public static void main(String[] args) {
        Angkot angkot1 = new Angkot("Angkot", "B 8932 OOP");
        DriverAngkot driverAngkot1 = new DriverAngkot("Samsudin");
        driverAngkot1.isNarikAngkot(true);

        Penumpang penumpang1 = new Penumpang("Rivaro", "Pondok Kelapa");
        Penumpang penumpang2 = new Penumpang("Alucard", "Matraman");
        Penumpang penumpang3 = new Penumpang("Zilong", "Senayan");

        penumpang1.Naik(angkot1, penumpang1);
        penumpang2.Naik(angkot1, penumpang2);
        penumpang3.Naik(angkot1, penumpang3);

        System.out.println();
        penumpang1.Turun(angkot1, penumpang1);
        penumpang3.Turun(angkot1, penumpang3);

        Bus bus1 = new Bus("Bus", "B 9876 PPP");
        DriverBus driverBus1 = new DriverBus("Cecep");
        System.out.println();
        driverBus1.isNarikBus(true);

        Penumpang penumpang4 = new Penumpang("Lylia", "Benhil");
        Penumpang penumpang5 = new Penumpang("Hanabi","Grogol");

        penumpang4.Naik(bus1, penumpang4);
        penumpang5.Naik(bus1, penumpang5);

        System.out.println();
        penumpang5.Turun(bus1, penumpang5);

        driverBus1.isNarikBus(false);
    }
}