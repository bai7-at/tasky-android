package com.google.ads.interactivemedia.v3.internal;

import defpackage.me5;
import defpackage.og8;

/* loaded from: classes2.dex */
public final class zzqx {
    public static zzvq zza(og8 og8Var) {
        final zzqw zzqwVar = new zzqw(og8Var);
        og8Var.c(zzvw.zzb(), new me5() { // from class: com.google.ads.interactivemedia.v3.internal.zzqv
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var2) {
                zzqw zzqwVar2 = zzqw.this;
                if (og8Var2.o()) {
                    zzqwVar2.cancel(false);
                    return;
                }
                if (og8Var2.q()) {
                    zzqwVar2.zzc(og8Var2.m());
                    return;
                }
                Exception l = og8Var2.l();
                if (l == null) {
                    throw new IllegalStateException();
                }
                zzqwVar2.zzd(l);
            }
        });
        return zzqwVar;
    }
}
