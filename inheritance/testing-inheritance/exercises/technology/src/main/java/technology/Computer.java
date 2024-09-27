package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private int storage;
    private int ram;

    public Computer(String brand, int storage, int ram) {
        super();
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    public void powerOn(){
        System.out.println("Computer is powering on.");
    }

    public void powerOff(){
        System.out.println("Computer is powering off");
    }
}