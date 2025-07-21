package defpackage;

import io.opentelemetry.api.trace.StatusCode;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface ux7 extends di3 {
    static ux7 current() {
        ux7 ux7Var = (ux7) hx0.current().a(ay7.a);
        return ux7Var == null ? e() : ux7Var;
    }

    static ux7 e() {
        return h76.b;
    }

    static ux7 f(xx7 xx7Var) {
        if (xx7Var != null) {
            return h76.h(xx7Var);
        }
        rj.a("context is null");
        return e();
    }

    static ux7 i(hx0 hx0Var) {
        if (hx0Var == null) {
            rj.a("context is null");
            return e();
        }
        ux7 ux7Var = (ux7) hx0Var.a(ay7.a);
        return ux7Var == null ? e() : ux7Var;
    }

    void a();

    xx7 b();

    @Override // defpackage.di3
    default hx0 c(hx0 hx0Var) {
        return hx0Var.b(ay7.a, this);
    }

    ux7 d(dv dvVar, Object obj);

    ux7 g(String str, hv hvVar, long j, TimeUnit timeUnit);

    boolean isRecording();

    default ux7 j(String str, String str2) {
        return d(dv.a(str), str2);
    }

    default ux7 k(StatusCode statusCode) {
        return m(statusCode, "");
    }

    void l(long j, TimeUnit timeUnit);

    ux7 m(StatusCode statusCode, String str);
}
