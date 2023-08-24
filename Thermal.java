import java.lang.Math;
import java.util.*;

public class Thermal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double li=sc.nextDouble(); double ld = sc.nextDouble(); double td = sc.nextDouble(); double alpha = 0;

        if (name.equals("aluminium")) {
            alpha = 2.31 * Math.pow(10,-5);
        } else if (name.equals("Copper")) {
            alpha = 1.70 * Math.pow(10,-5);
        } else if (name.equals("Glass")) {
            alpha = 8.50 * Math.pow(10,-5);
        } else if (name.equals("Steel")) {
            alpha = 1.20 * Math.pow(10,-5);
        } else {
            System.out.println("Enter correct name.");
            return; // exit the program if the name is incorrect
        }

        li = alpha * ld * td;
        System.out.println("Material name: " + name + ", ld = " + ld + ", li = "+li);
}
}