public class SmartDevice {
    String brand;
    String model;
    int batteryLife = 0;
    boolean isConnected = false;

    // Default Constructor
    public SmartDevice(){
        System.out.println("SmartDevice created!");
        brand = "Unknown";
        model = "Unknown";
    }
    // Parameterized Constructor
    public SmartDevice(String myBrand, String myModel){
        System.out.println("SmartDevice created!" + myBrand + myModel);
        this.brand = myBrand;
        this.model = myModel;
    }

    // Member methods
    void connect(){
        System.out.println("Connecting device");
        isConnected = true;
    }
    void disconnect(){
        System.out.println("Disconnecting device");
        isConnected = false;
    }
}
