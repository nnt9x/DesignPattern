package diagram;

public class Main {
    public static void main(String[] args) {
        HinhTron day = new HinhTron(4);
        System.out.println("Hinh tron: " + day.hashCode());
        HinhTru ht = new HinhTru(5, day);
        System.out.println("Hinh tru: " + ht.getDay().hashCode());
        System.out.println(ht.dienTichXungQuanh());
        System.out.println(ht.theTich());
    }
}
