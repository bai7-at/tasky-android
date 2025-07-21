package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class uvd {
    private final acd a;
    private final kod b;
    private final qtd c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    private boolean h;
    private boolean i;

    public uvd(Looper looper, acd acdVar, qtd qtdVar) {
        this(new CopyOnWriteArraySet(), looper, acdVar, qtdVar, true);
    }

    public static /* synthetic */ boolean g(uvd uvdVar, Message message) {
        Iterator it2 = uvdVar.d.iterator();
        while (it2.hasNext()) {
            ((rud) it2.next()).b(uvdVar.c);
            if (uvdVar.b.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void h() {
        if (this.i) {
            wad.f(Thread.currentThread() == this.b.zza().getThread());
        }
    }

    public final uvd a(Looper looper, qtd qtdVar) {
        return new uvd(this.d, looper, this.a, qtdVar, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new rud(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        h();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.zzg(0)) {
            kod kodVar = this.b;
            kodVar.c(kodVar.zzb(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final void d(final int i, final srd srdVar) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: rqd
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    srd srdVar2 = srdVar;
                    ((rud) it2.next()).a(i, srdVar2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((rud) it2.next()).c(this.c);
        }
        this.d.clear();
    }

    public final void f(Object obj) {
        h();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            rud rudVar = (rud) it2.next();
            if (rudVar.a.equals(obj)) {
                rudVar.c(this.c);
                this.d.remove(rudVar);
            }
        }
    }

    private uvd(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, acd acdVar, qtd qtdVar, boolean z) {
        this.a = acdVar;
        this.d = copyOnWriteArraySet;
        this.c = qtdVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = acdVar.a(looper, new Handler.Callback() { // from class: ppd
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                uvd.g(uvd.this, message);
                return true;
            }
        });
        this.i = z;
    }
}
