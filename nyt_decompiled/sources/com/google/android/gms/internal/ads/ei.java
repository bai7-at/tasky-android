package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.q1f;
import java.util.List;

/* loaded from: classes3.dex */
final class ei extends fi {
    /* synthetic */ ei(q1f q1fVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.fi
    final List a(Object obj, long j) {
        n1f n1fVar = (n1f) mj.p(obj, j);
        if (n1fVar.zzc()) {
            return n1fVar;
        }
        int size = n1fVar.size();
        n1f zzd = n1fVar.zzd(size == 0 ? 10 : size + size);
        mj.D(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.fi
    final void b(Object obj, long j) {
        ((n1f) mj.p(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.fi
    final void c(Object obj, Object obj2, long j) {
        n1f n1fVar = (n1f) mj.p(obj, j);
        n1f n1fVar2 = (n1f) mj.p(obj2, j);
        int size = n1fVar.size();
        int size2 = n1fVar2.size();
        if (size > 0 && size2 > 0) {
            if (!n1fVar.zzc()) {
                n1fVar = n1fVar.zzd(size2 + size);
            }
            n1fVar.addAll(n1fVar2);
        }
        if (size > 0) {
            n1fVar2 = n1fVar;
        }
        mj.D(obj, j, n1fVar2);
    }
}
