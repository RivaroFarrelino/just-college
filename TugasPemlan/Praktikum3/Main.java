package TugasPemlan.Praktikum3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Permainan adu hero");
        
        System.out.println("Silakan masukkan hero Anda");

        Hero hero1 = new Hero();
        System.out.print("Nama hero: ");
        hero1.setName(input.nextLine());
        System.out.print("Health: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Attack: ");
        hero1.setAttack(input.nextDouble());
        System.out.print("Defence: ");
        hero1.setDefence(input.nextDouble());

        input.nextLine();
        System.out.println("Silakan masukkan hero lawan");
        Hero hero2 = new Hero();
        System.out.print("Nama hero: ");
        hero2.setName(input.nextLine());
        System.out.print("Health: ");
        hero2.setHp(input.nextDouble());
        System.out.print("Attack: ");
        hero2.setAttack(input.nextDouble());
        System.out.print("Defence: ");
        hero2.setDefence(input.nextDouble());

        while(hero1.getHp() > 0 && hero2.getHp() > 0){
            int i = 1;
            System.out.println("\n================= War Round " + (i) + " =================");

            hero1.attack(hero2);
            hero1.display();
            hero2.display();
            if(hero2.getHp() <= 0){
                System.out.println();
                System.out.println(hero2.getName() + " MATI!");
                break;
            }
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
