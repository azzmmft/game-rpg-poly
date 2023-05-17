public class Fighter extends Hero {
    public Fighter(String nama) {
        super(nama);
    }

    @Override
    public void move() {
        System.out.println(getNama() + " bergerak dengan penuh keberanian.");
    }
}
