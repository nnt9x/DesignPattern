package bt;

public class Calculator {
    public SoPhuc tong(SoPhuc... soPhucs) {
        SoPhuc t = soPhucs[0];
        for (int i = 1; i < soPhucs.length; i++) {
            t = t.cong(soPhucs[i]);
        }
        return t;
    }
    public SoPhuc tich(SoPhuc... soPhucs) {
        SoPhuc t = soPhucs[0];
        for (int i = 1; i < soPhucs.length; i++) {
            t = t.nhan(soPhucs[i]);
        }
        return t;
    }
}
