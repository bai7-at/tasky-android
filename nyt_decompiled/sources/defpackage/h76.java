package defpackage;

import io.opentelemetry.api.trace.StatusCode;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class h76 implements ux7 {
    static final h76 b = new h76(xx7.e());
    private final xx7 a;

    private h76(xx7 xx7Var) {
        this.a = xx7Var;
    }

    static ux7 h(xx7 xx7Var) {
        return new h76(xx7Var);
    }

    @Override // defpackage.ux7
    public void a() {
    }

    @Override // defpackage.ux7
    public xx7 b() {
        return this.a;
    }

    @Override // defpackage.ux7
    public ux7 d(dv dvVar, Object obj) {
        return this;
    }

    @Override // defpackage.ux7
    public ux7 g(String str, hv hvVar, long j, TimeUnit timeUnit) {
        return this;
    }

    @Override // defpackage.ux7
    public boolean isRecording() {
        return false;
    }

    @Override // defpackage.ux7
    public ux7 j(String str, String str2) {
        return this;
    }

    @Override // defpackage.ux7
    public ux7 k(StatusCode statusCode) {
        return this;
    }

    @Override // defpackage.ux7
    public void l(long j, TimeUnit timeUnit) {
    }

    @Override // defpackage.ux7
    public ux7 m(StatusCode statusCode, String str) {
        return this;
    }

    public String toString() {
        return "PropagatedSpan{" + this.a + '}';
    }
}
