public class Main {
    public static void main(String[] args) {
        Car myToyota = new Car();
        myToyota.color = "Red";
        myToyota.model = "Etios";
        myToyota.year = 2022;

        Car myAudi = new Car();
        myAudi.color = "Black";
        myAudi.model = "A5";
        myAudi.year = 2020;
        myToyota.showDetails();


        System.out.println("My "+myAudi.model + " is "+ myAudi.color );
    }
}