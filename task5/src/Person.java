import javax.lang.model.type.NullType;

public class Person {
    private final String name;
    private int age;
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal animal) {
        this.animal = animal;
    }
    
    public void removePet() {
        this.animal = null;
    }
    
    public boolean hasPet() {
        return this.animal != null;
    }
    
    public void getOccupation(Person occupator) {
        occupator.assignPet(this.animal);
        this.removePet();
    }
    
    public String toString() {
        return this.name + " " + this.age;
    }
}
