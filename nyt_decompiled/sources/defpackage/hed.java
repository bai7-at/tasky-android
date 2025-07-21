package defpackage;

import com.google.android.gms.internal.pal.g1;
import com.google.android.gms.internal.pal.h3;
import com.google.android.gms.internal.pal.zzadi;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class hed implements Callable {
    private final ksc a;
    private final h3 b;

    public hed(ksc kscVar, h3 h3Var) {
        this.a = kscVar;
        this.b = h3Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        g1 c = this.a.c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.b) {
                h3 h3Var = this.b;
                byte[] D = c.D();
                h3Var.f(D, 0, D.length, ev9.a());
            }
            return null;
        } catch (zzadi | NullPointerException unused) {
            return null;
        }
    }
}
