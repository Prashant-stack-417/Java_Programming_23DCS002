import java.util.*;

public class Practical3 {
    public static void main(String[] args) {
        float d, h, m, s, speed1, speed2, speed3, th, ts;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the distance(in meters):");
        d = x.nextFloat();
        System.out.print("Enter the time taken as hours:");
        h = x.nextFloat();
        System.out.print("Enter the time taken as minutes:");
        m = x.nextFloat();
        System.out.print("Enter the time taken as seconds:");
        s = x.nextFloat();
        th = h + (m / 60) + (s / (60 * 60));
        ts = s + (m * 60) + (h * (60 * 60));
        // km/h
        speed1 = d / (th * 1000);
        // miles/h
        speed2 = d / (th * 1609);
        // m/s
        speed3 = d / ts;
        System.out.println("Speed in km/h=" + speed1);
        System.out.println("Speed in miles/h=" + speed2);
        System.out.println("Speed in meter/s=" + speed3);
        x.close();
    }
}