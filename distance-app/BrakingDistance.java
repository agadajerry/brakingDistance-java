import java.util.Scanner; //Scanner to use the input value from use//

public class BrakingDistance {
    private static Scanner sc;

    /* program to calculate the braking distance */
    public static Double distance(Double initVelocity, Double initTime) {

        final Double FRICTION = 0.7;
        final Double GRAVITY = 9.81;

        // vt + v*v/2ug
        Double ug = 2 * FRICTION * GRAVITY;
        Double vv = (initVelocity * initVelocity);
        Double vt = (initVelocity * initTime);
        Double initDistance = (vt + vv / ug);

        return initDistance;
    }

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        while (true) {

            System.out.println("ENTER INITIAL VELOCITY");
            double velocity = sc.nextDouble();
            System.out.println("ENTER TIME");
            double time = sc.nextDouble();

            if (velocity < -1 || time < -1) {
                System.out.println("Enter A valid value");
                System.out.println("ENTER INITIAL VELOCITY");
                velocity = sc.nextDouble();
                System.out.println("ENTER TIME");
                time = sc.nextDouble();
            } else {

                System.out.print("Braking distance 1: ");

                BrakingDistance bd = new BrakingDistance();

                System.out.print(bd.distance(velocity, time) + "m");

                break;
            }
        }

    }
}