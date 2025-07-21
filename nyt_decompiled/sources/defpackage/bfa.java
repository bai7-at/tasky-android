package defpackage;

import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.g0;
import com.google.android.gms.internal.ads.k0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public final class bfa {
    private static final ConditionVariable c = new ConditionVariable();
    protected static volatile fce d = null;
    private static volatile Random e = null;
    private final jga a;
    protected volatile Boolean b;

    public bfa(jga jgaVar) {
        this.a = jgaVar;
        jgaVar.k().execute(new afa(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (e == null) {
                synchronized (bfa.class) {
                    try {
                        if (e == null) {
                            e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return e.nextInt();
        }
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            g0 L = k0.L();
            L.n(this.a.a.getPackageName());
            L.r(j);
            if (str != null) {
                L.o(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                L.s(stringWriter.toString());
                L.q(exc.getClass().getName());
            }
            ece a = d.a(((k0) L.i()).i());
            a.a(i);
            if (i2 != -1) {
                a.b(i2);
            }
            a.c();
        } catch (Exception unused) {
        }
    }
}
