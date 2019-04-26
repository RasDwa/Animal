package Lesson8a;

public class Engine {
    int strong;
    String proizvoditel;

    public Engine(int strong, String proizvoditel) {
        this.strong = strong;
        this.proizvoditel = proizvoditel;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }
}
