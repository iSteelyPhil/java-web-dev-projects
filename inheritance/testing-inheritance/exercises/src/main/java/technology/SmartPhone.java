package technology;

public class SmartPhone extends Computer {
    private Boolean hasIOS;

    public SmartPhone(String brand, int storage, int ram, Boolean hasIOS) {
        super(brand, storage, ram);
        this.hasIOS = hasIOS;
    }

    public void callCell(int number){
        System.out.println("Calling"+number+"...");
    }
}
