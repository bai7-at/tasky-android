package defpackage;

import io.opentelemetry.context.b;

/* loaded from: classes5.dex */
public interface hx0 {
    static hx0 current() {
        hx0 current = b.get().current();
        return current != null ? current : root();
    }

    static hx0 root() {
        return b.get().root();
    }

    Object a(qx0 qx0Var);

    hx0 b(qx0 qx0Var, Object obj);

    default hx0 c(di3 di3Var) {
        return di3Var.c(this);
    }
}
