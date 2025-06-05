public class Laptop extends Computer {

    double weight;
    double screenSize;

    public Laptop(String brand, String model, int ram, int storage, double weight, double screenSize) {
        super(brand, model, ram, storage);
        this.weight = weight;
        this.screenSize = screenSize;
    }


    void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: "+ weight);
        System.out.println("Screen Size: "+ screenSize);

    }
}
