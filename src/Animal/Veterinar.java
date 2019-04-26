package Animal;

public class Veterinar {
    static  void treatAnimal(Animal animal) {
        System.out.println(animal.getFood()+" "+animal.getLocation());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("milk", "house", "Bars");
        Horse horse = new Horse("sino", "zagon", "loshadka");
        Dog dog = new Dog("meat", "house", "Zychka");
        Animal[] animals = {cat, horse, dog};
        for (Animal pachientu : animals){
            treatAnimal(pachientu);
        }
    }

}
