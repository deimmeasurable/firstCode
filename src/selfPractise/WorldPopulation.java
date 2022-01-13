package selfPractise;

public class WorldPopulation {
    public static void main(String[] args) {
        WorldPopulation population=new WorldPopulation();
        population.calculateWorldPopulation();
    }

    public void calculateWorldPopulation() {
        double currentPopulation = 7_900_000_000.00;
        double worldPopulation = 7_900_000_000.00;

        System.out.println("Year"+ "\t\t" + "CurrentWorldPopulation" + "\t\t" + "Numerical increase Yearly");

        for (int year = 1; year <=75 ; year++) {

            System.out.printf("%d\t\t\t%.2f\t\t\t\t\t",year,currentPopulation);
            currentPopulation += (currentPopulation * 0.0105);
            System.out.printf("%.2f%n",currentPopulation);

        }
        int year = 0;
           if(worldPopulation*2==currentPopulation){
            System.out.printf("the worldPopulation is %d",year);
       }
    }
}
