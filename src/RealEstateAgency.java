import java.util.ArrayList;
import java.util.List;

public class RealEstateAgency implements Subject{

    private int numberOfFeet;
    private ArrayList<City> cities = new ArrayList<>();

    public int getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(int numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }

    @Override
    public void attach(Object city) {
        cities.add((City) city);
    }

    @Override
    public void detach(Object city) {
        cities.remove((City) city);
    }

    @Override
    public void Notify (){

        for (City city : cities) {
            city.update(this.numberOfFeet);
        }
    }
}