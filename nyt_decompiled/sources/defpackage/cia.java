package defpackage;

import com.google.android.gms.internal.ads.u0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class cia implements Callable {
    protected final String a = getClass().getSimpleName();
    protected final jga b;
    protected final String c;
    protected final String d;
    protected final u0 e;
    protected Method f;
    protected final int g;
    protected final int h;

    public cia(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        this.b = jgaVar;
        this.c = str;
        this.d = str2;
        this.e = u0Var;
        this.g = i;
        this.h = i2;
    }

    protected abstract void a();

    public Void b() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.b.j(this.c, this.d);
            this.f = j;
            if (j == null) {
                return null;
            }
            a();
            bfa d = this.b.d();
            if (d == null || (i = this.g) == Integer.MIN_VALUE) {
                return null;
            }
            d.c(this.h, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
