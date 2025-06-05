public class Computer extends Device{
    int ram;
    int storage;

    public Computer(String brand, String model,int ram,int storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;

    }


    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM: "+ ram);
        System.out.println("RAM: "+ storage);
    }
}
