package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class nyf implements b0g {
    private final ArrayList a = new ArrayList(1);
    private final HashSet b = new HashSet(1);
    private final x0g c = new x0g();
    private final ewf d = new ewf();
    private Looper e;
    private n1c f;
    private hpf g;

    @Override // defpackage.b0g
    public /* synthetic */ n1c H() {
        return null;
    }

    @Override // defpackage.b0g
    public /* synthetic */ boolean a() {
        return true;
    }

    @Override // defpackage.b0g
    public final void c(fwf fwfVar) {
        this.d.c(fwfVar);
    }

    @Override // defpackage.b0g
    public final void e(a0g a0gVar) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(a0gVar);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        t();
    }

    @Override // defpackage.b0g
    public final void f(a0g a0gVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(a0gVar);
        if (isEmpty) {
            u();
        }
    }

    @Override // defpackage.b0g
    public final void g(Handler handler, y0g y0gVar) {
        this.c.b(handler, y0gVar);
    }

    @Override // defpackage.b0g
    public abstract /* synthetic */ void h(cza czaVar);

    @Override // defpackage.b0g
    public final void i(a0g a0gVar, f6f f6fVar, hpf hpfVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        wad.d(z);
        this.g = hpfVar;
        n1c n1cVar = this.f;
        this.a.add(a0gVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(a0gVar);
            v(f6fVar);
        } else if (n1cVar != null) {
            f(a0gVar);
            a0gVar.a(this, n1cVar);
        }
    }

    @Override // defpackage.b0g
    public final void k(Handler handler, fwf fwfVar) {
        this.d.b(handler, fwfVar);
    }

    @Override // defpackage.b0g
    public final void m(a0g a0gVar) {
        this.a.remove(a0gVar);
        if (!this.a.isEmpty()) {
            e(a0gVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        x();
    }

    @Override // defpackage.b0g
    public final void n(y0g y0gVar) {
        this.c.h(y0gVar);
    }

    protected final hpf o() {
        hpf hpfVar = this.g;
        wad.b(hpfVar);
        return hpfVar;
    }

    protected final ewf p(zzf zzfVar) {
        return this.d.a(0, zzfVar);
    }

    protected final ewf q(int i, zzf zzfVar) {
        return this.d.a(0, zzfVar);
    }

    protected final x0g r(zzf zzfVar) {
        return this.c.a(0, zzfVar);
    }

    protected final x0g s(int i, zzf zzfVar) {
        return this.c.a(0, zzfVar);
    }

    protected void t() {
    }

    protected void u() {
    }

    protected abstract void v(f6f f6fVar);

    protected final void w(n1c n1cVar) {
        this.f = n1cVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a0g) arrayList.get(i)).a(this, n1cVar);
        }
    }

    protected abstract void x();

    protected final boolean y() {
        return !this.b.isEmpty();
    }
}
