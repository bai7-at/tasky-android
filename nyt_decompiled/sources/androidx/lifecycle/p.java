package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.zq3;

/* loaded from: classes.dex */
public class p {
    private final h a;
    private final Handler b;
    private a c;

    public static final class a implements Runnable {
        private final h a;
        private final Lifecycle.Event b;
        private boolean c;

        public a(h hVar, Lifecycle.Event event) {
            zq3.h(hVar, "registry");
            zq3.h(event, "event");
            this.a = hVar;
            this.b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c) {
                return;
            }
            this.a.i(this.b);
            this.c = true;
        }
    }

    public p(d44 d44Var) {
        zq3.h(d44Var, "provider");
        this.a = new h(d44Var);
        this.b = new Handler();
    }

    private final void f(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, event);
        this.c = aVar2;
        Handler handler = this.b;
        zq3.e(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    public Lifecycle a() {
        return this.a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
