public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to this Adoption Center!");

        //Create a dog
        Dog dog = new Dog("pepe", "Bulldog", 6.0,2020, false);
        System.out.println("Please check the information of the dog you have chosen.");
        System.out.println("Name: " + dog.getInternalName() + " Breed: " + dog.getBreed() + " Year of birth: " + dog.getBirthYear() + " Weight: " + dog.getWeight());
        System.out.println("Can this dog be adopted? " + dog.toBeAdopted());
    }
}