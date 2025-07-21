package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class dzf extends nyf {
    private final HashMap h = new HashMap();
    private Handler i;
    private f6f j;

    protected dzf() {
    }

    protected abstract void A(Object obj, b0g b0gVar, n1c n1cVar);

    protected final void B(final Object obj, b0g b0gVar) {
        wad.d(!this.h.containsKey(obj));
        a0g a0gVar = new a0g() { // from class: ryf
            @Override // defpackage.a0g
            public final void a(b0g b0gVar2, n1c n1cVar) {
                dzf.this.A(obj, b0gVar2, n1cVar);
            }
        };
        syf syfVar = new syf(this, obj);
        this.h.put(obj, new tyf(b0gVar, a0gVar, syfVar));
        Handler handler = this.i;
        handler.getClass();
        b0gVar.g(handler, syfVar);
        Handler handler2 = this.i;
        handler2.getClass();
        b0gVar.k(handler2, syfVar);
        b0gVar.i(a0gVar, this.j, o());
        if (y()) {
            return;
        }
        b0gVar.e(a0gVar);
    }

    protected int C(Object obj, int i) {
        return 0;
    }

    protected long D(Object obj, long j, zzf zzfVar) {
        return j;
    }

    protected abstract zzf E(Object obj, zzf zzfVar);

    @Override // defpackage.nyf
    protected final void t() {
        for (tyf tyfVar : this.h.values()) {
            tyfVar.a.e(tyfVar.b);
        }
    }

    @Override // defpackage.nyf
    protected final void u() {
        for (tyf tyfVar : this.h.values()) {
            tyfVar.a.f(tyfVar.b);
        }
    }

    @Override // defpackage.nyf
    protected void v(f6f f6fVar) {
        this.j = f6fVar;
        this.i = khe.L(null);
    }

    @Override // defpackage.nyf
    protected void x() {
        for (tyf tyfVar : this.h.values()) {
            tyfVar.a.m(tyfVar.b);
            tyfVar.a.n(tyfVar.c);
            tyfVar.a.c(tyfVar.c);
        }
        this.h.clear();
    }

    @Override // defpackage.b0g
    public void z() {
        Iterator it2 = this.h.values().iterator();
        while (it2.hasNext()) {
            ((tyf) it2.next()).a.z();
        }
    }
}
