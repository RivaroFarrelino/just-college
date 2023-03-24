package TugasPemlan.Praktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Judul, Penulis, Tahun Terbit, Sinopsis
         *   0        1         2           3
         */

        // Teknologi
        String[][] bukuTeknologi = {
                { "Building Arduino Projects for the Internet of Things", "Adeel Javed", "2016",
                        "Gain a strong foundation of Arduino-based device development, from which you can go in any direction according to your specific development needs and desires. You'll build Arduino-powered devices for everyday use, and then connect those devices to the Internet." },
                { "A Programmer's Guide to the Mind", "Lorin Friesen", "2010",
                        "This book is a Programmer‟s Guide to the Mind. In it, we will attempt to do two things: We will try to explain how the mind works, and we will." },
                { "SEO: Search Engine Optimization Bible", "Jerri Ledford", "2008",
                        "This in-depth Bible delivers the holy grail of online marketing: how to influence search engine results to drive online shoppers to specific Web sites; the process is called search engine optimization" },
                { "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "2015",
                        "Elon Musk spotlights the technology and vision of Elon Musk, the renowned entrepreneur and innovator behind SpaceX, Tesla, and SolarCity, who sold one of his Internet companies, PayPal, for $1.5 billion." },
                { "Steve Jobs", "Walter Isaacson", "2011",
                        "Steve Jobs, a renowned businessman, faces problems in his personal and professional life while trying to launch three products in the market." }
        };

        // filsafat
        String[][] bukuFilsafat = {
                { "Filsafat umum", "Asmoro Ahmadi", "2001",
                        "Buku ini mencoba memberikan pemahaman yang luas dan utuh mengenai disiplin filsafat serta membantu pembaca untuk memahami dan mengapresiasi berbagai macam gagasan filsafat." },
                { "Filosofi Teras", "Henry Manampiring", "2018",
                        "Filosofi Teras, diawali dengan menceritakan tentang sebuah survei kekhawatiran nasional yang semakin masif sekaligus menyajikan tentang sekilas kehidupan si penulis yang dipenuhi oleh emosi negatif yang berlebihan." },
                { "Filsafat sebagai ilmu kritis", "Franz Magnis-Suseno", "1992",
                        "Filsuf harus selalu kritis, bertanya dan mencari jawaban-jawaban rasional. Berfilsafat dengan demikian merupakan berpikir kritis; selalu harus bertanya secara fundamental dan mencari jawaban rasional." },
                { "Pengantar filsafat hukum", "Ira Rasjidi", "2002",
                        "Buku ini membahas tentang filsafat hukum secara umum, mulai dari konsep dasar filsafat, hubungannya dengan hukum, hingga penerapan filsafat dalam memahami berbagai isu hukum yang kompleks. " },
                { "Melampaui Baik dan Jahat", "Friedrich Nietzsche", "1886",
                        "Dalam Melampaui Baik dan Jahat, Nietzsche mengkritik filsuf pada masa lalu karena kurangnya rasa kritis dan penerimaan yang buta terhadap premis Kekristenan." }
        };

        // sejarah
        String[][] bukuSejarah = {
                { "1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "2005",
                        "In 1491, Charles Mann's reviews previously held archeological beliefs that indicated that Early American peoples had walked across the Bering Strait about 12,000 years ago. They moved south and formed roving bands of people who did not leave a significant impact on the land." },
                { "Guns, Germs, and Steel", "Jared Diamond", "1997",
                        "traces humanity's journey over the last 13,000 years – from the dawn of farming at the end of the last Ice Age to the realities of life in the twenty-first century." },
                { "1776", "David McCullough", "2005",
                        "The nation's fathers harmonize their way through the founding of America in this musical adapted from a popular Broadway show. Colonial representatives gather in Philadelphia with the aim of establishing a set of governmental rules for the burgeoning United States." },
                { "The Guns of August", "Barbara W. Tuchman", "1962",
                        "renowned historian Barbara W. Tuchman re-creates the first month of World War I: thirty days in the summer of 1914 that determined the course of the conflict, the century, and ultimately our present world." },
                { "Postwar: A History of Europe Since 1945", "Tony Judt", "2005",
                        "Postwar is the first modern history that covers all of Europe, both east and west, drawing on research in six languages to sweep readers through thirty-four nations and sixty years of political and cultural change-all in one integrated, enthralling narrative." }
        };

        // Agama
        String[][] bukuAgama = {
                { "The God Delusion", "Richard Dawkins", "2006",
                        "In The God Delusion, Dawkins contends that a supernatural creator, God, almost certainly does not exist, and that belief in a personal god qualifies as a delusion, which he defines as a persistent false belief held in the face of strong contradictory evidence." },
                { "Mere Christianity", "C.S. Lewis", "1942",
                        "Lewis aims to prove to the sensible skeptic that God does exist and that He sent His son Jesus Christ to redeem the world. " },
                { "God Is Not Great: How Religion Poisons Everything", "Christopher Hitchens", "2007",
                        "God Is Not Great: How Religion Poisons Everything, written in 2007 by English American author Christopher Hitchens, is a multi-faceted exploration of religion as a negative force in the world. The book's central thesis is that religious belief is ultimately more damaging than beneficial." },
                { "A History of God: The 4,000-Year Quest of Judaism, Christianity, and Islam", "Karen Armstrong",
                        "1993", "It details the history of the three major monotheistic traditions, Judaism, Christianity and Islam, along with some details on Buddhism and Hinduism." },
                { "Siddhartha", "Hermann Hesse", "1992",
                        "In his new wanderings, Siddhartha meets a friendly ferryman, fully content with his simple life. Siddhartha crosses the ferryman's river and comes to a city." }
        };

        // Psikologi
        String[][] bukuPsikologi = {
                { "Thinking, Fast and Slow", "Daniel Kahneman", "2011",
                        "Thinking Fast And Slow shows you how two systems in your brain are constantly fighting over control of your behavior and actions, and teaches you the many ways in which this leads to errors in memory, judgment and decisions, and what you can do about it." },
                { "The Happiness Hypothesis", "Jonathan Haidt", "2006",
                        "It says that we draw much more happiness from working towards a goal, rather than reaching it. So try to find meaningful work you're good at – as Confucius says: “Choose a job you love, and you will never have to work a day in your life.”" },
                { "Influence: Science and Practice", "Robert Cialdini", "1984",
                        "The key premise of the book is that in a complex world where people are overloaded with more information than they can deal with, people fall back on a decision making approach based on generalizations." },
                { "Predictably Irrational", "Dan Ariely", "2008",
                        "Predictably Irrational explains the hidden forces that really drive how we make decisions, which are far less rational than we think, but can help us stay on top of our finances, interact better with others and live happier lives, once we know about them." },
                { "Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "2005",
                        "Blink is a book about how we think without thinking, about choices that seem to be made in an instant-in the blink of an eye-that actually aren't as simple as they seem. Why are some people brilliant decision makers, while others are consistently inept?" }
        };

        // Politik
        String[][] bukuPolitik = {
                { "The Communist Manifesto", "karl Marx", "1848",
                        "It formed the basis for the modern communist movement as we know it, arguing that capitalism would inevitably self-destruct, to be replaced by socialism and ultimately communism." },
                { "Animal Farm", "George Orwell", "1945",
                        "It tells the story of a group of farm animals who rebel against their human farmer, hoping to create a society where the animals can be equal, free, and happy." },
                { "On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", "2017",
                        "On Tyranny is a call to arms and a guide to resistance, with invaluable ideas for how we can preserve our freedoms in the uncertain years to come." },
                { "The Shock Doctrine: The Rise of Disaster Capitalism", "Naomi Klein", "2007",
                        "The Conclusion details the backlash against the 'shock doctrine' and economic institutions which, in Klein's view, encourage it – like the World Bank and IMF. South America and Lebanon post-2006 are shown in a positive light, where politicians are already rolling back free-market policies, with some mention of the increased campaigning by community-minded activists in South Africa and China." },
                { "Fire and Fury: Inside the Trump White House", "Michael Wolff", "2018",
                        "Fire and Fury: Inside the Trump White House is a 2018 book by journalist Michael Wolff which according to Wolff, details the behavior of U.S. President Donald Trump, the staff of his 2016 presidential campaign, and the White House staff. The title refers to a quote by Trump about the conflict with North Korea." },
        };

        // Fiksi
        String[][] bukuFiksi = {
                { "Lessons in Chemistry", "Bonnie Garmus", "2022",
                        "Lessons in Chemistry follows Elizabeth Zott: a one-of-a-kind scientist in 1960s California whose career takes a detour when she becomes the unlikely star of a beloved TV cooking show." },
                { "Trust", "Hernan Diaz", "2022",
                        "What is the summary of Trust? trust, In law, a relationship between parties in which one, the trustee or fiduciary, has the power to manage property, and the other, the beneficiary, has the privilege of receiving the benefits from that property." },
                { "Beloved", "Toni Morrison", "1987",
                        "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Dolores, officiis?" },
                { "It Ends with Us", "Colleen Hoover", "2016",
                        "The work examines the destructive legacy of slavery as it chronicles the life of a Black woman named Sethe, from her pre-Civil War days as a slave in Kentucky to her time in Cincinnati, Ohio, in 1873." },
                { "Pride and Prejudice", "Jane Austen", "2013",
                        "Pride and Prejudice follows the turbulent relationship between Elizabeth Bennet, the daughter of a country gentleman, and Fitzwilliam Darcy, a rich aristocratic landowner." }
        };

        byte pilih = 9;

        do {
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

            switch (pilih) {
                case 1:
                    cetakTulisan(bukuTeknologi, "Teknologi");
                    copyBuku(bukuTeknologi, "Teknologi");
                    break;
                case 2:
                    cetakTulisan(bukuFilsafat, "Filsafat");
                    copyBuku(bukuFilsafat, "Filsafat");
                    break;
                case 3:
                    cetakTulisan(bukuSejarah, "Sejarah");
                    copyBuku(bukuSejarah, "Sejarah");
                    break;
                case 4:
                    cetakTulisan(bukuAgama, "Agama");
                    copyBuku(bukuAgama, "Agama");
                    break;
                case 5:
                    cetakTulisan(bukuPsikologi, "Psikologi");
                    copyBuku(bukuPsikologi, "Psikologi");
                    break;
                case 6:
                    cetakTulisan(bukuPolitik, "Politik");
                    copyBuku(bukuPolitik, "Politik");
                    break;
                case 7:
                    cetakTulisan(bukuFiksi, "Fiksi");
                    copyBuku(bukuFiksi, "Fiksi");
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Gak ada di pilihan :(((, silakan pilih antara 1-8!");
            }
        } while (pilih != 9);

        input.close();
    }

    static void cetakTulisan(String[][] data, String kategoriBuku) {
        Buku buku = new Buku();
        
        buku.setKategori(kategoriBuku);

        for (int i = 0; i < data.length; i++) {
            buku.setJudul(data[i][0]);
            buku.setPenulis(data[i][1]);
            buku.setTahunTerbit(data[i][2]);
            buku.setSinopsis(data[i][3]);
            buku.display();
        }
    }

    public static void copyBuku (String[][] data, String kategoriBuku){
        Buku buku = new Buku();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku yang akan dicopy: ");
        String judulAwal = input.nextLine();
        int index = buku.cariBuku(judulAwal, data);

        Buku bukuCopy = new Buku(data[index][0], data[index][1], data[index][2], kategoriBuku, data[index][3]);

        System.out.println("==========Hasil copy buku baru==========");
        bukuCopy.display();
    }      
}