package defpackage;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.sdk.internal.AttributesMap;
import io.opentelemetry.sdk.logs.data.Body;

/* loaded from: classes5.dex */
final class wc7 implements r84 {
    private final ba4 a;
    private final k84 b;
    private final lm3 c;
    private long d;
    private long e;
    private hx0 f;
    private String h;
    private AttributesMap j;
    private Severity g = Severity.UNDEFINED_SEVERITY_NUMBER;
    private Body i = Body.d();

    wc7(ba4 ba4Var, lm3 lm3Var) {
        this.a = ba4Var;
        this.b = ba4Var.b();
        this.c = lm3Var;
    }

    @Override // defpackage.r84
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wc7 d(dv dvVar, Object obj) {
        if (dvVar != null && !dvVar.getKey().isEmpty() && obj != null) {
            if (this.j == null) {
                this.j = AttributesMap.a(this.b.d(), this.b.c());
            }
            this.j.m(dvVar, obj);
        }
        return this;
    }

    @Override // defpackage.r84
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wc7 h(String str) {
        this.i = ti.a(si.a(str));
        return this;
    }

    @Override // defpackage.r84
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public wc7 f(Severity severity) {
        this.g = severity;
        return this;
    }

    @Override // defpackage.r84
    public void e() {
        if (this.a.e()) {
            return;
        }
        hx0 hx0Var = this.f;
        if (hx0Var == null) {
            hx0Var = hx0.current();
        }
        long j = this.e;
        if (j == 0) {
            j = this.a.a().now();
        }
        this.a.c().onEmit(hx0Var, ld7.b(this.a.b(), this.a.d(), this.c, this.d, j, ux7.i(hx0Var).b(), this.g, this.h, this.i, this.j));
    }

    @Override // defpackage.r84
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public wc7 g(String str) {
        this.h = str;
        return this;
    }
}
