public class Witch extends Enemy {
    public Witch(String nama) {
        super(nama);
    }

    @Override
    public void move() {
        System.out.println(getNama() + " bergerak dengan sihir gelap.");
    }
}
