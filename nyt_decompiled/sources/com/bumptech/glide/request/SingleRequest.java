package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.h;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.b18;
import defpackage.b94;
import defpackage.cz6;
import defpackage.eg8;
import defpackage.eu7;
import defpackage.ey6;
import defpackage.fz6;
import defpackage.lh4;
import defpackage.lv1;
import defpackage.ly6;
import defpackage.mr8;
import defpackage.x19;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class SingleRequest implements ey6, eu7, fz6 {
    private static final boolean C = Log.isLoggable("Request", 2);
    private boolean A;
    private RuntimeException B;
    private final String a;
    private final b18 b;
    private final Object c;
    private final RequestCoordinator d;
    private final Context e;
    private final com.bumptech.glide.c f;
    private final Object g;
    private final Class h;
    private final a i;
    private final int j;
    private final int k;
    private final Priority l;
    private final eg8 m;
    private final List n;
    private final mr8 o;
    private final Executor p;
    private cz6 q;
    private h.d r;
    private long s;
    private volatile h t;
    private Status u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private int y;
    private int z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class cls, a aVar, int i, int i2, Priority priority, eg8 eg8Var, ly6 ly6Var, List list, RequestCoordinator requestCoordinator, h hVar, mr8 mr8Var, Executor executor) {
        this.a = C ? String.valueOf(super.hashCode()) : null;
        this.b = b18.a();
        this.c = obj;
        this.e = context;
        this.f = cVar;
        this.g = obj2;
        this.h = cls;
        this.i = aVar;
        this.j = i;
        this.k = i2;
        this.l = priority;
        this.m = eg8Var;
        this.n = list;
        this.d = requestCoordinator;
        this.t = hVar;
        this.o = mr8Var;
        this.p = executor;
        this.u = Status.PENDING;
        if (this.B == null && cVar.h()) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        if (l()) {
            Drawable p = this.g == null ? p() : null;
            if (p == null) {
                p = o();
            }
            if (p == null) {
                p = q();
            }
            this.m.j(p);
        }
    }

    private void i() {
        if (this.A) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        RequestCoordinator requestCoordinator = this.d;
        return requestCoordinator == null || requestCoordinator.a(this);
    }

    private boolean l() {
        RequestCoordinator requestCoordinator = this.d;
        return requestCoordinator == null || requestCoordinator.f(this);
    }

    private boolean m() {
        RequestCoordinator requestCoordinator = this.d;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    private void n() {
        i();
        this.b.c();
        this.m.i(this);
        h.d dVar = this.r;
        if (dVar != null) {
            dVar.a();
            this.r = null;
        }
    }

    private Drawable o() {
        if (this.v == null) {
            Drawable k = this.i.k();
            this.v = k;
            if (k == null && this.i.i() > 0) {
                this.v = s(this.i.i());
            }
        }
        return this.v;
    }

    private Drawable p() {
        if (this.x == null) {
            Drawable l = this.i.l();
            this.x = l;
            if (l == null && this.i.m() > 0) {
                this.x = s(this.i.m());
            }
        }
        return this.x;
    }

    private Drawable q() {
        if (this.w == null) {
            Drawable r = this.i.r();
            this.w = r;
            if (r == null && this.i.s() > 0) {
                this.w = s(this.i.s());
            }
        }
        return this.w;
    }

    private boolean r() {
        RequestCoordinator requestCoordinator = this.d;
        return requestCoordinator == null || !requestCoordinator.getRoot().b();
    }

    private Drawable s(int i) {
        return lv1.a(this.f, i, this.i.x() != null ? this.i.x() : this.e.getTheme());
    }

    private void t(String str) {
        Log.v("Request", str + " this: " + this.a);
    }

    private static int u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private void v() {
        RequestCoordinator requestCoordinator = this.d;
        if (requestCoordinator != null) {
            requestCoordinator.c(this);
        }
    }

    private void w() {
        RequestCoordinator requestCoordinator = this.d;
        if (requestCoordinator != null) {
            requestCoordinator.d(this);
        }
    }

    public static SingleRequest x(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class cls, a aVar, int i, int i2, Priority priority, eg8 eg8Var, ly6 ly6Var, List list, RequestCoordinator requestCoordinator, h hVar, mr8 mr8Var, Executor executor) {
        return new SingleRequest(context, cVar, obj, obj2, cls, aVar, i, i2, priority, eg8Var, ly6Var, list, requestCoordinator, hVar, mr8Var, executor);
    }

    private void y(GlideException glideException, int i) {
        this.b.c();
        synchronized (this.c) {
            try {
                glideException.k(this.B);
                int f = this.f.f();
                if (f <= i) {
                    Log.w("Glide", "Load failed for " + this.g + " with size [" + this.y + QueryKeys.SCROLL_POSITION_TOP + this.z + "]", glideException);
                    if (f <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.r = null;
                this.u = Status.FAILED;
                this.A = true;
                try {
                    List list = this.n;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        if (it2.hasNext()) {
                            lh4.a(it2.next());
                            r();
                            throw null;
                        }
                    }
                    A();
                    this.A = false;
                    v();
                } catch (Throwable th) {
                    this.A = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(cz6 cz6Var, Object obj, DataSource dataSource) {
        boolean r = r();
        this.u = Status.COMPLETE;
        this.q = cz6Var;
        if (this.f.f() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + this.g + " with size [" + this.y + QueryKeys.SCROLL_POSITION_TOP + this.z + "] in " + b94.a(this.s) + " ms");
        }
        this.A = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
            }
            this.m.f(obj, this.o.a(dataSource, r));
            this.A = false;
            w();
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    @Override // defpackage.fz6
    public void a(cz6 cz6Var, DataSource dataSource) {
        this.b.c();
        cz6 cz6Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (cz6Var == null) {
                        c(new GlideException("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cz6Var.get();
                    try {
                        if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                            if (m()) {
                                z(cz6Var, obj, dataSource);
                                return;
                            }
                            this.q = null;
                            this.u = Status.COMPLETE;
                            this.t.k(cz6Var);
                            return;
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(cz6Var);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        c(new GlideException(sb.toString()));
                        this.t.k(cz6Var);
                    } catch (Throwable th) {
                        cz6Var2 = cz6Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (cz6Var2 != null) {
                this.t.k(cz6Var2);
            }
            throw th3;
        }
    }

    @Override // defpackage.ey6
    public boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.u == Status.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.fz6
    public void c(GlideException glideException) {
        y(glideException, 5);
    }

    @Override // defpackage.ey6
    public void clear() {
        synchronized (this.c) {
            try {
                i();
                this.b.c();
                Status status = this.u;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                n();
                cz6 cz6Var = this.q;
                if (cz6Var != null) {
                    this.q = null;
                } else {
                    cz6Var = null;
                }
                if (k()) {
                    this.m.g(q());
                }
                this.u = status2;
                if (cz6Var != null) {
                    this.t.k(cz6Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.eu7
    public void d(int i, int i2) {
        this.b.c();
        synchronized (this.c) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        t("Got onSizeReady in " + b94.a(this.s));
                    }
                    if (this.u != Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    Status status = Status.RUNNING;
                    this.u = status;
                    float w = this.i.w();
                    this.y = u(i, w);
                    this.z = u(i2, w);
                    if (z) {
                        t("finished setup for calling load in " + b94.a(this.s));
                    }
                    this.r = this.t.f(this.f, this.g, this.i.v(), this.y, this.z, this.i.u(), this.h, this.l, this.i.h(), this.i.y(), this.i.H(), this.i.E(), this.i.o(), this.i.B(), this.i.A(), this.i.z(), this.i.n(), this, this.p);
                    if (this.u != status) {
                        this.r = null;
                    }
                    if (z) {
                        t("finished onSizeReady in " + b94.a(this.s));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public boolean e() {
        boolean z;
        synchronized (this.c) {
            z = this.u == Status.CLEARED;
        }
        return z;
    }

    @Override // defpackage.fz6
    public Object f() {
        this.b.c();
        return this.c;
    }

    @Override // defpackage.ey6
    public boolean g() {
        boolean z;
        synchronized (this.c) {
            z = this.u == Status.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.ey6
    public boolean h(ey6 ey6Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        a aVar;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        a aVar2;
        Priority priority2;
        int size2;
        if (!(ey6Var instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                aVar = this.i;
                priority = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) ey6Var;
        synchronized (singleRequest.c) {
            try {
                i3 = singleRequest.j;
                i4 = singleRequest.k;
                obj2 = singleRequest.g;
                cls2 = singleRequest.h;
                aVar2 = singleRequest.i;
                priority2 = singleRequest.l;
                List list2 = singleRequest.n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i == i3 && i2 == i4 && x19.b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && size == size2;
    }

    @Override // defpackage.ey6
    public boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            try {
                Status status = this.u;
                z = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.ey6
    public void j() {
        synchronized (this.c) {
            try {
                i();
                this.b.c();
                this.s = b94.b();
                if (this.g == null) {
                    if (x19.r(this.j, this.k)) {
                        this.y = this.j;
                        this.z = this.k;
                    }
                    y(new GlideException("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                Status status = this.u;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    a(this.q, DataSource.MEMORY_CACHE);
                    return;
                }
                Status status3 = Status.WAITING_FOR_SIZE;
                this.u = status3;
                if (x19.r(this.j, this.k)) {
                    d(this.j, this.k);
                } else {
                    this.m.d(this);
                }
                Status status4 = this.u;
                if ((status4 == status2 || status4 == status3) && l()) {
                    this.m.e(q());
                }
                if (C) {
                    t("finished run method in " + b94.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ey6
    public void pause() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
