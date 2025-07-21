package defpackage;

import io.opentelemetry.sdk.metrics.internal.debug.a;

/* loaded from: classes5.dex */
public abstract class zu6 {
    zu6() {
    }

    public static zu6 a(fm3 fm3Var, d99 d99Var, jv jvVar, int i, a aVar) {
        return new a20(fm3Var, d99Var, jvVar, i, aVar);
    }

    public abstract int b();

    public abstract fm3 c();

    public abstract d99 d();

    public abstract jv e();

    public abstract a f();

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + c() + ", view=" + d() + "}";
    }
}
