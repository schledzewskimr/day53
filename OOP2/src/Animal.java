public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
    }

    public Animal() {
        
    }

    public String toString() {
        return "\n" + name + " is a dog = " + isDog;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsDog(boolean isDog) {
        this.isDog = isDog;
    }
}
