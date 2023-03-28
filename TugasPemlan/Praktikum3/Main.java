package TugasPemlan.Praktikum3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Permainan adu hero");
        
        System.out.println("Silakan masukkan hero Anda");

        Hero hero1 = new Hero();
        System.out.print("Nama hero\t: ");
        hero1.setName(input.nextLine());
        System.out.print("Health\t\t: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Attack\t\t: ");
        hero1.setAttack(input.nextDouble());
        System.out.print("Defence\t\t: ");
        hero1.setDefence(input.nextDouble());

        input.nextLine();
        System.out.println("Silakan masukkan hero lawan!!");
        Hero hero2 = new Hero();
        System.out.print("Nama hero\t: ");
        hero2.setName(input.nextLine());
        System.out.print("Health\t\t: ");
        hero2.setHp(input.nextDouble());
        System.out.print("Attack\t\t: ");
        hero2.setAttack(input.nextDouble());
        System.out.print("Defence\t\t: ");
        hero2.setDefence(input.nextDouble());

        int i = 0;
        while(hero1.getHp() > 0 && hero2.getHp() > 0){
            i++;
            System.out.println("\n================= War Round " + (i) + " =================");
            hero1.attack(hero2);
            hero1.display();
            hero2.display();
            if(hero2.getHp() <= 0){
                System.out.println();
                System.out.println(hero2.getName() + " MATI!");
                break;
            }
            System.out.println("\n================= War Round " + (i+1) + " =================");
            hero2.attack(hero1);
            hero1.display();
            hero2.display();
            if(hero1.getHp() <= 0){
                System.out.println();
                System.out.println(hero1.getName() + " MATI!");
                break;
            }
            i++;
        }

        System.out.println("Permainan berakhir.");
        input.close();
    }
}
