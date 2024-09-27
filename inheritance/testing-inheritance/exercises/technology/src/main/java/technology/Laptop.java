package technology;

public class Laptop extends Computer {
    private double resolution;

    public Laptop(String brand, int storage, int ram, double resolution) {
        super(brand, storage, ram);
        this.resolution = resolution;
    }

    public void closeLaptop(){
        System.out.println("Laptop is closed.");
    }
}
