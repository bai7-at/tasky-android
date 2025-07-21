package io.opentelemetry.sdk.trace;

import defpackage.by7;
import defpackage.bz6;
import defpackage.dv;
import defpackage.gv;
import defpackage.gy7;
import defpackage.hv;
import defpackage.hx0;
import defpackage.iy7;
import defpackage.lm3;
import defpackage.mp6;
import defpackage.ux7;
import defpackage.v18;
import defpackage.w32;
import defpackage.xx7;
import defpackage.yl0;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.sdk.internal.AttributesMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class d implements mp6, ux7 {
    private static final Logger t = Logger.getLogger(d.class.getName());
    private final gy7 a;
    private final xx7 b;
    private final xx7 c;
    private final iy7 d;
    private final SpanKind e;
    private final a f;
    private final bz6 g;
    private final lm3 h;
    private final long i;
    private String k;
    private AttributesMap l;
    List o;
    private int p;
    private long r;
    private final Object j = new Object();
    private int n = 0;
    private v18 q = v18.b();
    private boolean s = false;
    private final List m = new ArrayList();

    private d(xx7 xx7Var, String str, lm3 lm3Var, SpanKind spanKind, xx7 xx7Var2, gy7 gy7Var, iy7 iy7Var, a aVar, bz6 bz6Var, AttributesMap attributesMap, List list, int i, long j) {
        this.b = xx7Var;
        this.h = lm3Var;
        this.c = xx7Var2;
        this.o = list;
        this.p = i;
        this.k = str;
        this.e = spanKind;
        this.d = iy7Var;
        this.g = bz6Var;
        this.f = aVar;
        this.i = j;
        this.l = attributesMap;
        this.a = gy7Var;
    }

    static d A(xx7 xx7Var, String str, lm3 lm3Var, SpanKind spanKind, ux7 ux7Var, hx0 hx0Var, gy7 gy7Var, iy7 iy7Var, yl0 yl0Var, bz6 bz6Var, AttributesMap attributesMap, List list, int i, long j) {
        a a;
        boolean z;
        long c;
        if (ux7Var instanceof d) {
            a = ((d) ux7Var).f;
            z = false;
        } else {
            a = a.a(yl0Var);
            z = true;
        }
        a aVar = a;
        if (j != 0) {
            c = j;
        } else {
            c = z ? aVar.c() : aVar.b();
        }
        d dVar = new d(xx7Var, str, lm3Var, spanKind, ux7Var.b(), gy7Var, iy7Var, aVar, bz6Var, attributesMap, list, i, c);
        if (iy7Var.isStartRequired()) {
            iy7Var.onStart(hx0Var, dVar);
        }
        return dVar;
    }

    private void o(w32 w32Var) {
        synchronized (this.j) {
            try {
                if (this.s) {
                    t.log(Level.FINE, "Calling addEvent() on an ended Span.");
                    return;
                }
                if (this.m.size() < this.a.g()) {
                    this.m.add(w32Var);
                }
                this.n++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p(long j) {
        synchronized (this.j) {
            try {
                if (this.s) {
                    t.log(Level.FINE, "Calling end() on an ended Span.");
                    return;
                }
                this.r = j;
                this.s = true;
                if (this.d.isEndRequired()) {
                    this.d.onEnd(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private hv q() {
        AttributesMap attributesMap = this.l;
        return (attributesMap == null || attributesMap.isEmpty()) ? hv.d() : this.s ? this.l : this.l.l();
    }

    private List r() {
        List list = this.o;
        return (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(this.o);
    }

    private List s() {
        return this.m.isEmpty() ? Collections.emptyList() : this.s ? Collections.unmodifiableList(this.m) : Collections.unmodifiableList(new ArrayList(this.m));
    }

    @Override // defpackage.ux7
    public void a() {
        p(this.f.b());
    }

    @Override // defpackage.ux7
    public xx7 b() {
        return this.b;
    }

    @Override // defpackage.np6
    public by7 h() {
        k i;
        synchronized (this.j) {
            List r = r();
            List s = s();
            hv q = q();
            AttributesMap attributesMap = this.l;
            i = k.i(this, r, s, q, attributesMap == null ? 0 : attributesMap.i(), this.n, this.p, this.q, this.k, this.r, this.s);
        }
        return i;
    }

    @Override // defpackage.ux7
    public boolean isRecording() {
        boolean z;
        synchronized (this.j) {
            z = !this.s;
        }
        return z;
    }

    @Override // defpackage.ux7
    public void l(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        p(j == 0 ? this.f.b() : timeUnit.toNanos(j));
    }

    @Override // defpackage.ux7
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public mp6 g(String str, hv hvVar, long j, TimeUnit timeUnit) {
        if (str != null && timeUnit != null) {
            if (hvVar == null) {
                hvVar = hv.d();
            }
            o(w32.d(timeUnit.toNanos(j), str, gv.e(hvVar, this.a.e(), this.a.c()), hvVar.size()));
        }
        return this;
    }

    public lm3 t() {
        return this.h;
    }

    public String toString() {
        String str;
        String valueOf;
        String valueOf2;
        long j;
        long j2;
        long j3;
        synchronized (this.j) {
            str = this.k;
            valueOf = String.valueOf(this.l);
            valueOf2 = String.valueOf(this.q);
            j = this.n;
            j2 = this.r;
            j3 = this.p;
        }
        return "SdkSpan{traceId=" + this.b.getTraceId() + ", spanId=" + this.b.getSpanId() + ", parentSpanContext=" + this.c + ", name=" + str + ", kind=" + this.e + ", attributes=" + valueOf + ", status=" + valueOf2 + ", totalRecordedEvents=" + j + ", totalRecordedLinks=" + j3 + ", startEpochNanos=" + this.i + ", endEpochNanos=" + j2 + "}";
    }

    public SpanKind u() {
        return this.e;
    }

    public xx7 v() {
        return this.c;
    }

    bz6 w() {
        return this.g;
    }

    long x() {
        return this.i;
    }

    @Override // defpackage.ux7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public mp6 d(dv dvVar, Object obj) {
        if (dvVar == null || dvVar.getKey().isEmpty() || obj == null) {
            return this;
        }
        synchronized (this.j) {
            try {
                if (this.s) {
                    t.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                    return this;
                }
                if (this.l == null) {
                    this.l = AttributesMap.a(this.a.d(), this.a.c());
                }
                this.l.m(dvVar, obj);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ux7
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public mp6 m(StatusCode statusCode, String str) {
        if (statusCode == null) {
            return this;
        }
        synchronized (this.j) {
            try {
                if (this.s) {
                    t.log(Level.FINE, "Calling setStatus() on an ended Span.");
                    return this;
                }
                if (this.q.getStatusCode() == StatusCode.OK) {
                    t.log(Level.FINE, "Calling setStatus() on a Span that is already set to OK.");
                    return this;
                }
                this.q = v18.a(statusCode, str);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
