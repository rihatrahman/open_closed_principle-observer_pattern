/**
 * This Program lets users input number of square feet and get the total cost.
 */
public class Main {

    public static void main(String[] args) {

        RealEstateAgency rs = new RealEstateAgency();

        City newYork = new NY();
        City sanFrancisco = new SF();

        rs.attach(newYork);
        rs.attach(sanFrancisco);

        rs.setNumberOfFeet(1000);
        rs.Notify();
    }
}
