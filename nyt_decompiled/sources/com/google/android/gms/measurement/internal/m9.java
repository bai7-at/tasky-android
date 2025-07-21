package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.n1a;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class m9 implements Callable {
    final /* synthetic */ zzq a;
    final /* synthetic */ r9 b;

    m9(r9 r9Var, zzq zzqVar) {
        this.b = r9Var;
        this.a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n1a T = this.b.T((String) Preconditions.checkNotNull(this.a.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (T.i(zzahVar) && n1a.b(this.a.zzv).i(zzahVar)) {
            return this.b.Q(this.a).f0();
        }
        this.b.o().u().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
