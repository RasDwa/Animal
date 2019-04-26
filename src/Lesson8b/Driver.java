package Lesson8b;

public class Driver extends Person {

    int stage;

    public Driver(String FIO, int stage) {
        super(FIO);
        this.stage = stage;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
