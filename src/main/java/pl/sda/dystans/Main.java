package pl.sda.dystans;

public class Main {

    public static void main(String[] args) {

            Point punkt1 = new Point(3,4);
            Point punkt2 = new Point (6,7);

            double Dystans;

            System.out.println("Odegłość od punktu1 do punktu2, to: " + punkt1.Dystans(punkt2));
    }
}
