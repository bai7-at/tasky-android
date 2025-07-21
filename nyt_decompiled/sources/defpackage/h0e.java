package defpackage;

import com.google.android.gms.internal.pal.h3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class h0e implements Callable {
    protected final String a = getClass().getSimpleName();
    protected final ksc b;
    protected final String c;
    protected final String d;
    protected final h3 e;
    protected Method f;
    protected final int g;
    protected final int h;

    public h0e(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        this.b = kscVar;
        this.c = str;
        this.d = str2;
        this.e = h3Var;
        this.g = i;
        this.h = i2;
    }

    protected abstract void a();

    public Void b() {
        long nanoTime;
        Method j;
        int i;
        try {
            nanoTime = System.nanoTime();
            j = this.b.j(this.c, this.d);
            this.f = j;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (j == null) {
            return null;
        }
        a();
        msb d = this.b.d();
        if (d != null && (i = this.g) != Integer.MIN_VALUE) {
            d.c(this.h, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
