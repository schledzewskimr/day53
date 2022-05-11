public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String toString() {
        return "\n" + name + " is a dog = " + isDog;
    }
}
