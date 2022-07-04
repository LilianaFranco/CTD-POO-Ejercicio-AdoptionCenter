public class Dog {

    /*Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
    no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
    nombre de pila que le asignaron en la institución.
    Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
    —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
    lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.*/

    //Attributes
    private String internalName;
    private String breed;
    private Double weight;
    private int birthYear;
    private boolean haveChip;
    private boolean isInjured;

    //Constructor
    public Dog(String internalName, String breed, Double weight, int birthYear, boolean isInjured) {
        this.internalName = internalName;
        this.breed = breed;
        this.weight = weight;
        this.birthYear = birthYear;
        this.isInjured = isInjured;
    }

    //Getter and Setters


    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isHaveChip() {
        return haveChip;
    }

    public void setHaveChip(boolean haveChip) {
        this.haveChip = haveChip;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    //Methods
    public boolean canBeLost(){
        if(this.haveChip == true){
            return false;
        }
        return true;
    }

    public boolean toBeAdopted(){
        if (this.isInjured == false && this.weight>5){
            return true;
        }
        return false;
    }
}
