package Lesson8;

import Lesson8a.Engine;
import Lesson8b.Driver;

public class Car {
    String marka;
    String classAvto;
    int vesAvto;
    Driver voditel;
    Engine motor;
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
        System.out.println(marka+" "+classAvto+" "+vesAvto+" "+voditel+" "+motor);
    }


}
