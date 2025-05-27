public class Smartphone {
    private String model;
    private String brand;
    private double price;

    //Copy Constructor
    public Smartphone(Smartphone mySmartphone){
        this.model = mySmartphone.model;
        this.brand = mySmartphone.brand;
        this.price = mySmartphone.price;
    }
    // Parameterized Constructor
    public Smartphone(String model, String brand, double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage){
        this.price -= this.price*(discountPercentage/100);
    }

    public void comparePrice(Smartphone otherSmartphone){
        if (this.price < otherSmartphone.price){
            System.out.println(this.model + " is cheaper than " + otherSmartphone.model);
        } else if (this.price > otherSmartphone.price) {
            System.out.println(this.model + " is expensive than " + otherSmartphone.model);
        } else {
            System.out.println(this.model + " is as expensive as " + otherSmartphone.model);
        }
    }

    public void displayDetails(){
        System.out.println("Model: "+ model);
        System.out.println("Brand: "+ brand);
        System.out.println("Price: "+ price);
    }


}
