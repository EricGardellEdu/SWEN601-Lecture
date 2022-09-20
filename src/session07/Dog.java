package session07;

public class Dog {
    String Breed;
    int Age;
    String Name;
    double Weight;
    String Gender;

    // Default Constructor
    public Dog() {
        Breed = "Doodle";
        Age = 3;
        Name = "DogName";
        Weight = 25;
        Gender = "Gender";

    }
    // Initializing Constructor
    public Dog(String Name, int Age) {
        this.Name    = Name;
        this.Age     = Age;
    }

    public Dog(String Breed, int Age, String Name) {
        this("Pluto", 5);
        this.Breed = Breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("doodle", 3, "Marley"); //, 25, "Male"
        Dog dog2 = new Dog("lab", 5, "Chloe"); //, 45, "Female"
        System.out.println(dog1.Name+" is a "+dog1.Gender+" "+dog1.Breed+" that is "+dog1.Age+" years old and weighs "+dog1.Weight+" lbs.");
        System.out.println(dog2.Name+" is a "+dog2.Gender+" "+dog2.Breed+" that is "+dog2.Age+" years old and weighs "+dog2.Weight+" lbs.");
    }
}


