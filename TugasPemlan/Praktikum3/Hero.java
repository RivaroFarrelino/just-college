package TugasPemlan.Praktikum3;
//a
public class Hero {
    private String name;
    private double health;
    private double attackDamage;
    private double defence;

    Hero(){

    }

    Hero(String name, double health, double attackDamage, double defence){
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.defence = defence;
    }

    void attack(Hero musuh){
        double attackDamage = this.attackDamage;
        System.out.println(this.name + " menyerang " + musuh.name + " sebesar " + attackDamage);
        musuh.defence(attackDamage);
    }

    void defence(double attackDamage){
        double damage;
        // menghitung damage yang diterima
        if(this.defence < attackDamage){
            damage = attackDamage - this.defence;
        } else {
            damage = 0;
        }
        this.health -= damage;

        if(this.health <= 0){
            this.health = 0;
        }
        
        System.out.println(this.name + " menerima damage sebanyak " + damage);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(double health) {
        this.health = health;
    }

    public double getHp() {
        return health;
    }

    public void setAttack(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttack() {
        return attackDamage;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getDefence() {
        return defence;
    }

    void display(){
        System.out.println("\nHero name\t: " + this.name);
        System.out.println("HP\t\t: " + this.health);
        System.out.println("Attack\t\t: " + this.attackDamage);
        System.out.println("Defence\t\t: " + this.defence);
    }
}
