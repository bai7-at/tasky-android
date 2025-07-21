package com.datadog.opentracing;

import defpackage.g84;
import defpackage.qy4;
import defpackage.sf8;
import defpackage.tl0;
import defpackage.tx7;
import defpackage.z51;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class a implements tx7, qy4 {
    private final z51 b;
    private final long c;
    private final long d;
    private final AtomicLong e = new AtomicLong();
    private final g84 f;
    volatile WeakReference g;

    a(long j, z51 z51Var, g84 g84Var) {
        this.b = z51Var;
        this.f = g84Var;
        if (j <= 0) {
            this.c = tl0.a();
            this.d = z51Var.n().o();
        } else {
            this.c = j;
            this.d = 0L;
        }
        z51Var.n().t(this);
    }

    private void m(long j) {
        if (this.e.compareAndSet(0L, Math.max(1L, j))) {
            this.b.n().e(this);
        }
    }

    @Override // defpackage.tx7
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final a i(Map map) {
        this.f.a(map, this);
        return this;
    }

    @Override // defpackage.qy4
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public a g(boolean z) {
        this.b.r(z);
        return this;
    }

    public void C(Throwable th) {
        g(true);
        e("error.msg", th.getMessage());
        e("error.type", th.getClass().getName());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        e("error.stack", stringWriter.toString());
    }

    @Override // defpackage.tx7
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final a d(String str) {
        f().t(str);
        return this;
    }

    @Override // defpackage.qy4
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final a h(String str) {
        f().u(str);
        return this;
    }

    @Override // defpackage.tx7
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final a b(String str, Number number) {
        f().x(str, number);
        return this;
    }

    @Override // defpackage.tx7
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a e(String str, String str2) {
        f().x(str, str2);
        return this;
    }

    @Override // defpackage.tx7
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final a j(String str, boolean z) {
        f().x(str, Boolean.valueOf(z));
        return this;
    }

    @Override // defpackage.tx7
    public final void a() {
        if (this.d > 0) {
            m(this.b.n().o() - this.d);
        } else {
            l(tl0.a());
        }
    }

    @Override // defpackage.tx7
    public tx7 c(sf8 sf8Var, Object obj) {
        f().x(sf8Var.getKey(), obj);
        return this;
    }

    @Override // defpackage.qy4
    public final void drop() {
        this.b.n().g(this);
    }

    @Override // defpackage.tx7
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final z51 f() {
        return this.b;
    }

    public final void l(long j) {
        m(TimeUnit.MICROSECONDS.toNanos(j - this.c));
    }

    public long n() {
        return this.e.get();
    }

    public qy4 o() {
        return f().n().p();
    }

    public Map p() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : f().c().entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : x().entrySet()) {
            hashMap.put((String) entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        return hashMap;
    }

    public Map q() {
        return this.b.e();
    }

    public String r() {
        return this.b.f();
    }

    public BigInteger s() {
        return this.b.h();
    }

    public String t() {
        return this.b.i();
    }

    public String toString() {
        return this.b.toString() + ", duration_ns=" + this.e;
    }

    public String u() {
        return this.b.k();
    }

    public BigInteger v() {
        return this.b.l();
    }

    public long w() {
        long j = this.d;
        return j > 0 ? j : TimeUnit.MICROSECONDS.toNanos(this.c);
    }

    public Map x() {
        return f().m();
    }

    public BigInteger y() {
        return this.b.o();
    }

    public Boolean z() {
        return Boolean.valueOf(this.b.d());
    }
}
