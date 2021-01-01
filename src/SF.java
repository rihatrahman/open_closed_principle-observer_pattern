public class SF extends City{


    @Override
    public int TotalCost(int numberOfFeet) {
        return numberOfFeet * 250;
    }

    @Override
    public void update(Object obj) {

        System.out.println("San Francisco cost: " + TotalCost((Integer) obj));
    }
}
