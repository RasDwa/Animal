package Animal;

public class Dog extends Animal {
    String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void makeNoise(){
        System.out.println(name+" животное шумить");
    }
    void eat(){
        System.out.println(name+" животное есть");
    }
}
