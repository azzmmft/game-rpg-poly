public class App {
    public static void main(String[] args) {
        // Static polymorphism pada class Hero dan Enemy
        Hero hero = new Hero("Rapunzel");
        hero.move(); 
        hero.move("utara"); 

        Enemy enemy = new Enemy("Nenek Sihir Jahat");
        enemy.move(); 
        enemy.move(3); 

        System.out.println("===================================");

        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character1 = new Hero("Human");
        character1.move(); 

        Character character2 = new Enemy("Demon");
        character2.move(); 

        Character character3 = new Witch("Ness");
        character3.move(); 

        Character character4 = new Fighter("Zuma");
        character4.move(); 

        System.out.println("===================================");

        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character character5 = new Witch("Iblis");

        Fighter fighter = (Fighter) character5;
        fighter.move(); 
    }
}
