package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.l1;
import com.google.android.gms.internal.ads.m1;
import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class zha extends cia {
    private final View i;

    public zha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, View view) {
        super(jgaVar, "a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", u0Var, i, 57);
        this.i = view;
    }

    @Override // defpackage.cia
    protected final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) pla.c().a(mpa.k3);
            Boolean bool2 = (Boolean) pla.c().a(mpa.ua);
            nga ngaVar = new nga((String) this.f.invoke(null, this.i, this.b.b().getResources().getDisplayMetrics(), bool, bool2));
            l1 L = m1.L();
            L.o(ngaVar.b.longValue());
            L.q(ngaVar.c.longValue());
            L.r(ngaVar.d.longValue());
            if (bool2.booleanValue()) {
                L.p(ngaVar.f.longValue());
            }
            if (bool.booleanValue()) {
                L.n(ngaVar.e.longValue());
            }
            this.e.N((m1) L.i());
        }
    }
}
