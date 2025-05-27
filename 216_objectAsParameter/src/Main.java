public class Main {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("iphone","apple",1000);
        Smartphone sm2 = new Smartphone("V3","Honor",500);
        Smartphone sm3 = new Smartphone(sm2);

        sm3.applyDiscount(60);

        sm1.applyDiscount(10);
        sm1.comparePrice(sm2);

        sm2.displayDetails();
        sm3.displayDetails();
    }
}