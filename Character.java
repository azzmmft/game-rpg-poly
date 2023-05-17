public class Character {
    private String nama;

    public Character(String nama) {
        this.nama = nama;
    }

    public void move() {
        System.out.println(nama + " bergerak.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
