package Lesson8;

import Lesson8a.Engine;
import Lesson8b.Driver;

public class Lorry extends Car {
    int maxmassa;

    public Lorry(String marka, String classAvto, int vesAvto, Driver voditel, Engine motor, int maxmassa) {
        super(marka, classAvto, vesAvto, voditel, motor);
        this.maxmassa = maxmassa;
    }

    public int getMaxmassa() {
        return maxmassa;
    }

    public void setMaxmassa(int maxmassa) {
        this.maxmassa = maxmassa;
    }
}
