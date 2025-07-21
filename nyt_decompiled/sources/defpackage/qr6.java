package defpackage;

import com.nytimes.android.external.store3.base.impl.StalePolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class qr6 {
    private js5 b;
    private wd2 c;
    private sp4 d;
    private final List a = new ArrayList();
    private StalePolicy e = StalePolicy.UNSPECIFIED;

    public qr6 a(wd2 wd2Var) {
        this.c = wd2Var;
        return this;
    }

    public qr6 b(sp4 sp4Var) {
        this.d = sp4Var;
        return this;
    }

    public qr6 c() {
        this.e = StalePolicy.NETWORK_BEFORE_STALE;
        return this;
    }

    public l28 d() {
        if (this.b == null) {
            this.b = l85.c(this.d);
        }
        if (this.a.isEmpty()) {
            e(new k85());
        }
        return new pr6(new br6(this.c, this.b, new ox4(this.a), this.d, this.e));
    }

    public qr6 e(bp5 bp5Var) {
        this.a.clear();
        this.a.add(new m65(bp5Var));
        return this;
    }

    public qr6 f(js5 js5Var) {
        this.b = js5Var;
        return this;
    }
}
