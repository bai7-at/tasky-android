package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class ay0 implements v51, Closeable {
    private final zx0 a;
    private final com.datadog.opentracing.a b;
    private final x51 c;
    private final w51 d;
    private final boolean e;
    private final AtomicInteger f;
    private final v51 g;
    private final AtomicBoolean h;
    private final int i;

    public class a implements Closeable {
    }

    ay0(zx0 zx0Var, com.datadog.opentracing.a aVar, boolean z, x51 x51Var) {
        this(zx0Var, new AtomicInteger(1), null, aVar, z, x51Var);
    }

    @Override // defpackage.v51
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.datadog.opentracing.a b1() {
        return this.b;
    }

    @Override // defpackage.yb7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.a();
        if (this.f.decrementAndGet() == 0 && this.e) {
            this.b.a();
        }
        Iterator it2 = this.a.b.iterator();
        while (it2.hasNext()) {
            ((zb7) it2.next()).a();
        }
        ThreadLocal threadLocal = zx0.e;
        if (threadLocal.get() == this) {
            threadLocal.set(this.g);
            if (this.g != null) {
                Iterator it3 = this.a.b.iterator();
                while (it3.hasNext()) {
                    ((zb7) it3.next()).b();
                }
            }
        }
    }

    @Override // defpackage.v51
    public int d0() {
        return this.i;
    }

    public String toString() {
        return super.toString() + "->" + this.b;
    }

    private ay0(zx0 zx0Var, AtomicInteger atomicInteger, a aVar, com.datadog.opentracing.a aVar2, boolean z, x51 x51Var) {
        this.h = new AtomicBoolean(false);
        this.a = zx0Var;
        this.f = atomicInteger;
        this.b = aVar2;
        this.e = z;
        this.c = x51Var;
        w51 a2 = x51Var.a(aVar2.f());
        this.d = a2;
        a2.start();
        ThreadLocal threadLocal = zx0.e;
        v51 v51Var = (v51) threadLocal.get();
        this.g = v51Var;
        threadLocal.set(this);
        this.i = v51Var != null ? v51Var.d0() + 1 : 0;
        Iterator it2 = zx0Var.b.iterator();
        while (it2.hasNext()) {
            ((zb7) it2.next()).b();
        }
    }
}
