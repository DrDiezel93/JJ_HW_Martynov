package HomeWork2;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Бобик", 5, "Дворняга"),
                new Dog("Джони", 3, "Пират"),
                new Cat("Леопольд", 3, "Рыжий"),
                new Cat("Амур", 6, "Черный")
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("Кличка: " + animal.name);
            System.out.println("Возраст: " + animal.age);

            try {
//                Method method = animal.getClass().getMethod("makeSound");
                Method method = animal.getClass().getMethod("sound");
                method.invoke(animal);
            } catch (Exception e) {
//                System.out.println("Метод 'makeSound()' не найден.");
                System.out.println("Метод 'sound()' не найден.");
            }
            System.out.println();
        }
    }
}
