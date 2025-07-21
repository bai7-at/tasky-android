package defpackage;

import android.view.View;
import com.google.android.gms.internal.pal.d0;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.o0;

/* loaded from: classes3.dex */
public final class xwd extends h0e {
    private final View i;

    public xwd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, View view) {
        super(kscVar, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", h3Var, i, 57);
        this.i = view;
    }

    @Override // defpackage.h0e
    protected final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) lee.c().b(fpe.D2);
            Boolean bool2 = (Boolean) lee.c().b(fpe.C8);
            zwc zwcVar = new zwc((String) this.f.invoke(null, this.i, this.b.b().getResources().getDisplayMetrics(), bool, bool2));
            d0 s = o0.s();
            s.l(zwcVar.b.longValue());
            s.n(zwcVar.c.longValue());
            s.o(zwcVar.d.longValue());
            if (bool2.booleanValue()) {
                s.m(zwcVar.f.longValue());
            }
            if (bool.booleanValue()) {
                s.k(zwcVar.e.longValue());
            }
            this.e.R((o0) s.g());
        }
    }
}
