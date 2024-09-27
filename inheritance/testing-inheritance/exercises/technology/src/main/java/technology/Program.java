package technology;

public class Program {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Dell", 512, 16);
        myComputer.powerOn();

        Laptop myLatop = new Laptop("HP", 256, 16, 1280);
        myLatop.closeLaptop();

        SmartPhone myPhone = new SmartPhone("Iphone", 256, 4, true);
       myPhone.callCell("867-5309");
    }
}
