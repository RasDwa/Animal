package Lesson8;

import Lesson8a.Engine;
import Lesson8b.Driver;

public class Car {
    String marka;
    String classAvto;
    int vesAvto;
    Driver voditel;
    Engine motor;

    public Car(String marka, String classAvto, int vesAvto, Driver voditel, Engine motor) {
        this.marka = marka;
        this.classAvto = classAvto;
        this.vesAvto = vesAvto;
        this.voditel = voditel;
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getClassAvto() {
        return classAvto;
    }

    public void setClassAvto(String classAvto) {
        this.classAvto = classAvto;
    }

    public int getVesAvto() {
        return vesAvto;
    }

    public void setVesAvto(int vesAvto) {
        this.vesAvto = vesAvto;
    }

    public Driver getVoditel() {
        return voditel;
    }

    public void setVoditel(Driver voditel) {
        this.voditel = voditel;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    void start(){
        System.out.println("Поехали");
    }
    void stop(){
        System.out.println("Останавливаемся");
    }
    void turnRight(){
        System.out.println("Поворот направо");
    }
    void turnLeft(){
        System.out.println("Поворот налево");
    }
    void printInfo(){
        System.out.println(marka+" "+classAvto+" "+vesAvto+" "+voditel.getFIO()+" "+motor.getProizvoditel()+" ");
    }

    public static void main(String[] args) {
        //Car car = new Car("BMW","sedan",2500,);
    }


}
