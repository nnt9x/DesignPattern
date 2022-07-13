package bt;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc cong(SoPhuc soPhuc) {
        double phanThuc = this.phanThuc + soPhuc.phanThuc;
        double phanAo = this.phanAo + soPhuc.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }

    public SoPhuc tru(SoPhuc soPhuc) {
        double phanThuc = this.phanThuc - soPhuc.phanThuc;
        double phanAo = this.phanAo - soPhuc.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }

    public SoPhuc nhan(SoPhuc soPhuc) {
        double phanThuc = this.phanThuc * soPhuc.phanThuc - this.phanAo * soPhuc.phanAo;
        double phanAo = this.phanThuc * soPhuc.phanAo + this.phanAo * soPhuc.phanThuc;
        return new SoPhuc(phanThuc, phanAo);
    }

    public SoPhuc chia(SoPhuc soPhuc) {
        double mau = Math.pow(soPhuc.phanThuc, 2) + Math.pow(soPhuc.phanAo, 2);
        double phanThuc = (this.phanThuc * soPhuc.phanThuc + this.phanAo * soPhuc.phanAo) / mau;
        double phanAo = (this.phanAo * soPhuc.phanThuc - this.phanThuc * soPhuc.phanAo) / mau;
        return new SoPhuc(phanThuc, phanAo);
    }

    @Override
    public String toString() {
        if(phanAo < 0){
            return String.format("%.2f %.2f i", phanThuc, phanAo);
        }
        return String.format("%.2f + %.2f i", phanThuc, phanAo);
    }
}
