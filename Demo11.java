import java.util.List;
import java.util.ArrayList;

public class Demo11 {
    public static void main(String[] args) {
        // Animal animal = new Dog();
        // animal.walk();
        // animal.eat();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animal = dogs;  -> will not work due to type safety

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();

        for(Animal animal:animals)
        {
            if (animal == null)
            {
                continue;
            }
            animal.eat();
        }

        
    }
}


class Animal
{
    void eat()
    {
        System.out.println("Animal is Sleeping!");
    }

    void walk()
    {
        System.out.println("Animal is Walking!");
    }
}


class Dog extends Animal
{
    void bark()
    {
        System.out.println("Animal is Barking!");
    }
}