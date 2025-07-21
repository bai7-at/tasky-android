package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d2e {
    private final v0e a;
    private final y0e b;
    private final a8d c;
    private final d8e d;
    private final q7e e;
    private final gwb f;

    public d2e(a8d a8dVar, d8e d8eVar, v0e v0eVar, y0e y0eVar, gwb gwbVar, q7e q7eVar) {
        this.a = v0eVar;
        this.b = y0eVar;
        this.c = a8dVar;
        this.d = d8eVar;
        this.f = gwbVar;
        this.e = q7eVar;
    }

    public final void a(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            b((String) it2.next(), 2);
        }
    }

    public final void b(String str, int i) {
        if (!this.a.j0) {
            this.d.c(str, this.e);
        } else {
            this.c.h(new c8d(dyf.b().currentTimeMillis(), this.b.b, str, i));
        }
    }

    public final void c(List list, int i) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            zb.r((((Boolean) pla.c().a(mpa.L9)).booleanValue() && gwb.h(str)) ? this.f.b(str, kia.e()) : zb.h(str), new c2e(this, i), pgb.a);
        }
    }
}
