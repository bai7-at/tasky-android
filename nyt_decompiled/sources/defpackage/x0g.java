package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class x0g {
    public final int a;
    public final zzf b;
    private final CopyOnWriteArrayList c;

    private x0g(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzf zzfVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = zzfVar;
    }

    public final x0g a(int i, zzf zzfVar) {
        return new x0g(this.c, 0, zzfVar);
    }

    public final void b(Handler handler, y0g y0gVar) {
        this.c.add(new j0g(handler, y0gVar));
    }

    public final void c(final vzf vzfVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            final y0g y0gVar = j0gVar.b;
            khe.k(j0gVar.a, new Runnable() { // from class: c0g
                @Override // java.lang.Runnable
                public final void run() {
                    y0gVar.T(0, x0g.this.b, vzfVar);
                }
            });
        }
    }

    public final void d(final mzf mzfVar, final vzf vzfVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            final y0g y0gVar = j0gVar.b;
            khe.k(j0gVar.a, new Runnable() { // from class: i0g
                @Override // java.lang.Runnable
                public final void run() {
                    y0gVar.B(0, x0g.this.b, mzfVar, vzfVar);
                }
            });
        }
    }

    public final void e(final mzf mzfVar, final vzf vzfVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            final y0g y0gVar = j0gVar.b;
            khe.k(j0gVar.a, new Runnable() { // from class: f0g
                @Override // java.lang.Runnable
                public final void run() {
                    y0gVar.A(0, x0g.this.b, mzfVar, vzfVar);
                }
            });
        }
    }

    public final void f(final mzf mzfVar, final vzf vzfVar, final IOException iOException, final boolean z) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            final y0g y0gVar = j0gVar.b;
            khe.k(j0gVar.a, new Runnable() { // from class: h0g
                @Override // java.lang.Runnable
                public final void run() {
                    y0gVar.R(0, x0g.this.b, mzfVar, vzfVar, iOException, z);
                }
            });
        }
    }

    public final void g(final mzf mzfVar, final vzf vzfVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            final y0g y0gVar = j0gVar.b;
            khe.k(j0gVar.a, new Runnable() { // from class: d0g
                @Override // java.lang.Runnable
                public final void run() {
                    y0gVar.o(0, x0g.this.b, mzfVar, vzfVar);
                }
            });
        }
    }

    public final void h(y0g y0gVar) {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            j0g j0gVar = (j0g) it2.next();
            if (j0gVar.b == y0gVar) {
                this.c.remove(j0gVar);
            }
        }
    }

    public x0g() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
