package defpackage;

import com.datadog.android.Datadog;
import com.datadog.android.core.internal.DatadogCore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class md7 {
    private final String a;
    private final ss2 b;
    private final AtomicReference c;

    public md7(String str, ss2 ss2Var) {
        zq3.h(ss2Var, "onSdkInstanceCaptured");
        this.a = str;
        this.b = ss2Var;
        this.c = new AtomicReference(null);
    }

    private final vc7 b() {
        vc7 vc7Var;
        synchronized (this.c) {
            vc7Var = (vc7) this.c.get();
            if (vc7Var == null) {
                if (Datadog.f(this.a)) {
                    vc7Var = Datadog.a(this.a);
                    this.c.set(vc7Var);
                    this.b.invoke(vc7Var);
                } else {
                    vc7Var = null;
                }
            }
        }
        return vc7Var;
    }

    public final vc7 a() {
        vc7 vc7Var = (vc7) this.c.get();
        if (vc7Var == null) {
            return b();
        }
        DatadogCore datadogCore = vc7Var instanceof DatadogCore ? (DatadogCore) vc7Var : null;
        Boolean valueOf = datadogCore != null ? Boolean.valueOf(datadogCore.u()) : null;
        if (valueOf == null || valueOf.booleanValue()) {
            return vc7Var;
        }
        kz4.a(this.c, vc7Var, null);
        return null;
    }
}
