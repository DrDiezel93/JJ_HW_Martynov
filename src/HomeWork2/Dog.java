package HomeWork2;

public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void sound() {
        System.out.println("Aв-Aв!");
    }

    public void dogSit(){
        System.out.println("Бобик сел");
    }
}
