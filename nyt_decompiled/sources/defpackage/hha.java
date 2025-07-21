package defpackage;

import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.zzhag;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class hha implements Callable {
    private final jga a;
    private final u0 b;

    public hha(jga jgaVar, u0 u0Var) {
        this.a = jgaVar;
        this.b = u0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        n1 c = this.a.c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.b) {
                u0 u0Var = this.b;
                byte[] i = c.i();
                u0Var.h(i, 0, i.length, ph.a());
            }
            return null;
        } catch (zzhag | NullPointerException unused) {
            return null;
        }
    }
}
