package diagram;

public class Calculator {
    // VD: tinh tong so nguyen
    public static double sum(double ...nums){
        double t = 0;
        for (double d: nums) {
            t += d;
        }
        return t;
    }

    public static double sum1(double[] nums){
        double t = 0;
        for (double d: nums) {
            t += d;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3,4,5,6));
        double[] data = {1,2,3,4};
        System.out.println(sum1(data));
    }

}
