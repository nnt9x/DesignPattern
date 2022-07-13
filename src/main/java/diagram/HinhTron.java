package diagram;

public class HinhTron implements HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
