package defpackage;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.sdk.internal.AttributesMap;
import io.opentelemetry.sdk.logs.data.Body;

/* loaded from: classes5.dex */
class ld7 implements kp6 {
    private final k84 a;
    private final bz6 b;
    private final lm3 c;
    private final long d;
    private final long e;
    private final xx7 f;
    private final Severity g;
    private final String h;
    private final Body i;
    private final Object j = new Object();
    private AttributesMap k;

    private ld7(k84 k84Var, bz6 bz6Var, lm3 lm3Var, long j, long j2, xx7 xx7Var, Severity severity, String str, Body body, AttributesMap attributesMap) {
        this.a = k84Var;
        this.b = bz6Var;
        this.c = lm3Var;
        this.d = j;
        this.e = j2;
        this.f = xx7Var;
        this.g = severity;
        this.h = str;
        this.i = body;
        this.k = attributesMap;
    }

    static ld7 b(k84 k84Var, bz6 bz6Var, lm3 lm3Var, long j, long j2, xx7 xx7Var, Severity severity, String str, Body body, AttributesMap attributesMap) {
        return new ld7(k84Var, bz6Var, lm3Var, j, j2, xx7Var, severity, str, body, attributesMap);
    }

    private hv c() {
        synchronized (this.j) {
            try {
                AttributesMap attributesMap = this.k;
                if (attributesMap != null && !attributesMap.isEmpty()) {
                    return this.k.l();
                }
                return hv.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp6
    public s84 a() {
        xc7 j;
        synchronized (this.j) {
            bz6 bz6Var = this.b;
            lm3 lm3Var = this.c;
            long j2 = this.d;
            long j3 = this.e;
            xx7 xx7Var = this.f;
            Severity severity = this.g;
            String str = this.h;
            Body body = this.i;
            hv c = c();
            AttributesMap attributesMap = this.k;
            j = xc7.j(bz6Var, lm3Var, j2, j3, xx7Var, severity, str, body, c, attributesMap == null ? 0 : attributesMap.i());
        }
        return j;
    }
}
