package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class loa {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public final loa a(String str, double d, double d2) {
        int i = 0;
        while (i < this.a.size()) {
            double doubleValue = ((Double) this.c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.a.add(i, str);
        this.c.add(i, Double.valueOf(d));
        this.b.add(i, Double.valueOf(d2));
        return this;
    }

    public final kqa b() {
        return new kqa(this, null);
    }
}
