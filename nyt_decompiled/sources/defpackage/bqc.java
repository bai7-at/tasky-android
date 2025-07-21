package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class bqc implements uxa {
    private final WeakReference a;
    private final String b;
    private final uxa c;
    final /* synthetic */ cqc d;

    /* synthetic */ bqc(cqc cqcVar, WeakReference weakReference, String str, uxa uxaVar, aqc aqcVar) {
        this.d = cqcVar;
        this.a = weakReference;
        this.b = str;
        this.c = uxaVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        Object obj2 = this.a.get();
        if (obj2 == null) {
            this.d.k(this.b, this);
        } else {
            this.c.a(obj2, map);
        }
    }
}
