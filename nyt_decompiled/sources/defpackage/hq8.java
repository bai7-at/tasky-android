package defpackage;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.z1;

/* loaded from: classes2.dex */
public abstract class hq8 {
    private a a;
    private l40 b;

    public interface a {
        void a(z1 z1Var);

        void b();
    }

    protected final l40 b() {
        return (l40) ur.i(this.b);
    }

    public abstract a2.a c();

    public void d(a aVar, l40 l40Var) {
        this.a = aVar;
        this.b = l40Var;
    }

    protected final void e() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void f(z1 z1Var) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(z1Var);
        }
    }

    public abstract boolean g();

    public abstract void h(Object obj);

    public void i() {
        this.a = null;
        this.b = null;
    }

    public abstract jq8 j(a2[] a2VarArr, wp8 wp8Var, o.b bVar, g2 g2Var);

    public abstract void k(com.google.android.exoplayer2.audio.a aVar);
}
