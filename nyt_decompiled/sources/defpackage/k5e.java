package defpackage;

import com.google.android.gms.internal.ads.yb;
import com.google.android.gms.internal.ads.zb;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class k5e {
    private final Object a;
    private final List b;
    final /* synthetic */ x5e c;

    /* synthetic */ k5e(x5e x5eVar, Object obj, List list, j5e j5eVar) {
        this.c = x5eVar;
        this.a = obj;
        this.b = list;
    }

    public final w5e a(Callable callable) {
        kke kkeVar;
        yb b = zb.b(this.b);
        j64 a = b.a(new Callable() { // from class: i5e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, pgb.f);
        kkeVar = this.c.a;
        j64 a2 = b.a(callable, kkeVar);
        return new w5e(this.c, this.a, a, this.b, a2);
    }
}
