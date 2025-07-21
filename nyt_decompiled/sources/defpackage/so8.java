package defpackage;

import com.datadog.android.Datadog;
import com.datadog.android.trace.internal.TracingFeature;

/* loaded from: classes2.dex */
public final class so8 {
    public static final so8 a = new so8();

    private so8() {
    }

    public static final void a(yo8 yo8Var, vc7 vc7Var) {
        zq3.h(yo8Var, "traceConfiguration");
        zq3.h(vc7Var, "sdkCore");
        jb2 jb2Var = (jb2) vc7Var;
        jb2Var.j(new TracingFeature(jb2Var, yo8Var.a(), yo8Var.b(), yo8Var.c()));
    }

    public static /* synthetic */ void b(yo8 yo8Var, vc7 vc7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            vc7Var = Datadog.b(null, 1, null);
        }
        a(yo8Var, vc7Var);
    }
}
