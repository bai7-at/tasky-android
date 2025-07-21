package defpackage;

import android.os.ConditionVariable;
import com.google.android.gms.internal.pal.k2;
import com.google.android.gms.internal.pal.o2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public final class msb {
    private static final ConditionVariable c = new ConditionVariable();
    protected static volatile g5f d = null;
    private static volatile Random e = null;
    private final ksc a;
    protected volatile Boolean b;

    public msb(ksc kscVar) {
        this.a = kscVar;
        kscVar.k().execute(new hrb(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (e == null) {
            synchronized (msb.class) {
                try {
                    if (e == null) {
                        e = new Random();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            k2 s = o2.s();
            s.k(this.a.a.getPackageName());
            s.n(j);
            if (str != null) {
                s.l(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                s.o(stringWriter.toString());
                s.m(exc.getClass().getName());
            }
            e5f a = d.a(((o2) s.g()).D());
            a.a(i);
            if (i2 != -1) {
                a.b(i2);
            }
            a.c();
        } catch (Exception unused) {
        }
    }
}
