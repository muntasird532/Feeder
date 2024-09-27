public class Main {
    public static void main(String[] args)
    {

        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));
        System.out.println(j);

        Feeder a = new Feeder(250);
        System.out.println(a.simulateManyDays(10, 5));
        System.out.println(a);

        Feeder b = new Feeder(0);
        System.out.println(b.simulateManyDays(5, 10));
        System.out.print(b);
    }
}

