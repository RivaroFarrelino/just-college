package TugasPemlan.Praktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         Judul,             Penulis,                Tahun Terbit,             
           0                    1                         2                                      
         */

        // Teknologi
        String[][] bukuTeknologi = {
            {"Building Arduino Projects for the Internet of Things", "Adeel Javed", "2016"},
            {"A Programmer's Guide to the Mind", "Lorin Friesen", "2010"},
            {"SEO: Search Engine Optimization Bible", "Jerri Ledford", "2008"},
            {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "2015"},
            {"Steve Jobs", "Walter Isaacson", "2011"}
        };

        // filsafat
        String[][] bukuFilsafat = {
            {"Filsafat umum", "Asmoro Ahmadi", "2001"},
            {"Filosofi Teras", "Henry Manampiring", "2018"},
            {"Filsafat sebagai ilmu kritis", "Franz Magnis-Suseno", "1992"},
            {"Pengantar filsafat hukum", "Ira Rasjidi", "2002"},
            {"Melampaui Baik dan Jahat", "Friedrich Nietzsche", "1886"}

        };

        // sejarah
        String[][] bukuSejarah = {
            {"1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "2005"},
            {"Guns, Germs, and Steel", "Jared Diamond", "1997"},
            {"1776", "David McCullough", "2005"},
            {"The Guns of August", "Barbara W. Tuchman", "1962"},
            {"Postwar: A History of Europe Since 1945", "Tony Judt", "2005"}
        };


        // Agama
        String[][] bukuAgama = {
            {"The God Delusion", "Richard Dawkins", "2006"},
            {"Mere Christianity", "C.S. Lewis", "1942"},
            {"God Is Not Great: How Religion Poisons Everything", "Christopher Hitchens", "2007"},
            {"A History of God: The 4,000-Year Quest of Judaism, Christianity, and Islam", "Karen Armstrong", "1993"},
            {"Siddhartha", "Hermann Hesse", "1992"}
        };


        // Psikologi
        String[][] bukuPsikologi = {
            {"Thinking, Fast and Slow", "Daniel Kahneman", "2011"},
            {"The Happiness Hypothesis", "Jonathan Haidt", "2006"},
            {"Influence: Science and Practice", "Robert Cialdini", "1984"},
            {"Predictably Irrational", "Dan Ariely", "2008"},
            {"Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "2005"}
        };


        // Politik
        String[][] bukuPolitik = {
            {"The Communist Manifesto", "karl Marx", "1848"},
            {"Animal Farm", "George Orwell", "1945"},
            {"On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", "2017"},
            {"The Shock Doctrine: The Rise of Disaster Capitalism", "Naomi Klein", "2007"},
            {"Fire and Fury: Inside the Trump White House", "Michael Wolff", "2018"},
        };


        // Fiksi
        String[][] bukuFiksi = {
            {"Lessons in Chemistry", "Bonnie Garmus", "2022"},
            {"Trust", "Hernan Diaz", "2022"},
            {"Beloved", "Toni Morrison", "1987"},
            {"It Ends with Us", "Colleen Hoover", "2016"},
            {"Pride and Prejudice", "Jane Austen", "2013"}
        };

        byte pilih = 9;

        do{
            System.out.println("Selamat datang! Silakan dipilih kategori bukunya!");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("8. Exit");
            System.out.print("Masukkan pilihan: ");
            pilih = input.nextByte();

            switch(pilih){
                case 1: cetakTulisan(bukuTeknologi, "Teknologi"); break;
                case 2: cetakTulisan(bukuFilsafat, "Filsafat"); break;
                case 3: cetakTulisan(bukuSejarah, "Sejarah"); break;
                case 4: cetakTulisan(bukuAgama, "Agama"); break;
                case 5: cetakTulisan(bukuPsikologi, "Psikologi"); break;
                case 6: cetakTulisan(bukuPolitik, "Politik"); break;
                case 7: cetakTulisan(bukuFiksi, "Fiksi"); break;
                case 8: System.exit(0);
                default: System.out.println("Gak ada di pilian :(((, silakan pilih antara 1-7!");
            }
        } while(pilih != 9);
        
        input.close();
    }

    static void cetakTulisan(String[][] data, String kategoriBuku){
        Buku buku = new Buku();

        buku.setKategori(kategoriBuku);

        for(int i = 0; i < data.length; i++){
            buku.setJudul(data[i][0]);
            buku.setPenulis(data[i][1]);
            buku.setTahunTerbit(data[i][2]);
            buku.display();
        }
    }
}
