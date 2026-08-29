import java.util.ArrayList;
import java.util.List;

public class Demo12 {
    public static void main(String[] args) {
        // List<Dog> dogs = new ArrayList<>();
        // dogs.add(new Dog());
        // dogs.add(new Dog());

        // fun(dogs);  -> Not Allowed

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);

    }

    // public static void fun(List<Animal> animals)
    // {
    //     for(Animal animal:animals)
    //     {
    //         animal.eat();
    //     }
    // }

    // making this method generic using wildcard
    public static void fun(List<?> values)
    {
        for(Object obj:values)
        {
           System.out.println(obj.getClass());
        }
    }
}


class Animal
{
    void eat()
    {
        System.out.println("Animal is Eating!");
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