package com.google.android.gms.internal.ads;

import defpackage.yje;
import java.util.Set;

/* loaded from: classes3.dex */
final class ob extends mb {
    /* synthetic */ ob(yje yjeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.mb
    final int a(pb pbVar) {
        int i;
        int i2;
        synchronized (pbVar) {
            i = pbVar.i;
            i2 = i - 1;
            pbVar.i = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.mb
    final void b(pb pbVar, Set set, Set set2) {
        Set set3;
        synchronized (pbVar) {
            try {
                set3 = pbVar.h;
                if (set3 == null) {
                    pbVar.h = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
