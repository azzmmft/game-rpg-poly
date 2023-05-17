public class Enemy extends Character {
    public Enemy(String nama) {
        super(nama);
    }

    public void move() {
        System.out.println(getNama() + " bergerak dengan strategi acak.");
    }

    public void move(int step) {
        System.out.println(getNama() + " bergerak sejauh " + step + " langkah.");
    }
}
