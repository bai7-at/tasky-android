package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.ads.k0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class tae {
    private static volatile int e = 1;
    public static final /* synthetic */ int f = 0;
    private final Context a;
    private final Executor b;
    private final og8 c;
    private final boolean d;

    tae(Context context, Executor executor, og8 og8Var, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = og8Var;
        this.d = z;
    }

    public static tae a(final Context context, Executor executor, boolean z) {
        final qg8 qg8Var = new qg8();
        if (z) {
            executor.execute(new Runnable() { // from class: rae
                @Override // java.lang.Runnable
                public final void run() {
                    qg8Var.c(fce.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: sae
                @Override // java.lang.Runnable
                public final void run() {
                    qg8.this.c(fce.c());
                }
            });
        }
        return new tae(context, executor, qg8Var.a(), z);
    }

    static void g(int i) {
        e = i;
    }

    private final og8 h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.d) {
            return this.c.i(this.b, new cy0() { // from class: pae
                @Override // defpackage.cy0
                public final Object then(og8 og8Var) {
                    return Boolean.valueOf(og8Var.q());
                }
            });
        }
        Context context = this.a;
        final g0 L = k0.L();
        L.n(context.getPackageName());
        L.r(j);
        L.t(e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            L.s(stringWriter.toString());
            L.q(exc.getClass().getName());
        }
        if (str2 != null) {
            L.o(str2);
        }
        if (str != null) {
            L.p(str);
        }
        return this.c.i(this.b, new cy0() { // from class: qae
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                int i2 = tae.f;
                if (!og8Var.q()) {
                    return Boolean.FALSE;
                }
                int i3 = i;
                ece a = ((fce) og8Var.m()).a(((k0) g0.this.i()).i());
                a.a(i3);
                a.c();
                return Boolean.TRUE;
            }
        });
    }

    public final og8 b(int i, String str) {
        return h(i, 0L, null, null, null, str);
    }

    public final og8 c(int i, long j, Exception exc) {
        return h(i, j, exc, null, null, null);
    }

    public final og8 d(int i, long j) {
        return h(i, j, null, null, null, null);
    }

    public final og8 e(int i, long j, String str) {
        return h(i, j, null, null, null, str);
    }

    public final og8 f(int i, long j, String str, Map map) {
        return h(i, j, null, str, null, null);
    }
}
