package Animal;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise(){
        System.out.println("Такое-то животное шумить");
    }
    void eat(){
        System.out.println("Такое-то животное есть");
    }
    void sleep(){
        System.out.println("Такое-то животное спить");
    }
}
