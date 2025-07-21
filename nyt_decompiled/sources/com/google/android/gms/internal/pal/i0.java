package com.google.android.gms.internal.pal;

import defpackage.ax9;
import defpackage.mw9;
import java.util.List;

/* loaded from: classes3.dex */
final class i0 extends j0 {
    /* synthetic */ i0(ax9 ax9Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.j0
    final List a(Object obj, long j) {
        mw9 mw9Var = (mw9) p1.k(obj, j);
        if (mw9Var.zzc()) {
            return mw9Var;
        }
        int size = mw9Var.size();
        mw9 zzd = mw9Var.zzd(size == 0 ? 10 : size + size);
        p1.x(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.pal.j0
    final void b(Object obj, long j) {
        ((mw9) p1.k(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.pal.j0
    final void c(Object obj, Object obj2, long j) {
        mw9 mw9Var = (mw9) p1.k(obj, j);
        mw9 mw9Var2 = (mw9) p1.k(obj2, j);
        int size = mw9Var.size();
        int size2 = mw9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!mw9Var.zzc()) {
                mw9Var = mw9Var.zzd(size2 + size);
            }
            mw9Var.addAll(mw9Var2);
        }
        if (size > 0) {
            mw9Var2 = mw9Var;
        }
        p1.x(obj, j, mw9Var2);
    }
}
