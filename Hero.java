public class Hero extends Character {
    public Hero(String nama) {
        super(nama);
    }

    public void move() {
        System.out.println(getNama() + " bergerak dengan kecepatan tinggi.");
    }

    public void move(String direction) {
        System.out.println(getNama() + " bergerak ke arah " + direction + ".");
    }
}
