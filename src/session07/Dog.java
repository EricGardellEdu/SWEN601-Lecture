package session07;

public class Dog {
    private String Breed;
    private int Age;
    private String Name;

    // Initializing Constructor
    public Dog(String Name, int Age) {
        this.Name    = Name;
        this.Age     = Age;
    }

    public Dog(String Breed, int Age, String Name) {
        this(Name, Age);
        this.Breed = Breed;
    }

    public void birthday() {
        this.Age ++;
        System.out.println("Congrats! "+this.Name+" turned "+this.Age+" years old");
    }

    public void breedSwap(String newBreed) {
        this.Breed = newBreed;
        System.out.println(this.Name+" is now a "+this.Breed);
    }

    // accessor method for Age
    public int getAge(){
        return this.Age;
    }

    // mutator method for Age
    public void setAge(int newAge) {
        this.Age = newAge;
    }

    public void setName(String newName) {
        this.Name = newName;
    }

    @Override
    public String toString() {
        return "Dog[ name:"+this.Name+" | Breed:"+this.Breed+" | Age:"+this.Age+" ]";
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("doodle", 3, "Marly"); //, 25, "Male"
        Dog dog2 = new Dog("lab", 5, "Chloe"); //, 45, "Female"
        dog1.setName("Marley");
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.birthday();
        dog2.breedSwap("Labradoodle");
        System.out.println(dog1.getAge());
        dog2.setAge(6);
    }
}


