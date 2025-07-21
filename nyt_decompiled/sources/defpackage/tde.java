package defpackage;

import com.google.android.gms.internal.ads.lc;

/* loaded from: classes3.dex */
public abstract class tde {
    public static j64 a(og8 og8Var, oh0 oh0Var) {
        final sde sdeVar = new sde(og8Var, null);
        og8Var.c(lc.b(), new me5() { // from class: rde
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var2) {
                sde sdeVar2 = sde.this;
                if (og8Var2.o()) {
                    sdeVar2.cancel(false);
                    return;
                }
                if (og8Var2.q()) {
                    sdeVar2.f(og8Var2.m());
                    return;
                }
                Exception l = og8Var2.l();
                if (l == null) {
                    throw new IllegalStateException();
                }
                sdeVar2.g(l);
            }
        });
        return sdeVar;
    }
}
