public class Feeder {

    public Feeder(int c) {
        currentFood = c;
    }
    public Feeder() {}
    public int getCurrentFood()
    {
        return currentFood;
    }
    private int currentFood;
    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05) currentFood = 0;
        else
        {
            int eaten = (int) (Math.random() * 41 + 10);
            currentFood -= eaten * numBirds;
            if(currentFood < 0) currentFood = 0;

        }
    }
    public int simulateManyDays(int numBirds, int numDays)
    {
        return 0;
    }

}
