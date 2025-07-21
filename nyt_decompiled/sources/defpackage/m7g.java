package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class m7g {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, o7g o7gVar) {
        c(o7gVar);
        this.a.add(new k7g(handler, o7gVar));
    }

    public final void b(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            final k7g k7gVar = (k7g) it2.next();
            z = k7gVar.c;
            if (!z) {
                handler = k7gVar.a;
                handler.post(new Runnable() { // from class: i7g
                    @Override // java.lang.Runnable
                    public final void run() {
                        o7g o7gVar;
                        o7gVar = k7g.this.b;
                        o7gVar.L(i, j, j2);
                    }
                });
            }
        }
    }

    public final void c(o7g o7gVar) {
        o7g o7gVar2;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            k7g k7gVar = (k7g) it2.next();
            o7gVar2 = k7gVar.b;
            if (o7gVar2 == o7gVar) {
                k7gVar.c();
                this.a.remove(k7gVar);
            }
        }
    }
}
