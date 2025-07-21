package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import defpackage.b44;
import defpackage.eg8;
import defpackage.ey6;
import defpackage.hg8;
import defpackage.lz2;
import defpackage.nu0;
import defpackage.ou0;
import defpackage.oy6;
import defpackage.py6;
import defpackage.tr1;
import defpackage.vy6;
import defpackage.w34;
import defpackage.x19;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class e implements ComponentCallbacks2, b44 {
    private static final py6 m = (py6) py6.b0(Bitmap.class).J();
    private static final py6 n = (py6) py6.b0(lz2.class).J();
    private static final py6 r = (py6) ((py6) py6.c0(tr1.c).N(Priority.LOW)).V(true);
    protected final com.bumptech.glide.a a;
    protected final Context b;
    final w34 c;
    private final vy6 d;
    private final oy6 e;
    private final hg8 f;
    private final Runnable g;
    private final Handler h;
    private final nu0 i;
    private final CopyOnWriteArrayList j;
    private py6 k;
    private boolean l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.c.a(eVar);
        }
    }

    private class b implements nu0.a {
        private final vy6 a;

        b(vy6 vy6Var) {
            this.a = vy6Var;
        }

        @Override // nu0.a
        public void a(boolean z) {
            if (z) {
                synchronized (e.this) {
                    this.a.e();
                }
            }
        }
    }

    public e(com.bumptech.glide.a aVar, w34 w34Var, oy6 oy6Var, Context context) {
        this(aVar, w34Var, oy6Var, new vy6(), aVar.g(), context);
    }

    private void z(eg8 eg8Var) {
        boolean y = y(eg8Var);
        ey6 c = eg8Var.c();
        if (y || this.a.p(eg8Var) || c == null) {
            return;
        }
        eg8Var.h(null);
        c.clear();
    }

    @Override // defpackage.b44
    public synchronized void a() {
        u();
        this.f.a();
    }

    @Override // defpackage.b44
    public synchronized void b() {
        v();
        this.f.b();
    }

    public d k(Class cls) {
        return new d(this.a, this, cls, this.b);
    }

    public d l() {
        return k(Bitmap.class).a(m);
    }

    public d m() {
        return k(Drawable.class);
    }

    public void n(eg8 eg8Var) {
        if (eg8Var == null) {
            return;
        }
        z(eg8Var);
    }

    List o() {
        return this.j;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.b44
    public synchronized void onDestroy() {
        try {
            this.f.onDestroy();
            Iterator it2 = this.f.l().iterator();
            while (it2.hasNext()) {
                n((eg8) it2.next());
            }
            this.f.k();
            this.d.b();
            this.c.b(this);
            this.c.b(this.i);
            this.h.removeCallbacks(this.g);
            this.a.s(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.l) {
            t();
        }
    }

    synchronized py6 p() {
        return this.k;
    }

    f q(Class cls) {
        return this.a.i().d(cls);
    }

    public d r(String str) {
        return m().r0(str);
    }

    public synchronized void s() {
        this.d.c();
    }

    public synchronized void t() {
        s();
        Iterator it2 = this.e.a().iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).s();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    public synchronized void u() {
        this.d.d();
    }

    public synchronized void v() {
        this.d.f();
    }

    protected synchronized void w(py6 py6Var) {
        this.k = (py6) ((py6) py6Var.clone()).b();
    }

    synchronized void x(eg8 eg8Var, ey6 ey6Var) {
        this.f.m(eg8Var);
        this.d.g(ey6Var);
    }

    synchronized boolean y(eg8 eg8Var) {
        ey6 c = eg8Var.c();
        if (c == null) {
            return true;
        }
        if (!this.d.a(c)) {
            return false;
        }
        this.f.n(eg8Var);
        eg8Var.h(null);
        return true;
    }

    e(com.bumptech.glide.a aVar, w34 w34Var, oy6 oy6Var, vy6 vy6Var, ou0 ou0Var, Context context) {
        this.f = new hg8();
        a aVar2 = new a();
        this.g = aVar2;
        Handler handler = new Handler(Looper.getMainLooper());
        this.h = handler;
        this.a = aVar;
        this.c = w34Var;
        this.e = oy6Var;
        this.d = vy6Var;
        this.b = context;
        nu0 a2 = ou0Var.a(context.getApplicationContext(), new b(vy6Var));
        this.i = a2;
        if (x19.o()) {
            handler.post(aVar2);
        } else {
            w34Var.a(this);
        }
        w34Var.a(a2);
        this.j = new CopyOnWriteArrayList(aVar.i().b());
        w(aVar.i().c());
        aVar.o(this);
    }
}
