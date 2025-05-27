public class Device {
    String brand;
    String model;


    public Device(String brande, String model){
        this.brand = brande;
        this.model = model;
    }

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
