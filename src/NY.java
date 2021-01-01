public class NY extends City{


    @Override
    public int TotalCost(int numberOfFeet) {
        return numberOfFeet * 300;
    }

    @Override
    public void update(Object obj) {
        System.out.println("New York cost: " + TotalCost((Integer) obj));
    }
}