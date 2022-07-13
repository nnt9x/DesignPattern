package diagram;

public class HinhTru {
    private double chieuCao;
    // Composition
    private final HinhTron day;

    public HinhTru(double chieuCao, HinhTron day) {
        this.chieuCao = chieuCao;
        this.day = day;
    }

    public HinhTru(double chieuCao, double banKinh) {
        this.chieuCao = chieuCao;
        this.day = new HinhTron(banKinh);
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public HinhTron getDay() {
        return day;
    }

    public double theTich() {
        return day.dienTich() * chieuCao;
    }

    public double dienTichXungQuanh() {
        return day.chuVi() * chieuCao;
    }

    public double dienTichToanPhan() {
        return dienTichXungQuanh() + 2 * day.dienTich();
    }
}
