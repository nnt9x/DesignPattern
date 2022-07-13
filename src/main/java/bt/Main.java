package bt;

public class Main {
    public static void main(String[] args) {
        SoPhuc z1 = new SoPhuc(1, 1);
        SoPhuc z2 = new SoPhuc(3, 4);
        SoPhuc z3 = new SoPhuc(5, 6);
        System.out.println(z1.cong(z2));
        System.out.println(z1.tru(z2));
        System.out.println(z1.nhan(z2));
        System.out.println(z1.chia(z2));

        Calculator calculator = new Calculator();
        System.out.println(calculator.tong(z1,z2,z3));
        System.out.println(calculator.tich(z1,z2,z3));

    }
}
