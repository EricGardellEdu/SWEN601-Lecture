package session07;

public class Dog {
    String Breed;
    int Age;
    String Name;
    double Weight;
    String Gender;

    public Dog() {
        Breed   = "Doodle";
        Age     = 3;
        Name    = "Barkley";
        Weight  = 25;
        Gender  = "Male";
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1.Name+" is a "+dog1.Gender+" "+dog1.Breed+" that is "+dog1.Age+" years old and weighs "+dog1.Weight+" lbs.");
        System.out.println(dog2.Name+" is a "+dog2.Gender+" "+dog2.Breed+" that is "+dog2.Age+" years old and weighs "+dog2.Weight+" lbs.");
    }
}


